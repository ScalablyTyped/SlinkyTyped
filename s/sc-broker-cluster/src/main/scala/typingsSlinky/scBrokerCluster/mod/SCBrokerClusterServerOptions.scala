package typingsSlinky.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerClusterServerOptions extends js.Object {
  var appBrokerControllerPath: js.UndefOr[String] = js.native
  var brokerOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServerOptions */ js.Any
  ] = js.native
  var brokers: js.Array[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var downgradeToUser: Double | String = js.native
  var expiryAccuracy: js.UndefOr[Double] = js.native
  var inspect: js.UndefOr[Boolean] = js.native
  var instanceId: js.UndefOr[String] = js.native
  var ipcAckTimeout: js.UndefOr[Double] = js.native
  var processTermTimeout: js.UndefOr[Double] = js.native
  var secretKey: js.UndefOr[String] = js.native
}

object SCBrokerClusterServerOptions {
  @scala.inline
  def apply(brokers: js.Array[String], downgradeToUser: Double | String): SCBrokerClusterServerOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], downgradeToUser = downgradeToUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClusterServerOptions]
  }
  @scala.inline
  implicit class SCBrokerClusterServerOptionsOps[Self <: SCBrokerClusterServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDowngradeToUser(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downgradeToUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppBrokerControllerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBrokerControllerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBrokerControllerPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBrokerControllerPath")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServerOptions */ js.Any
    ): Self = {
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
  }
  
}

