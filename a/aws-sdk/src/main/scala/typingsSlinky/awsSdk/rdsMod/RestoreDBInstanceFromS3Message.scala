package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDBInstanceFromS3Message extends StObject {
  
  /**
    * The amount of storage (in gigabytes) to allocate initially for the DB instance. Follow the allocation rules specified in CreateDBInstance.   Be sure to allocate enough memory for your new DB instance so that the restore operation can succeed. You can also allocate additional memory for future growth.  
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the maintenance window. By default, minor engine upgrades are not applied automatically. 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The Availability Zone that the DB instance is created in. For information about AWS Regions and Availability Zones, see Regions and Availability Zones in the Amazon RDS User Guide.  Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.   Example: us-east-1d  Constraint: The AvailabilityZone parameter can't be specified if the DB instance is a Multi-AZ deployment. The specified Availability Zone must be in the same AWS Region as the current endpoint. 
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The number of days for which automated backups are retained. Setting this parameter to a positive number enables backups. For more information, see CreateDBInstance. 
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A value that indicates whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags are not copied. 
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Importing from Amazon S3 isn't supported on the db.t2.micro DB instance class. 
    */
  var DBInstanceClass: String = js.native
  
  /**
    * The DB instance identifier. This parameter is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String = js.native
  
  /**
    * The name of the database to create when the DB instance is created. Follow the naming rules specified in CreateDBInstance. 
    */
  var DBName: js.UndefOr[String] = js.native
  
  /**
    * The name of the DB parameter group to associate with this DB instance. If you do not specify a value for DBParameterGroupName, then the default DBParameterGroup for the specified DB engine is used.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * A list of DB security groups to associate with this DB instance. Default: The default DB security group for the database engine.
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.native
  
  /**
    * A DB subnet group to associate with this DB instance.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information about IAM database authentication, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A value that indicates whether to enable Performance Insights for the DB instance.  For more information, see Using Amazon Performance Insights in the Amazon Relational Database Service User Guide. 
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of the database engine to be used for this instance.  Valid Values: mysql 
    */
  var Engine: String = js.native
  
  /**
    * The version number of the database engine to use. Choose the latest minor version of your database engine. For information about engine versions, see CreateDBInstance, or call DescribeDBEngineVersions. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to allocate initially for the DB instance. For information about valid Iops values, see Amazon RDS Provisioned IOPS Storage to Improve Performance in the Amazon RDS User Guide. 
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The AWS KMS key identifier for an encrypted DB instance.  The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.  If the StorageEncrypted parameter is enabled, and you do not specify a value for the KmsKeyId parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The license model for this DB instance. Use general-public-license. 
    */
  var LicenseModel: js.UndefOr[String] = js.native
  
  /**
    * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".  Constraints: Must contain from 8 to 41 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  
  /**
    * The name for the master user.  Constraints:    Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
    */
  var MasterUsername: js.UndefOr[String] = js.native
  
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0.  If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0.  Valid Values: 0, 1, 5, 10, 15, 30, 60  Default: 0 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, see Setting Up and Enabling Enhanced Monitoring in the Amazon RDS User Guide.  If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value. 
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether the DB instance is a Multi-AZ deployment. If the DB instance is a Multi-AZ deployment, you can't set the AvailabilityZone parameter. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of the option group to associate with this DB instance. If this argument is omitted, the default option group for the specified engine is used. 
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key.  If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon RDS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.native
  
  /**
    * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The port number on which the database accepts connections.  Type: Integer  Valid Values: 1150-65535  Default: 3306 
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The time range each day during which automated backups are created if automated backups are enabled. For more information, see The Backup Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  
  /**
    * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more information, see Amazon RDS Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format ddd:hh24:mi-ddd:hh24:mi.   Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred backup window.   Must be at least 30 minutes.  
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it uses, and that public access is not permitted if the security group assigned to the DB instance doesn't permit it. When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of your Amazon S3 bucket that contains your database backup file. 
    */
  var S3BucketName: String = js.native
  
  /**
    * An AWS Identity and Access Management (IAM) role to allow Amazon RDS to access your Amazon S3 bucket. 
    */
  var S3IngestionRoleArn: String = js.native
  
  /**
    * The prefix of your Amazon S3 bucket. 
    */
  var S3Prefix: js.UndefOr[String] = js.native
  
  /**
    * The name of the engine of your source database.  Valid Values: mysql 
    */
  var SourceEngine: String = js.native
  
  /**
    * The version of the database that the backup files were created from. MySQL versions 5.6 and 5.7 are supported.  Example: 5.6.40 
    */
  var SourceEngineVersion: String = js.native
  
  /**
    * A value that indicates whether the new DB instance is encrypted or not. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1  If you specify io1, you must also include a value for the Iops parameter.  Default: io1 if the Iops parameter is specified; otherwise gp2 
    */
  var StorageType: js.UndefOr[String] = js.native
  
  /**
    * A list of tags to associate with this DB instance. For more information, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
    */
  var UseDefaultProcessorFeatures: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A list of VPC security groups to associate with this DB instance. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}
