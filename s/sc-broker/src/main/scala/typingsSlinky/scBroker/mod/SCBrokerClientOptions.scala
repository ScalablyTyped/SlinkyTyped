package typingsSlinky.scBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerClientOptions extends js.Object {
  var autoReconnect: js.UndefOr[Boolean] = js.native
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
  var connectRetryErrorThreshold: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var pubSubBatchDuration: js.UndefOr[Double] = js.native
  var secretKey: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object SCBrokerClientOptions {
  @scala.inline
  def apply(): SCBrokerClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SCBrokerClientOptions]
  }
  @scala.inline
  implicit class SCBrokerClientOptionsOps[Self <: SCBrokerClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReconnectOptions(value: AutoReconnectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReconnectOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnectOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectRetryErrorThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRetryErrorThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectRetryErrorThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRetryErrorThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
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
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

