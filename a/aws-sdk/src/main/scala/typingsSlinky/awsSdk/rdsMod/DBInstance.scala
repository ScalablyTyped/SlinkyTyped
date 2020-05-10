package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstance extends js.Object {
  /**
    * Specifies the allocated storage size specified in gibibytes.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    *  The AWS Identity and Access Management (IAM) roles associated with the DB instance. 
    */
  var AssociatedRoles: js.UndefOr[DBInstanceRoles] = js.native
  /**
    * Indicates that minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the name of the Availability Zone the DB instance is located in.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * If present, specifies the name of the character set that this instance is associated with.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
  /**
    * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.  Amazon Aurora  Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see DBCluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  var DBInstanceArn: js.UndefOr[String] = js.native
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this database.
    */
  var DBInstanceStatus: js.UndefOr[String] = js.native
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL, MariaDB, SQL Server, PostgreSQL  Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance. Type: String  Oracle  Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not apply to an Oracle DB instance.
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.native
  /**
    *  A list of DB security group elements containing DBSecurityGroup.Name and DBSecurityGroup.Status subelements. 
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.native
  /**
    * Specifies information on the subnet group associated with the DB instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBSubnetGroup] = js.native
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.native
  /**
    * Indicates if the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  /**
    * The Active Directory Domain membership records associated with the DB instance.
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.native
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs. Log types vary by DB engine. For information about the log types for each DB engine, see Amazon RDS Database Log Files in the Amazon RDS User Guide. 
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[typingsSlinky.awsSdk.rdsMod.Endpoint] = js.native
  /**
    * Provides the name of the database engine to be used for this DB instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring metrics data for the DB instance.
    */
  var EnhancedMonitoringResourceArn: js.UndefOr[String] = js.native
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false. IAM database authentication can be enabled for the following database engines   For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher   Aurora 5.6 or higher. To enable IAM database authentication for Aurora, see DBCluster Type.  
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Provides the date and time the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    *  If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[js.Date] = js.native
  /**
    * License model information for this DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Specifies the listener connection endpoint for SQL Server Always On.
    */
  var ListenerEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * Contains the master username for the DB instance.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  /**
    * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    * Provides the list of option group memberships for this DB instance.
    */
  var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.native
  /**
    * Specifies that changes to the DB instance are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typingsSlinky.awsSdk.rdsMod.PendingModifiedValues] = js.native
  /**
    * True if Performance Insights is enabled for the DB instance, and otherwise false.
    */
  var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  /**
    * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * Contains one or more identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a Read Replica. For example, when you create an Aurora Read Replica of an RDS MySQL DB instance, the Aurora MySQL DB cluster for the Aurora Read Replica is shown. This output does not contain information about cross region Aurora Read Replicas.  Currently, each RDS DB instance can have only one Aurora Read Replica. 
    */
  var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.native
  /**
    * Contains one or more identifiers of the Read Replicas associated with this DB instance.
    */
  var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.native
  /**
    * Contains the identifier of the source DB instance if this DB instance is a Read Replica.
    */
  var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The status of a Read Replica. If the instance isn't a Read Replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.native
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the storage type associated with DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.native
  /**
    * The time zone of the DB instance. In most cases, the Timezone element is empty. Timezone content appears only for Microsoft SQL Server DB instances that were created with a time zone specified. 
    */
  var Timezone: js.UndefOr[String] = js.native
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object DBInstance {
  @scala.inline
  def apply(): DBInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstance]
  }
  @scala.inline
  implicit class DBInstanceOps[Self <: DBInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocatedStorage(value: Integer): Self = {
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
    def withAssociatedRoles(value: DBInstanceRoles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: Boolean): Self = {
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
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupRetentionPeriod(value: Integer): Self = {
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
    def withCharacterSetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyTagsToSnapshot(value: Boolean): Self = {
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
    def withDBClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceArn")(js.undefined)
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
    def withDBInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDBName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBName")(js.undefined)
        ret
    }
    @scala.inline
    def withDBParameterGroups(value: DBParameterGroupStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSecurityGroups(value: DBSecurityGroupMembershipList): Self = {
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
    def withDBSubnetGroup(value: DBSubnetGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSubnetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDbInstancePort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbInstancePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbInstancePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbInstancePort")(js.undefined)
        ret
    }
    @scala.inline
    def withDbiResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbiResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbiResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbiResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionProtection(value: Boolean): Self = {
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
    def withDomainMemberships(value: DomainMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainMemberships")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledCloudwatchLogsExports(value: LogTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledCloudwatchLogsExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledCloudwatchLogsExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledCloudwatchLogsExports")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
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
    def withEnhancedMonitoringResourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoringResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedMonitoringResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoringResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIAMDatabaseAuthenticationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMDatabaseAuthenticationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIAMDatabaseAuthenticationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMDatabaseAuthenticationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCreateTime")(js.undefined)
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
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestRestorableTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRestorableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestRestorableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRestorableTime")(js.undefined)
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
    def withListenerEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenerEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUsername")(js.undefined)
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
    def withMultiAZ(value: Boolean): Self = {
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
    def withOptionGroupMemberships(value: OptionGroupMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupMemberships")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingModifiedValues(value: PendingModifiedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingModifiedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingModifiedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingModifiedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceInsightsEnabled(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceInsightsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceInsightsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceInsightsEnabled")(js.undefined)
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
    def withPubliclyAccessible(value: Boolean): Self = {
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
    def withReadReplicaDBClusterIdentifiers(value: ReadReplicaDBClusterIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaDBClusterIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadReplicaDBClusterIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaDBClusterIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withReadReplicaDBInstanceIdentifiers(value: ReadReplicaDBInstanceIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaDBInstanceIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadReplicaDBInstanceIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaDBInstanceIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withReadReplicaSourceDBInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaSourceDBInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadReplicaSourceDBInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaSourceDBInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusInfos(value: DBInstanceStatusInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageEncrypted")(js.undefined)
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
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroups")(js.undefined)
        ret
    }
  }
  
}

