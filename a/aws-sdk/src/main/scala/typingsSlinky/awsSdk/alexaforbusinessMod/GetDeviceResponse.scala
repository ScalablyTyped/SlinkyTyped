package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceResponse extends js.Object {
  /**
    * The details of the device requested. Required.
    */
  var Device: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Device] = js.native
}

object GetDeviceResponse {
  @scala.inline
  def apply(): GetDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceResponse]
  }
  @scala.inline
  implicit class GetDeviceResponseOps[Self <: GetDeviceResponse] (val x: Self) extends AnyVal {
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

