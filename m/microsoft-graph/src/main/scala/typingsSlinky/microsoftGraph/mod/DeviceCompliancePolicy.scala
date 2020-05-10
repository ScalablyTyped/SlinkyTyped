package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceCompliancePolicy extends Entity {
  // The collection of assignments for this compliance policy.
  var assignments: js.UndefOr[js.Array[DeviceCompliancePolicyAssignment]] = js.native
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[String] = js.native
  // Compliance Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[js.Array[SettingStateDeviceSummary]] = js.native
  // Device compliance devices status overview
  var deviceStatusOverview: js.UndefOr[DeviceComplianceDeviceOverview] = js.native
  // List of DeviceComplianceDeviceStatus.
  var deviceStatuses: js.UndefOr[js.Array[DeviceComplianceDeviceStatus]] = js.native
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // The list of scheduled action for this rule
  var scheduledActionsForRule: js.UndefOr[js.Array[DeviceComplianceScheduledActionForRule]] = js.native
  // Device compliance users status overview
  var userStatusOverview: js.UndefOr[DeviceComplianceUserOverview] = js.native
  // List of DeviceComplianceUserStatus.
  var userStatuses: js.UndefOr[js.Array[DeviceComplianceUserStatus]] = js.native
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.native
}

object DeviceCompliancePolicy {
  @scala.inline
  def apply(): DeviceCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicy]
  }
  @scala.inline
  implicit class DeviceCompliancePolicyOps[Self <: DeviceCompliancePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: js.Array[DeviceCompliancePolicyAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSettingStateSummaries(value: js.Array[SettingStateDeviceSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSettingStateSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSettingStateSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSettingStateSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceStatusOverview(value: DeviceComplianceDeviceOverview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStatusOverview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStatusOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStatusOverview")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceStatuses(value: js.Array[DeviceComplianceDeviceStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStatuses")(js.undefined)
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
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledActionsForRule(value: js.Array[DeviceComplianceScheduledActionForRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledActionsForRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledActionsForRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledActionsForRule")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStatusOverview(value: DeviceComplianceUserOverview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStatusOverview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStatusOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStatusOverview")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStatuses(value: js.Array[DeviceComplianceUserStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

