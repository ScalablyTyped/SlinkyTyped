package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceCompliancePolicySettingStateSummary extends Entity {
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  // Not yet documented
  var deviceComplianceSettingStates: js.UndefOr[js.Array[DeviceComplianceSettingState]] = js.native
  // Number of error devices
  var errorDeviceCount: js.UndefOr[Double] = js.native
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  /**
    * Setting platform. Possible values are: android, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater,
    * androidWorkProfile, all.
    */
  var platformType: js.UndefOr[PolicyPlatformType] = js.native
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  // The setting class name and property name.
  var setting: js.UndefOr[String] = js.native
  // Name of the setting.
  var settingName: js.UndefOr[String] = js.native
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}

object DeviceCompliancePolicySettingStateSummary {
  @scala.inline
  def apply(): DeviceCompliancePolicySettingStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicySettingStateSummary]
  }
  @scala.inline
  implicit class DeviceCompliancePolicySettingStateSummaryOps[Self <: DeviceCompliancePolicySettingStateSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompliantDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withConflictDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceComplianceSettingStates(value: js.Array[DeviceComplianceSettingState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceComplianceSettingStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceComplianceSettingStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceComplianceSettingStates")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNonCompliantDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNotApplicableDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicableDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotApplicableDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicableDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformType(value: PolicyPlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(js.undefined)
        ret
    }
    @scala.inline
    def withRemediatedDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediatedDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediatedDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediatedDeviceCount")(js.undefined)
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
    def withUnknownDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownDeviceCount")(js.undefined)
        ret
    }
  }
  
}

