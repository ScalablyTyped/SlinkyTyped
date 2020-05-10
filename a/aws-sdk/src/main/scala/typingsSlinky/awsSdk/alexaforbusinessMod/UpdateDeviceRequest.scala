package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceRequest extends js.Object {
  /**
    * The ARN of the device to update. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  /**
    * The updated device name. Required.
    */
  var DeviceName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DeviceName] = js.native
}

object UpdateDeviceRequest {
  @scala.inline
  def apply(): UpdateDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceRequest]
  }
  @scala.inline
  implicit class UpdateDeviceRequestOps[Self <: UpdateDeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: DeviceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(js.undefined)
        ret
    }
  }
  
}

