package typingsSlinky.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDBClusterFromSnapshotMessage extends StObject {
  
  /**
    * Provides the list of EC2 Availability Zones that instances in the restored DB cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.AvailabilityZones] = js.native
  
  /**
    * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var DBClusterIdentifier: String = js.native
  
  /**
    * The name of the DB cluster parameter group to associate with the new DB cluster. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * The name of the DB subnet group to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * Not supported.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  
  /**
    * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The database engine to use for the new DB cluster. Default: The same as source Constraint: Must be compatible with the engine of the source
    */
  var Engine: String = js.native
  
  /**
    * The version of the database engine to use for the new DB cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster snapshot. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If you do not specify a value for the KmsKeyId parameter, then the following will occur:   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is not encrypted, then the restored DB cluster is not encrypted.  
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    *  (Not supported by Neptune) 
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  
  /**
    * The port number on which the new DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The identifier for the DB snapshot or DB cluster snapshot to restore from. You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can use only the ARN to specify a DB snapshot. Constraints:   Must match the identifier of an existing Snapshot.  
    */
  var SnapshotIdentifier: String = js.native
  
  /**
    * The tags to be assigned to the restored DB cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A list of VPC security groups that the new DB cluster will belong to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}
object RestoreDBClusterFromSnapshotMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String, Engine: String, SnapshotIdentifier: String): RestoreDBClusterFromSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotMessage]
  }
  
  @scala.inline
  implicit class RestoreDBClusterFromSnapshotMessageMutableBuilder[Self <: RestoreDBClusterFromSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "DBClusterParameterGroupName", js.undefined)
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
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
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value :_*))
  }
}
