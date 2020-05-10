package typingsSlinky.scBroker.mod

import typingsSlinky.scBroker.scbrokerMod.SCBrokerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerServerOptions extends js.Object {
  var brokerControllerPath: js.UndefOr[String] = js.native
  var brokerOptions: js.UndefOr[SCBrokerOptions] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var downgradeToUser: js.UndefOr[Double | String] = js.native
  var expiryAccuracy: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var inspect: js.UndefOr[Boolean] = js.native
  var instanceId: js.UndefOr[String] = js.native
  var ipcAckTimeout: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var processTermTimeout: js.UndefOr[Double] = js.native
  var secretKey: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
}

object SCBrokerServerOptions {
  @scala.inline
  def apply(): SCBrokerServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SCBrokerServerOptions]
  }
  @scala.inline
  implicit class SCBrokerServerOptionsOps[Self <: SCBrokerServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerControllerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerControllerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerControllerPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerControllerPath")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerOptions(value: SCBrokerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDowngradeToUser(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downgradeToUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDowngradeToUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downgradeToUser")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiryAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInspect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.undefined)
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
    def withIpcAckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcAckTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpcAckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcAckTimeout")(js.undefined)
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
    def withProcessTermTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processTermTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessTermTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processTermTimeout")(js.undefined)
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
  }
  
}

