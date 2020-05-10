package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedDeviceMobileAppConfiguration extends Entity {
  // The list of group assignemenets for app configration.
  var assignments: js.UndefOr[js.Array[ManagedDeviceMobileAppConfigurationAssignment]] = js.native
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[String] = js.native
  // App configuration device status summary.
  var deviceStatusSummary: js.UndefOr[ManagedDeviceMobileAppConfigurationDeviceSummary] = js.native
  // List of ManagedDeviceMobileAppConfigurationDeviceStatus.
  var deviceStatuses: js.UndefOr[js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]] = js.native
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // the associated app.
  var targetedMobileApps: js.UndefOr[js.Array[String]] = js.native
  // App configuration user status summary.
  var userStatusSummary: js.UndefOr[ManagedDeviceMobileAppConfigurationUserSummary] = js.native
  // List of ManagedDeviceMobileAppConfigurationUserStatus.
  var userStatuses: js.UndefOr[js.Array[ManagedDeviceMobileAppConfigurationUserStatus]] = js.native
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.native
}

object ManagedDeviceMobileAppConfiguration {
  @scala.inline
  def apply(): ManagedDeviceMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfiguration]
  }
  @scala.inline
  implicit class ManagedDeviceMobileAppConfigurationOps[Self <: ManagedDeviceMobileAppConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: js.Array[ManagedDeviceMobileAppConfigurationAssignment]): Self = {
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
    def withDeviceStatusSummary(value: ManagedDeviceMobileAppConfigurationDeviceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStatusSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStatusSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStatusSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceStatuses(value: js.Array[ManagedDeviceMobileAppConfigurationDeviceStatus]): Self = {
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
    def withTargetedMobileApps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedMobileApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetedMobileApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedMobileApps")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStatusSummary(value: ManagedDeviceMobileAppConfigurationUserSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStatusSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStatusSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStatusSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStatuses(value: js.Array[ManagedDeviceMobileAppConfigurationUserStatus]): Self = {
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

