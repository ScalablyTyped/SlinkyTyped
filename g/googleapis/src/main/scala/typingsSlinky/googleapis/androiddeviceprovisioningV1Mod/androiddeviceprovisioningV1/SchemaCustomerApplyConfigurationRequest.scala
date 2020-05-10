package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to assign a configuration to device.
  */
@js.native
trait SchemaCustomerApplyConfigurationRequest extends js.Object {
  /**
    * Required. The configuration applied to the device in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    */
  var configuration: js.UndefOr[String] = js.native
  /**
    * Required. The device the configuration is applied to.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}

object SchemaCustomerApplyConfigurationRequest {
  @scala.inline
  def apply(): SchemaCustomerApplyConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerApplyConfigurationRequest]
  }
  @scala.inline
  implicit class SchemaCustomerApplyConfigurationRequestOps[Self <: SchemaCustomerApplyConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: SchemaDeviceReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
  }
  
}

