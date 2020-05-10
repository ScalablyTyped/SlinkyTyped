package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemWindowsConfiguration extends js.Object {
  /**
    * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when it's created.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typingsSlinky.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.native
  /**
    * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * Specifies the file system deployment type, valid values are the following:   MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones.   SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.   To learn more about high availability Multi-AZ file systems, see  High Availability for Amazon FSx for Windows File Server.
    */
  var DeploymentType: js.UndefOr[WindowsDeploymentType] = js.native
  /**
    * Required when DeploymentType is set to MULTI_AZ_1. This specifies the subnet in which you want the preferred file server to be located. For in-AWS applications, we recommend that you launch your clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ data transfer costs and minimize latency. 
    */
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.native
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[typingsSlinky.awsSdk.fsxMod.SelfManagedActiveDirectoryConfiguration] = js.native
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the nth increments, between 2^3 (8) and 2^11 (2048).
    */
  var ThroughputCapacity: MegabytesPerSecond = js.native
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object CreateFileSystemWindowsConfiguration {
  @scala.inline
  def apply(ThroughputCapacity: MegabytesPerSecond): CreateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal(ThroughputCapacity = ThroughputCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemWindowsConfiguration]
  }
  @scala.inline
  implicit class CreateFileSystemWindowsConfigurationOps[Self <: CreateFileSystemWindowsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThroughputCapacity(value: MegabytesPerSecond): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThroughputCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectoryId")(js.undefined)
        ret
    }
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
    def withCopyTagsToBackups(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTagsToBackups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTagsToBackups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTagsToBackups")(js.undefined)
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
    def withDeploymentType(value: WindowsDeploymentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentType")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredSubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredSubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryConfiguration): Self = {
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

