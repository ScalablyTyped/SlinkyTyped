package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceCompliancePolicyDeviceStateSummary extends Entity {
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  // Number of devices that have compliance managed by System Center Configuration Manager
  var configManagerCount: js.UndefOr[Double] = js.native
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  // Number of error devices
  var errorDeviceCount: js.UndefOr[Double] = js.native
  // Number of devices that are in grace period
  var inGracePeriodCount: js.UndefOr[Double] = js.native
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}

object DeviceCompliancePolicyDeviceStateSummary {
  @scala.inline
  def apply(): DeviceCompliancePolicyDeviceStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicyDeviceStateSummary]
  }
  @scala.inline
  implicit class DeviceCompliancePolicyDeviceStateSummaryOps[Self <: DeviceCompliancePolicyDeviceStateSummary] (val x: Self) extends AnyVal {
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
    def withConfigManagerCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configManagerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigManagerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configManagerCount")(js.undefined)
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
    def withInGracePeriodCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGracePeriodCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInGracePeriodCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGracePeriodCount")(js.undefined)
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

