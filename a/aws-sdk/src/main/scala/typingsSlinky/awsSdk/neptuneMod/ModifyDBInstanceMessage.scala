package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBInstanceMessage extends js.Object {
  /**
    * The new amount of storage (in gibibytes) to allocate for the DB instance. Not applicable. Storage is managed by the DB Cluster.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB instance.  If this parameter is set to false, changes to the DB instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next call to RebootDBInstance, or the next failure reboot. Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    *  Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window. Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously applied as soon as possible. An outage will result if this parameter is set to true during the maintenance window, and a newer minor version is available, and Neptune has enabled auto patching for that engine version.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Default: Uses existing setting
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates the certificate that needs to be associated with the instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance or DB cluster.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.CloudwatchLogsExportConfiguration] = js.native
  /**
    * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is false.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * The new compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions. If you modify the DB instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is specified as true for this request. Default: Uses existing setting
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied until you reboot the instance without failover. The db instance will NOT be rebooted automatically and the parameter changes will NOT be applied during the next maintenance window. Default: Uses existing setting Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The port number on which the database accepts connections. The value of the DBPortNumber parameter must not match any of the port values specified for options in the option group for the DB instance. Your database will restart when you change the DBPortNumber value regardless of the value of the ApplyImmediately parameter.  Default: 8182 
    */
  var DBPortNumber: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage and the change is asynchronously applied as soon as possible. Constraints:   If supplied, must match existing DBSecurityGroups.  
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.native
  /**
    * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different VPC. Changing the subnet group causes an outage during the change. The change is applied during the next maintenance window, unless you specify true for the ApplyImmediately parameter. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetGroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. See Deleting a DB Instance.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * Not supported.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * Not supported
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  /**
    * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. You can enable IAM database authentication for the following database engines Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information, see ModifyDBCluster. Default: false 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.native
  /**
    * The version number of the database engine to upgrade to. Currently, setting this parameter has no effect. To upgrade your database engine to the most recent release, use the ApplyPendingMaintenanceAction API.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The new Provisioned IOPS (I/O operations per second) value for the instance. Changing this setting doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request. Default: Uses existing setting
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    * Not supported.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Not applicable.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  /**
    * The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true for this request.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier, an instance reboot will occur immediately if you set Apply Immediately to true, or will occur during the next maintenance window if Apply Immediately to false. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var NewDBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  /**
    *  The daily time range during which automated backups are created if automated backups are enabled. Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   Must be in the format hh24:mi-hh24:mi   Must be in Universal Time Coordinated (UTC)   Must not conflict with the preferred maintenance window   Must be at least 30 minutes  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, then changing this parameter will cause a reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid Values: 0 - 15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * This flag should no longer be used.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  /**
    * Not supported.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.native
  /**
    * The password for the given ARN from the key store in order to access the device.
    */
  var TdeCredentialPassword: js.UndefOr[String] = js.native
  /**
    * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon as possible. Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   If supplied, must match existing VpcSecurityGroupIds.  
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object ModifyDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): ModifyDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBInstanceMessage]
  }
  @scala.inline
  implicit class ModifyDBInstanceMessageOps[Self <: ModifyDBInstanceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocatedStorage(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMajorVersionUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMajorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMajorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMajorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMinorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupRetentionPeriod(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withCACertificateIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CACertificateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCACertificateIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CACertificateIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLogsExportConfiguration(value: CloudwatchLogsExportConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudwatchLogsExportConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogsExportConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudwatchLogsExportConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyTagsToSnapshot(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTagsToSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTagsToSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTagsToSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDBParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDBPortNumber(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBPortNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBPortNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBPortNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSecurityGroups(value: DBSecurityGroupNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionProtection(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainIAMRoleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainIAMRoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainIAMRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainIAMRoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableIAMDatabaseAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableIAMDatabaseAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableIAMDatabaseAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePerformanceInsights(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePerformanceInsights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePerformanceInsights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePerformanceInsights")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIops(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iops")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseModel")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUserPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringInterval(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiAZ(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiAZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(js.undefined)
        ret
    }
    @scala.inline
    def withNewDBInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewDBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewDBInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewDBInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceInsightsKMSKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceInsightsKMSKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceInsightsKMSKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceInsightsKMSKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredBackupWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredBackupWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionTier(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PromotionTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PromotionTier")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(js.undefined)
        ret
    }
    @scala.inline
    def withTdeCredentialArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdeCredentialArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdeCredentialArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdeCredentialArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTdeCredentialPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdeCredentialPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdeCredentialPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TdeCredentialPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

