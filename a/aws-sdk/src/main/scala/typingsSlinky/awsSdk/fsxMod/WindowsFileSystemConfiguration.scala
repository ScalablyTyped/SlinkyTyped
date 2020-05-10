package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsFileSystemConfiguration extends js.Object {
  /**
    * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typingsSlinky.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.native
  /**
    * The preferred time to take daily automatic backups, in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * Specifies the file system deployment type, valid values are the following:    MULTI_AZ_1 - Specifies a high availability file system that is configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability.    SINGLE_AZ_1 - (Default) Specifies a file system that is configured for single AZ redundancy.  
    */
  var DeploymentType: js.UndefOr[WindowsDeploymentType] = js.native
  /**
    * The list of maintenance operations in progress for this file system.
    */
  var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.native
  /**
    * For MULTI_AZ_1 deployment types, the IP address of the primary, or preferred, file server. Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not joined to a Microsoft Active Directory. Applicable for both SINGLE_AZ_1 and MULTI_AZ_1 deployment types. This IP address is temporarily unavailable when the file system is undergoing maintenance. For Linux and Windows SMB clients that are joined to an Active Directory, use the file system's DNSName instead. For more information and instruction on mapping and mounting file shares, see https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html.
    */
  var PreferredFileServerIp: js.UndefOr[IpAddress] = js.native
  /**
    * For MULTI_AZ_1 deployment types, it specifies the ID of the subnet where the preferred file server is located. Must be one of the two subnet IDs specified in SubnetIds property. Amazon FSx serves traffic from this subnet except in the event of a failover to the secondary file server. For SINGLE_AZ_1 deployment types, this value is the same as that for SubnetIDs.
    */
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.native
  /**
    * For MULTI_AZ_1 deployment types, use this endpoint when performing administrative tasks on the file system using Amazon FSx Remote PowerShell. For SINGLE_AZ_1 deployment types, this is the DNS name of the file system. This endpoint is temporarily unavailable when the file system is undergoing maintenance.
    */
  var RemoteAdministrationEndpoint: js.UndefOr[DNSName] = js.native
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.native
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.native
  /**
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object WindowsFileSystemConfiguration {
  @scala.inline
  def apply(): WindowsFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsFileSystemConfiguration]
  }
  @scala.inline
  implicit class WindowsFileSystemConfigurationOps[Self <: WindowsFileSystemConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMaintenanceOperationsInProgress(value: FileSystemMaintenanceOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceOperationsInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceOperationsInProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceOperationsInProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredFileServerIp(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredFileServerIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredFileServerIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredFileServerIp")(js.undefined)
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
    def withRemoteAdministrationEndpoint(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteAdministrationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAdministrationEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteAdministrationEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryAttributes): Self = {
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
    def withThroughputCapacity(value: MegabytesPerSecond): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThroughputCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThroughputCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThroughputCapacity")(js.undefined)
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

