package org.apache.rocketmq.namesrv;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.rocketmq.common.namesrv.NamesrvConfig;
import org.apache.rocketmq.remoting.netty.NettyServerConfig;

/**
 * @author hongchen
 * @date 2021/7/14
 */
public class NameStart {

    public static void main(String[] args) throws Exception {
        final NettyServerConfig nettyServerConfig = new NettyServerConfig();
        final NamesrvConfig namesrvConfig = new NamesrvConfig();
        nettyServerConfig.setListenPort(9876);
        NamesrvController nameSrvController = new NamesrvController(namesrvConfig, nettyServerConfig);
        nameSrvController.initialize();
        nameSrvController.start();
        Thread.sleep(DateUtils.MILLIS_PER_DAY);
    }
}
