package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualMFADeviceResponse extends js.Object {
  /**
    * A structure containing details about the new virtual MFA device.
    */
  var VirtualMFADevice: typingsSlinky.awsSdk.iamMod.VirtualMFADevice = js.native
}

object CreateVirtualMFADeviceResponse {
  @scala.inline
  def apply(VirtualMFADevice: VirtualMFADevice): CreateVirtualMFADeviceResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevice = VirtualMFADevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualMFADeviceResponse]
  }
  @scala.inline
  implicit class CreateVirtualMFADeviceResponseOps[Self <: CreateVirtualMFADeviceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualMFADevice(value: VirtualMFADevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualMFADevice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

