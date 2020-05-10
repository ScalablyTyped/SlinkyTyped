package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminGetDeviceResponse extends js.Object {
  /**
    * The device.
    */
  var Device: DeviceType = js.native
}

object AdminGetDeviceResponse {
  @scala.inline
  def apply(Device: DeviceType): AdminGetDeviceResponse = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetDeviceResponse]
  }
  @scala.inline
  implicit class AdminGetDeviceResponseOps[Self <: AdminGetDeviceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: DeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Device")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

