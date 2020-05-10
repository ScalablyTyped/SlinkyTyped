package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceComplianceSettingState extends Entity {
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  // The Device Id that is being reported
  var deviceId: js.UndefOr[String] = js.native
  // The device model that is being reported
  var deviceModel: js.UndefOr[String] = js.native
  // The Device Name that is being reported
  var deviceName: js.UndefOr[String] = js.native
  // The setting class name and property name.
  var setting: js.UndefOr[String] = js.native
  // The Setting Name that is being reported
  var settingName: js.UndefOr[String] = js.native
  /**
    * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant,
    * error, conflict, notAssigned.
    */
  var state: js.UndefOr[ComplianceStatus] = js.native
  // The User email address that is being reported
  var userEmail: js.UndefOr[String] = js.native
  // The user Id that is being reported
  var userId: js.UndefOr[String] = js.native
  // The User Name that is being reported
  var userName: js.UndefOr[String] = js.native
  // The User PrincipalName that is being reported
  var userPrincipalName: js.UndefOr[String] = js.native
}

object DeviceComplianceSettingState {
  @scala.inline
  def apply(): DeviceComplianceSettingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceSettingState]
  }
  @scala.inline
  implicit class DeviceComplianceSettingStateOps[Self <: DeviceComplianceSettingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceGracePeriodExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceGracePeriodExpirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceGracePeriodExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceGracePeriodExpirationDateTime")(js.undefined)
        ret
    }
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
    def withDeviceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(js.undefined)
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
    def withSetting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ComplianceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(js.undefined)
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
    @scala.inline
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
  }
  
}

