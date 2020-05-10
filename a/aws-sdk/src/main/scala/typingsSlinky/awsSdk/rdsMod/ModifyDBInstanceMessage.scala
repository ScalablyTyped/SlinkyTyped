package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBInstanceMessage extends js.Object {
  /**
    * The new amount of storage (in gibibytes) to allocate for the DB instance.  For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10% greater than the current value.  For the valid values for allocated storage for each engine, see CreateDBInstance. 
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that indicates whether major version upgrades are allowed. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible. Constraints: Major version upgrades must be allowed when specifying a value for the EngineVersion parameter that is a different major version than the DB instance's current version.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB instance. By default, this parameter is disabled.   If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next call to RebootDBInstance, or the next failure reboot. Review the table of parameters in Modifying a DB Instance in the Amazon RDS User Guide. to see the impact of enabling or disabling ApplyImmediately for each modified parameter and to determine when the changes are applied. 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    *  A value that indicates whether minor version upgrades are applied automatically to the DB instance during the maintenance window. Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously applied as soon as possible. An outage results if this parameter is enabled during the maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that engine version. 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * The number of days to retain automated backups. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups. Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a non-zero value to 0. These changes are applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the change is asynchronously applied as soon as possible.  Amazon Aurora  Not applicable. The retention period for automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Default: Uses existing setting Constraints:   Must be a value from 0 to 35   Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6 or later   Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5   Can't be set to 0 if the DB instance is a source to Read Replicas  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates the certificate that needs to be associated with the instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB instance is restarted when you rotate your SSL/TLS certificate. By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated until the DB instance is restarted.  Set this parameter only if you are not using SSL/TLS to connect to the DB instance.  If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to rotate your SSL/TLS certificate:   For more information about rotating your SSL/TLS certificate for RDS DB engines, see  Rotating Your SSL/TLS Certificate. in the Amazon RDS User Guide.    For more information about rotating your SSL/TLS certificate for Aurora DB engines, see  Rotating Your SSL/TLS Certificate in the Amazon Aurora User Guide.   
    */
  var CertificateRotationRestart: js.UndefOr[BooleanOptional] = js.native
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB instance. A change to the CloudwatchLogsExportConfiguration parameter is always applied to the DB instance immediately. Therefore, the ApplyImmediately parameter has no effect.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typingsSlinky.awsSdk.rdsMod.CloudwatchLogsExportConfiguration] = js.native
  /**
    * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags are not copied.  Amazon Aurora  Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see ModifyDBCluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * The new compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  If you modify the DB instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is enabled for this request.  Default: Uses existing setting
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied until you reboot the instance without failover. In this case, the DB instance isn't rebooted automatically and the parameter changes isn't applied during the next maintenance window. Default: Uses existing setting Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The port number on which the database accepts connections. The value of the DBPortNumber parameter must not match any of the port values specified for options in the option group for the DB instance. Your database will restart when you change the DBPortNumber value regardless of the value of the ApplyImmediately parameter.  MySQL   Default: 3306   Valid Values: 1150-65535   MariaDB   Default: 3306   Valid Values: 1150-65535   PostgreSQL   Default: 5432   Valid Values: 1150-65535  Type: Integer  Oracle   Default: 1521   Valid Values: 1150-65535   SQL Server   Default: 1433   Valid Values: 1150-65535 except for 1434, 3389, 47001, 49152, and 49152 through 49156.   Amazon Aurora   Default: 3306   Valid Values: 1150-65535 
    */
  var DBPortNumber: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage and the change is asynchronously applied as soon as possible. Constraints:   If supplied, must match existing DBSecurityGroups.  
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.native
  /**
    * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For more information, see Updating the VPC for a DB Instance in the Amazon RDS User Guide.  Changing the subnet group causes an outage during the change. The change is applied during the next maintenance window, unless you enable ApplyImmediately.  Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetGroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Active Directory directory ID to move the DB instance to. Specify none to remove the instance from its current domain. The domain must be created prior to this operation. Currently, only Microsoft SQL Server and Oracle DB instances can be created in an Active Directory Domain.  For Microsoft SQL Server DB instances, Amazon RDS can use Windows Authentication to authenticate users that connect to the DB instance. For more information, see  Using Windows Authentication with an Amazon RDS DB Instance Running Microsoft SQL Server in the Amazon RDS User Guide. For Oracle DB instances, Amazon RDS can use Kerberos Authentication to authenticate users that connect to the DB instance. For more information, see  Using Kerberos Authentication with Amazon RDS for Oracle in the Amazon RDS User Guide.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * The name of the IAM role to use when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For information about the supported DB engines, see CreateDBInstance. For more information about IAM database authentication, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether to enable Performance Insights for the DB instance. For more information, see Using Amazon Performance Insights in the Amazon Relational Database Service User Guide. 
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The version number of the database engine to upgrade to. Changing this parameter results in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is eanbled for this request.  For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the default for that DB parameter group family. For information about valid engine versions, see CreateDBInstance, or call DescribeDBEngineVersions.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.  Changing this setting doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. If you are migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change in storage type to take effect.  If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24 hours, but the process can take up to several days in some cases. During the migration, the DB instance is available for use, but might experience performance degradation. While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the instance.  Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL, the value supplied must be at least 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded up so that they are 10% greater than the current value.  Default: Uses existing setting
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    * The license model for the DB instance. Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * The new password for the master user. The password can include any printable ASCII character except "/", """, or "@".  Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible. Between the time of the request and the completion of the request, the MasterUserPassword element exists in the PendingModifiedValues element of the operation response.   Amazon Aurora  Not applicable. The password for the master user is managed by the DB cluster. For more information, see ModifyDBCluster.  Default: Uses existing setting  MariaDB  Constraints: Must contain from 8 to 41 characters.  Microsoft SQL Server  Constraints: Must contain from 8 to 128 characters.  MySQL  Constraints: Must contain from 8 to 41 characters.  Oracle  Constraints: Must contain from 8 to 30 characters.  PostgreSQL  Constraints: Must contain from 8 to 128 characters.  Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary instance user if the password is lost. This includes restoring privileges that might have been accidentally revoked.  
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  /**
    * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, go to To create an IAM role for Amazon RDS Enhanced Monitoring in the Amazon RDS User Guide.  If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and the change is applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier, an instance reboot occurs immediately if you enable ApplyImmediately, or will occur during the next maintenance window if you disable Apply Immediately. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var NewDBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  Indicates that the DB instance should be associated with the specified option group. Changing this parameter doesn't result in an outage except in the following case and the change is applied during the next maintenance window unless the ApplyImmediately parameter is enabled for this request. If the parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new connections are rejected but existing connections are not interrupted.  Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon RDS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  /**
    * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    *  The daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod parameter. Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.   Amazon Aurora  Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   Must be in the format hh24:mi-hh24:mi   Must be in Universal Time Coordinated (UTC)   Must not conflict with the preferred maintenance window   Must be at least 30 minutes  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, then changing this parameter will cause a reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide.  Default: 1 Valid Values: 0 - 15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, it is an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. When the DB instance isn't publicly accessible, it is an internal instance with a DNS name that resolves to a private IP address.   PubliclyAccessible only applies to DB instances in a VPC. The DB instance must be part of a public subnet and PubliclyAccessible must be enabled for it to be publicly accessible.  Changes to the PubliclyAccessible parameter are applied immediately regardless of the value of the ApplyImmediately parameter.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  /**
    * Specifies the storage type to be associated with the DB instance.  If you specify Provisioned IOPS (io1), you must also include a value for the Iops parameter.  If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24 hours, but the process can take up to several days in some cases. During the migration, the DB instance is available for use, but might experience performance degradation. While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the instance.   Valid values: standard | gp2 | io1  Default: io1 if the Iops parameter is specified, otherwise gp2 
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
    * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
    */
  var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.native
  /**
    * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon as possible.  Amazon Aurora  Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more information, see ModifyDBCluster. Constraints:   If supplied, must match existing VpcSecurityGroupIds.  
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
    def withCertificateRotationRestart(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateRotationRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateRotationRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateRotationRestart")(js.undefined)
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
    def withMaxAllocatedStorage(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAllocatedStorage")(js.undefined)
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
    def withPerformanceInsightsRetentionPeriod(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceInsightsRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceInsightsRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceInsightsRetentionPeriod")(js.undefined)
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
    def withProcessorFeatures(value: ProcessorFeatureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessorFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessorFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessorFeatures")(js.undefined)
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
    def withUseDefaultProcessorFeatures(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseDefaultProcessorFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefaultProcessorFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseDefaultProcessorFeatures")(js.undefined)
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

