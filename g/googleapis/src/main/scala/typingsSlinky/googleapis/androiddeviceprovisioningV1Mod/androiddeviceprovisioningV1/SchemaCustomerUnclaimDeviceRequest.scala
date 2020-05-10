package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to unclaim a device.
  */
@js.native
trait SchemaCustomerUnclaimDeviceRequest extends js.Object {
  /**
    * Required. The device to unclaim.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}

object SchemaCustomerUnclaimDeviceRequest {
  @scala.inline
  def apply(): SchemaCustomerUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerUnclaimDeviceRequest]
  }
  @scala.inline
  implicit class SchemaCustomerUnclaimDeviceRequestOps[Self <: SchemaCustomerUnclaimDeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

