package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfiguration extends Entity {
  // The list of assignments for the device configuration profile.
  var assignments: js.UndefOr[js.Array[DeviceConfigurationAssignment]] = js.native
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[String] = js.native
  // Device Configuration Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[js.Array[SettingStateDeviceSummary]] = js.native
  // Device Configuration devices status overview
  var deviceStatusOverview: js.UndefOr[DeviceConfigurationDeviceOverview] = js.native
  // Device configuration installation status by device.
  var deviceStatuses: js.UndefOr[js.Array[DeviceConfigurationDeviceStatus]] = js.native
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Device Configuration users status overview
  var userStatusOverview: js.UndefOr[DeviceConfigurationUserOverview] = js.native
  // Device configuration installation status by user.
  var userStatuses: js.UndefOr[js.Array[DeviceConfigurationUserStatus]] = js.native
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.native
}

object DeviceConfiguration {
  @scala.inline
  def apply(): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfiguration]
  }
  @scala.inline
  implicit class DeviceConfigurationOps[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: js.Array[DeviceConfigurationAssignment]): Self = {
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
    def withDeviceStatusOverview(value: DeviceConfigurationDeviceOverview): Self = {
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
    def withDeviceStatuses(value: js.Array[DeviceConfigurationDeviceStatus]): Self = {
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
    def withUserStatusOverview(value: DeviceConfigurationUserOverview): Self = {
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
    def withUserStatuses(value: js.Array[DeviceConfigurationUserStatus]): Self = {
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

