package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeviceResponse extends js.Object {
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Device] = js.native
}

object DeleteDeviceResponse {
  @scala.inline
  def apply(): DeleteDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeviceResponse]
  }
  @scala.inline
  implicit class DeleteDeviceResponseOps[Self <: DeleteDeviceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Device")(js.undefined)
        ret
    }
  }
  
}

