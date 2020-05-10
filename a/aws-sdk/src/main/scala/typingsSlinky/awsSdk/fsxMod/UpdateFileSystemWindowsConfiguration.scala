package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemWindowsConfiguration extends js.Object {
  /**
    * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typingsSlinky.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * The preferred time to take daily automatic backups, in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD directory.
    */
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.native
  /**
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object UpdateFileSystemWindowsConfiguration {
  @scala.inline
  def apply(): UpdateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
  }
  @scala.inline
  implicit class UpdateFileSystemWindowsConfigurationOps[Self <: UpdateFileSystemWindowsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticBackupRetentionDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticBackupRetentionDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticBackupRetentionDays")(js.undefined)
        ret
    }
    @scala.inline
    def withDailyAutomaticBackupStartTime(value: DailyTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyAutomaticBackupStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyAutomaticBackupStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyAutomaticBackupStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryConfigurationUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelfManagedActiveDirectoryConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfManagedActiveDirectoryConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelfManagedActiveDirectoryConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeklyMaintenanceStartTime(value: WeeklyTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeeklyMaintenanceStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeklyMaintenanceStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeeklyMaintenanceStartTime")(js.undefined)
        ret
    }
  }
  
}

