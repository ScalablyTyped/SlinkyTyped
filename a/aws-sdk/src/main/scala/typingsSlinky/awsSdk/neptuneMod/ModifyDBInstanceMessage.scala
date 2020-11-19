package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorage(value: IntegerOptional): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAllowMajorVersionUpgrade(value: Boolean): Self = this.set("AllowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMajorVersionUpgrade: Self = this.set("AllowMajorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("ApplyImmediately", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCACertificateIdentifier(value: String): Self = this.set("CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCACertificateIdentifier: Self = this.set("CACertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCloudwatchLogsExportConfiguration(value: CloudwatchLogsExportConfiguration): Self = this.set("CloudwatchLogsExportConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLogsExportConfiguration: Self = this.set("CloudwatchLogsExportConfiguration", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: BooleanOptional): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDBParameterGroupName(value: String): Self = this.set("DBParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBParameterGroupName: Self = this.set("DBParameterGroupName", js.undefined)
    
    @scala.inline
    def setDBPortNumber(value: IntegerOptional): Self = this.set("DBPortNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBPortNumber: Self = this.set("DBPortNumber", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupsVarargs(value: String*): Self = this.set("DBSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setDBSecurityGroups(value: DBSecurityGroupNameList): Self = this.set("DBSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSecurityGroups: Self = this.set("DBSecurityGroups", js.undefined)
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSubnetGroupName: Self = this.set("DBSubnetGroupName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setDomainIAMRoleName(value: String): Self = this.set("DomainIAMRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainIAMRoleName: Self = this.set("DomainIAMRoleName", js.undefined)
    
    @scala.inline
    def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = this.set("EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIAMDatabaseAuthentication: Self = this.set("EnableIAMDatabaseAuthentication", js.undefined)
    
    @scala.inline
    def setEnablePerformanceInsights(value: BooleanOptional): Self = this.set("EnablePerformanceInsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePerformanceInsights: Self = this.set("EnablePerformanceInsights", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setIops(value: IntegerOptional): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
    
    @scala.inline
    def setMonitoringInterval(value: IntegerOptional): Self = this.set("MonitoringInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringInterval: Self = this.set("MonitoringInterval", js.undefined)
    
    @scala.inline
    def setMonitoringRoleArn(value: String): Self = this.set("MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringRoleArn: Self = this.set("MonitoringRoleArn", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    
    @scala.inline
    def setNewDBInstanceIdentifier(value: String): Self = this.set("NewDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewDBInstanceIdentifier: Self = this.set("NewDBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsKMSKeyId(value: String): Self = this.set("PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceInsightsKMSKeyId: Self = this.set("PerformanceInsightsKMSKeyId", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPromotionTier(value: IntegerOptional): Self = this.set("PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionTier: Self = this.set("PromotionTier", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: BooleanOptional): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    
    @scala.inline
    def setTdeCredentialArn(value: String): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    
    @scala.inline
    def setTdeCredentialPassword(value: String): Self = this.set("TdeCredentialPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdeCredentialPassword: Self = this.set("TdeCredentialPassword", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
}
