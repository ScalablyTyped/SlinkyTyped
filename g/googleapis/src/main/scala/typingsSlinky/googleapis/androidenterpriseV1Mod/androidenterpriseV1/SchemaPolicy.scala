package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device policy for a given managed device.
  */
@js.native
trait SchemaPolicy extends js.Object {
  /**
    * The auto-update policy for apps installed on the device.
    * &quot;choiceToTheUser&quot; allows the device&#39;s user to configure the
    * app update policy. &quot;always&quot; enables auto updates.
    * &quot;never&quot; disables auto updates. &quot;wifiOnly&quot; enables
    * auto updates only when the device is connected to wifi.
    */
  var autoUpdatePolicy: js.UndefOr[String] = js.native
  /**
    * The maintenance window defining when apps running in the foreground
    * should be updated.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.native
  /**
    * The availability granted to the device for the specified products.
    * &quot;all&quot; gives the device access to all products, regardless of
    * approval status. &quot;all&quot; does not enable automatic visibility of
    * &quot;alpha&quot; or &quot;beta&quot; tracks. &quot;whitelist&quot;
    * grants the device access the products specified in productPolicy[]. Only
    * products that are approved or products that were previously approved
    * (products with revoked approval) by the enterprise can be whitelisted. If
    * no value is provided, the availability set at the user level is applied
    * by default.
    */
  var productAvailabilityPolicy: js.UndefOr[String] = js.native
  /**
    * The list of product policies.
    */
  var productPolicy: js.UndefOr[js.Array[SchemaProductPolicy]] = js.native
}

object SchemaPolicy {
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  @scala.inline
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdatePolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdatePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdatePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdatePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindow(value: SchemaMaintenanceWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withProductAvailabilityPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAvailabilityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductAvailabilityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAvailabilityPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withProductPolicy(value: js.Array[SchemaProductPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productPolicy")(js.undefined)
        ret
    }
  }
  
}