object RestoreDBInstanceFromS3Message {
  
  @scala.inline
  def apply(
    DBInstanceClass: String,
    DBInstanceIdentifier: String,
    Engine: String,
    S3BucketName: String,
    S3IngestionRoleArn: String,
    SourceEngine: String,
    SourceEngineVersion: String
  ): RestoreDBInstanceFromS3Message = {
    val __obj = js.Dynamic.literal(DBInstanceClass = DBInstanceClass.asInstanceOf[js.Any], DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any], S3IngestionRoleArn = S3IngestionRoleArn.asInstanceOf[js.Any], SourceEngine = SourceEngine.asInstanceOf[js.Any], SourceEngineVersion = SourceEngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBInstanceFromS3Message]
  }
  
  @scala.inline
  implicit class RestoreDBInstanceFromS3MessageMutableBuilder[Self <: RestoreDBInstanceFromS3Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: BooleanOptional): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBName(value: String): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    @scala.inline
    def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
    
    @scala.inline
    def setDBSecurityGroups(value: DBSecurityGroupNameList): Self = StObject.set(x, "DBSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupsUndefined: Self = StObject.set(x, "DBSecurityGroups", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "DBSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setEnableCloudwatchLogsExports(value: LogTypeList): Self = StObject.set(x, "EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "EnableCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "EnableCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = StObject.set(x, "EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "EnableIAMDatabaseAuthentication", js.undefined)
    
    @scala.inline
    def setEnablePerformanceInsights(value: BooleanOptional): Self = StObject.set(x, "EnablePerformanceInsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePerformanceInsightsUndefined: Self = StObject.set(x, "EnablePerformanceInsights", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setMaxAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "MaxAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllocatedStorageUndefined: Self = StObject.set(x, "MaxAllocatedStorage", js.undefined)
    
    @scala.inline
    def setMonitoringInterval(value: IntegerOptional): Self = StObject.set(x, "MonitoringInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringIntervalUndefined: Self = StObject.set(x, "MonitoringInterval", js.undefined)
    
    @scala.inline
    def setMonitoringRoleArn(value: String): Self = StObject.set(x, "MonitoringRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringRoleArnUndefined: Self = StObject.set(x, "MonitoringRoleArn", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsKMSKeyId(value: String): Self = StObject.set(x, "PerformanceInsightsKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceInsightsKMSKeyIdUndefined: Self = StObject.set(x, "PerformanceInsightsKMSKeyId", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceInsightsRetentionPeriodUndefined: Self = StObject.set(x, "PerformanceInsightsRetentionPeriod", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setProcessorFeatures(value: ProcessorFeatureList): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3IngestionRoleArn(value: String): Self = StObject.set(x, "S3IngestionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    @scala.inline
    def setSourceEngine(value: String): Self = StObject.set(x, "SourceEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEngineVersion(value: String): Self = StObject.set(x, "SourceEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUseDefaultProcessorFeatures(value: BooleanOptional): Self = StObject.set(x, "UseDefaultProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultProcessorFeaturesUndefined: Self = StObject.set(x, "UseDefaultProcessorFeatures", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value :_*))
  }
}
