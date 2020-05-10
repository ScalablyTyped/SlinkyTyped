package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareUpdateStatusSummary extends Entity {
  // Number of compliant devices.
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  // Number of compliant users.
  var compliantUserCount: js.UndefOr[Double] = js.native
  // Number of conflict devices.
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  // Number of conflict users.
  var conflictUserCount: js.UndefOr[Double] = js.native
  // The name of the policy.
  var displayName: js.UndefOr[String] = js.native
  // Number of devices had error.
  var errorDeviceCount: js.UndefOr[Double] = js.native
  // Number of users had error.
  var errorUserCount: js.UndefOr[Double] = js.native
  // Number of non compliant devices.
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  // Number of non compliant users.
  var nonCompliantUserCount: js.UndefOr[Double] = js.native
  // Number of not applicable devices.
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  // Number of not applicable users.
  var notApplicableUserCount: js.UndefOr[Double] = js.native
  // Number of remediated devices.
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  // Number of remediated users.
  var remediatedUserCount: js.UndefOr[Double] = js.native
  // Number of unknown devices.
  var unknownDeviceCount: js.UndefOr[Double] = js.native
  // Number of unknown users.
  var unknownUserCount: js.UndefOr[Double] = js.native
}

object SoftwareUpdateStatusSummary {
  @scala.inline
  def apply(): SoftwareUpdateStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareUpdateStatusSummary]
  }
  @scala.inline
  implicit class SoftwareUpdateStatusSummaryOps[Self <: SoftwareUpdateStatusSummary] (val x: Self) extends AnyVal {
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
    def withCompliantUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantUserCount")(js.undefined)
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
    def withConflictUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictUserCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
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
    def withErrorUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorUserCount")(js.undefined)
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
    def withNonCompliantUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantUserCount")(js.undefined)
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
    def withNotApplicableUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicableUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotApplicableUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicableUserCount")(js.undefined)
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
    def withRemediatedUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediatedUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediatedUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediatedUserCount")(js.undefined)
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
    @scala.inline
    def withUnknownUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownUserCount")(js.undefined)
        ret
    }
  }
  
}

