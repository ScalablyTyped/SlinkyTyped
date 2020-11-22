package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDBInstanceToPointInTimeMessage extends js.Object {
  
  /**
    * A value that indicates whether minor version upgrades are applied automatically to the DB instance during the maintenance window.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The Availability Zone (AZ) where the DB instance will be created. Default: A random, system-chosen Availability Zone. Constraint: You can't specify the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment. Example: us-east-1a 
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether to copy all tags from the restored DB instance to snapshots of the DB instance. By default, tags are not copied.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The compute and memory capacity of the Amazon RDS DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide.  Default: The same DBInstanceClass as the original DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  
  /**
    * The database name for the restored DB instance.  This parameter isn't used for the MySQL or MariaDB engines. 
    */
  var DBName: js.UndefOr[String] = js.native
  
  /**
    * The name of the DB parameter group to associate with this DB instance. If you do not specify a value for DBParameterGroupName, then the default DBParameterGroup for the specified DB engine is used. Constraints:   If supplied, must match the name of an existing DBParameterGroup.   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.  
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * The DB subnet group name to use for the new instance. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Specify the Active Directory directory ID to restore the DB instance in. The domain must be created prior to this operation. Currently, only MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain. For more information, see  Kerberos Authentication in the Amazon RDS User Guide.
    */
  var Domain: js.UndefOr[String] = js.native
  
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.native
  
  /**
    * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs in the Amazon RDS User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. For more information about IAM database authentication, see  IAM Database Authentication for MySQL and PostgreSQL in the Amazon RDS User Guide. 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The database engine to use for the new instance. Default: The same as source Constraint: Must be compatible with the engine of the source Valid Values:    mariadb     mysql     oracle-ee     oracle-se2     oracle-se1     oracle-se     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB instance. Constraints: Must be an integer greater than 1000.  SQL Server  Setting the IOPS value for the SQL Server database engine isn't supported.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * License model information for the restored DB instance. Default: Same as source.  Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.native
  
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A value that indicates whether the DB instance is a Multi-AZ deployment. Constraint: You can't specify the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The name of the option group to be used for the restored DB instance. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  
  /**
    * The port number on which the database accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB instance.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, its DNS endpoint resolves to the private IP address from within the DB instance's VPC, and to the public IP address from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it uses, and that public access is not permitted if the security group assigned to the DB instance doesn't permit it. When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a private IP address. For more information, see CreateDBInstance.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The date and time to restore from. Valid Values: Value must be a time in Universal Coordinated Time (UTC) format Constraints:   Must be before the latest restorable time for the DB instance   Can't be specified if the UseLatestRestorableTime parameter is enabled   Example: 2009-09-07T23:45:00Z 
    */
  var RestoreTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier of the source DB instance from which to restore. Constraints:   Must match the identifier of an existing DB instance.  
    */
  var SourceDBInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The resource ID of the source DB instance from which to restore.
    */
  var SourceDbiResourceId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise gp2 
    */
  var StorageType: js.UndefOr[String] = js.native
  
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the new DB instance to be created. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
    */
  var TargetDBInstanceIdentifier: String = js.native
  
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
    *  A value that indicates whether the DB instance is restored from the latest backup time. By default, the DB instance isn't restored from the latest backup time.  Constraints: Can't be specified if the RestoreTime parameter is provided.
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.native
  
  /**
    *  A list of EC2 VPC security groups to associate with this DB instance.   Default: The default EC2 VPC security group for the DB subnet group's VPC. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}
object RestoreDBInstanceToPointInTimeMessage {
  
  @scala.inline
  def apply(TargetDBInstanceIdentifier: String): RestoreDBInstanceToPointInTimeMessage = {
    val __obj = js.Dynamic.literal(TargetDBInstanceIdentifier = TargetDBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBInstanceToPointInTimeMessage]
  }
  
  @scala.inline
  implicit class RestoreDBInstanceToPointInTimeMessageOps[Self <: RestoreDBInstanceToPointInTimeMessage] (val x: Self) extends AnyVal {
    
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
    def setTargetDBInstanceIdentifier(value: String): Self = this.set("TargetDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: BooleanOptional): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDBName(value: String): Self = this.set("DBName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBName: Self = this.set("DBName", js.undefined)
    
    @scala.inline
    def setDBParameterGroupName(value: String): Self = this.set("DBParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBParameterGroupName: Self = this.set("DBParameterGroupName", js.undefined)
    
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
    def setEnableCloudwatchLogsExportsVarargs(value: String*): Self = this.set("EnableCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnableCloudwatchLogsExports(value: LogTypeList): Self = this.set("EnableCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCloudwatchLogsExports: Self = this.set("EnableCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEnableIAMDatabaseAuthentication(value: BooleanOptional): Self = this.set("EnableIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIAMDatabaseAuthentication: Self = this.set("EnableIAMDatabaseAuthentication", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setIops(value: IntegerOptional): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
    @scala.inline
    def setMaxAllocatedStorage(value: IntegerOptional): Self = this.set("MaxAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAllocatedStorage: Self = this.set("MaxAllocatedStorage", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = this.set("ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setProcessorFeatures(value: ProcessorFeatureList): Self = this.set("ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessorFeatures: Self = this.set("ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: BooleanOptional): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setRestoreTime(value: js.Date): Self = this.set("RestoreTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreTime: Self = this.set("RestoreTime", js.undefined)
    
    @scala.inline
    def setSourceDBInstanceIdentifier(value: String): Self = this.set("SourceDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDBInstanceIdentifier: Self = this.set("SourceDBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setSourceDbiResourceId(value: String): Self = this.set("SourceDbiResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDbiResourceId: Self = this.set("SourceDbiResourceId", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTdeCredentialArn(value: String): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    
    @scala.inline
    def setTdeCredentialPassword(value: String): Self = this.set("TdeCredentialPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdeCredentialPassword: Self = this.set("TdeCredentialPassword", js.undefined)
    
    @scala.inline
    def setUseDefaultProcessorFeatures(value: BooleanOptional): Self = this.set("UseDefaultProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultProcessorFeatures: Self = this.set("UseDefaultProcessorFeatures", js.undefined)
    
    @scala.inline
    def setUseLatestRestorableTime(value: Boolean): Self = this.set("UseLatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLatestRestorableTime: Self = this.set("UseLatestRestorableTime", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
  }
}
