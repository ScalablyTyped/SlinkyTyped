package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInstallState extends Entity {
  // Device Id.
  var deviceId: js.UndefOr[String] = js.native
  // Device name.
  var deviceName: js.UndefOr[String] = js.native
  // The error code for install failures.
  var errorCode: js.UndefOr[String] = js.native
  /**
    * The install state of the eBook. Possible values are: notApplicable, installed, failed, notInstalled, uninstallFailed,
    * unknown.
    */
  var installState: js.UndefOr[InstallState] = js.native
  // Last sync date and time.
  var lastSyncDateTime: js.UndefOr[String] = js.native
  // OS Description.
  var osDescription: js.UndefOr[String] = js.native
  // OS Version.
  var osVersion: js.UndefOr[String] = js.native
  // Device User Name.
  var userName: js.UndefOr[String] = js.native
}

object DeviceInstallState {
  @scala.inline
  def apply(): DeviceInstallState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInstallState]
  }
  @scala.inline
  implicit class DeviceInstallStateOps[Self <: DeviceInstallState] (val x: Self) extends AnyVal {
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
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallState(value: InstallState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installState")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOsDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

