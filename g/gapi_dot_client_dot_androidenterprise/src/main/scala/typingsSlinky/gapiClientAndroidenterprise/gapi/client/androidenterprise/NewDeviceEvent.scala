package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewDeviceEvent extends js.Object {
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Identifies the extent to which the device is controlled by an Android EMM in various deployment configurations.
    *
    * Possible values include:
    * - "managedDevice", a device where the DPC is set as device owner,
    * - "managedProfile", a device where the DPC is set as profile owner.
    */
  var managementType: js.UndefOr[String] = js.native
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[String] = js.native
}

object NewDeviceEvent {
  @scala.inline
  def apply(): NewDeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDeviceEvent]
  }
  @scala.inline
  implicit class NewDeviceEventOps[Self <: NewDeviceEvent] (val x: Self) extends AnyVal {
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
    def withManagementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

