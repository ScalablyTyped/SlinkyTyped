package typingsSlinky.sccBrokerClient.mod

import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.simple
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCCBrokerClientOptions extends js.Object {
  var authKey: js.UndefOr[Secret] = js.native
  var brokerRetryDelay: js.UndefOr[Double] = js.native
  var clientPoolSize: js.UndefOr[Double] = js.native
  var instanceId: js.UndefOr[String] = js.native
  var instanceIp: js.UndefOr[String] = js.native
  var instanceIpFamily: js.UndefOr[String] = js.native
  var instancePort: js.UndefOr[Double] = js.native
  var mappingEngine: js.UndefOr[skeletonRendezvous | simple | MappingEngine] = js.native
  var noErrorLogging: js.UndefOr[Boolean] = js.native
  var pubSubBatchDuration: js.UndefOr[Double] = js.native
  var stateServerAckTimeout: js.UndefOr[Double] = js.native
  var stateServerConnectTimeout: js.UndefOr[Double] = js.native
  var stateServerHost: String = js.native
  var stateServerPort: js.UndefOr[Double] = js.native
  var stateServerReconnectRandomness: js.UndefOr[Double] = js.native
}

object SCCBrokerClientOptions {
  @scala.inline
  def apply(stateServerHost: String): SCCBrokerClientOptions = {
    val __obj = js.Dynamic.literal(stateServerHost = stateServerHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCCBrokerClientOptions]
  }
  @scala.inline
  implicit class SCCBrokerClientOptionsOps[Self <: SCCBrokerClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateServerHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthKey(value: Secret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerRetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerRetryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withClientPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPoolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientPoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPoolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIp")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIpFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIpFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIpFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceIpFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancePort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePort")(js.undefined)
        ret
    }
    @scala.inline
    def withMappingEngine(value: skeletonRendezvous | simple | MappingEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMappingEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withNoErrorLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noErrorLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoErrorLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noErrorLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withPubSubBatchDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubSubBatchDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubSubBatchDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubSubBatchDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withStateServerAckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerAckTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateServerAckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerAckTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStateServerConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerConnectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateServerConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerConnectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStateServerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateServerPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerPort")(js.undefined)
        ret
    }
    @scala.inline
    def withStateServerReconnectRandomness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerReconnectRandomness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateServerReconnectRandomness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateServerReconnectRandomness")(js.undefined)
        ret
    }
  }
  
}

