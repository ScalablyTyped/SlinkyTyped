package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnclaimDeviceRequest extends js.Object {
  /** The device ID returned by `ClaimDevice`. */
  var deviceId: js.UndefOr[String] = js.native
  /** The device identifier you used when you claimed this device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  /** The section type to unclaim for. */
  var sectionType: js.UndefOr[String] = js.native
}

object UnclaimDeviceRequest {
  @scala.inline
  def apply(): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
  @scala.inline
  implicit class UnclaimDeviceRequestOps[Self <: UnclaimDeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceIdentifier(value: DeviceIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionType")(js.undefined)
        ret
    }
  }
  
}

