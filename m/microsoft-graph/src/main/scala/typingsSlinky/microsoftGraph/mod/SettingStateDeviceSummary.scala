package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingStateDeviceSummary extends Entity {
  // Device Compliant count for the setting
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  // Device conflict error count for the setting
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  // Device error count for the setting
  var errorDeviceCount: js.UndefOr[Double] = js.native
  // Name of the InstancePath for the setting
  var instancePath: js.UndefOr[String] = js.native
  // Device NonCompliant count for the setting
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  // Device Not Applicable count for the setting
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  // Device Compliant count for the setting
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  // Name of the setting
  var settingName: js.UndefOr[String] = js.native
  // Device Unkown count for the setting
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}

object SettingStateDeviceSummary {
  @scala.inline
  def apply(): SettingStateDeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingStateDeviceSummary]
  }
  @scala.inline
  implicit class SettingStateDeviceSummaryOps[Self <: SettingStateDeviceSummary] (val x: Self) extends AnyVal {
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
    def withInstancePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePath")(js.undefined)
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

