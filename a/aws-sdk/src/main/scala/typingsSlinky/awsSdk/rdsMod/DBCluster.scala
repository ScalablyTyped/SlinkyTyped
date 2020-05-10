package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCluster extends js.Object {
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var ActivityStreamKinesisStreamName: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier used for encrypting messages in the database activity stream.
    */
  var ActivityStreamKmsKeyId: js.UndefOr[String] = js.native
  /**
    * The mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. 
    */
  var ActivityStreamMode: js.UndefOr[typingsSlinky.awsSdk.rdsMod.ActivityStreamMode] = js.native
  /**
    * The status of the database activity stream.
    */
  var ActivityStreamStatus: js.UndefOr[typingsSlinky.awsSdk.rdsMod.ActivityStreamStatus] = js.native
  /**
    * For all database engines except Amazon Aurora, AllocatedStorage specifies the allocated storage size in gibibytes (GiB). For Aurora, AllocatedStorage always returns 1, because Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the DB cluster. IAM roles that are associated with a DB cluster grant permission for the DB cluster to access other AWS services on your behalf.
    */
  var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.native
  /**
    * Provides the list of Availability Zones (AZs) where instances in the DB cluster can be created.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.rdsMod.AvailabilityZones] = js.native
  /**
    * The number of change records stored for Backtrack.
    */
  var BacktrackConsumedChangeRecords: js.UndefOr[LongOptional] = js.native
  /**
    * The target backtrack window, in seconds. If this value is set to 0, backtracking is disabled for the DB cluster. Otherwise, backtracking is enabled.
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.native
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The current capacity of an Aurora Serverless DB cluster. The capacity is 0 (zero) when the cluster is paused. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.
    */
  var Capacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * If present, specifies the name of the character set that this cluster is associated with.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
  /**
    * Identifies the clone group to which the DB cluster is associated.
    */
  var CloneGroupId: js.UndefOr[String] = js.native
  /**
    * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies whether tags are copied from the DB cluster to snapshots of the DB cluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.native
  /**
    * Specifies whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
    */
  var CrossAccountClone: js.UndefOr[BooleanOptional] = js.native
  /**
    * Identifies all custom endpoints associated with the cluster.
    */
  var CustomEndpoints: js.UndefOr[StringList] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.native
  /**
    * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * Provides the list of instances that make up the DB cluster.
    */
  var DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.native
  /**
    * Provides the list of option group memberships for this DB cluster.
    */
  var DBClusterOptionGroupMemberships: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBClusterOptionGroupMemberships] = js.native
  /**
    * Specifies the name of the DB cluster parameter group for the DB cluster.
    */
  var DBClusterParameterGroup: js.UndefOr[String] = js.native
  /**
    * Specifies information on the subnet group associated with the DB cluster, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[String] = js.native
  /**
    * Contains the name of the initial database of this DB cluster that was provided at create time, if one was specified when the DB cluster was created. This same name is returned for the life of the DB cluster.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the DB cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
    */
  var DbClusterResourceId: js.UndefOr[String] = js.native
  /**
    * Indicates if the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Active Directory Domain membership records associated with the DB cluster.
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.native
  /**
    * The earliest time to which a DB cluster can be backtracked.
    */
  var EarliestBacktrackTime: js.UndefOr[js.Date] = js.native
  /**
    * The earliest time to which a database can be restored with point-in-time restore.
    */
  var EarliestRestorableTime: js.UndefOr[js.Date] = js.native
  /**
    * A list of log types that this DB cluster is configured to export to CloudWatch Logs. Log types vary by DB engine. For information about the log types for each DB engine, see Amazon RDS Database Log Files in the Amazon Aurora User Guide. 
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * Specifies the connection endpoint for the primary instance of the DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * Provides the name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The DB engine mode of the DB cluster, either provisioned, serverless, parallelquery, global, or multimaster.
    */
  var EngineMode: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var HttpEndpointEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that indicates whether the mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * If StorageEncrypted is enabled, the AWS KMS key identifier for the encrypted DB cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[js.Date] = js.native
  /**
    * Contains the master username for the DB cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * Specifies whether the DB cluster has instances in multiple Availability Zones.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * Specifies the progress of the operation as a percentage.
    */
  var PercentProgress: js.UndefOr[String] = js.native
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * Contains one or more identifiers of the Read Replicas associated with this DB cluster.
    */
  var ReadReplicaIdentifiers: js.UndefOr[ReadReplicaIdentifierList] = js.native
  /**
    * The reader endpoint for the DB cluster. The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas that are available in a DB cluster. As clients request new connections to the reader endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB cluster. This functionality can help balance your read workload across multiple Aurora Replicas in your DB cluster.  If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.native
  /**
    * Contains the identifier of the source DB cluster if this DB cluster is a Read Replica.
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.native
  var ScalingConfigurationInfo: js.UndefOr[typingsSlinky.awsSdk.rdsMod.ScalingConfigurationInfo] = js.native
  /**
    * Specifies the current state of this DB cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides a list of VPC security groups that the DB cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object DBCluster {
  @scala.inline
  def apply(): DBCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBCluster]
  }
  @scala.inline
  implicit class DBClusterOps[Self <: DBCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityStreamKinesisStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamKinesisStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityStreamKinesisStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamKinesisStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityStreamKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityStreamKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityStreamMode(value: ActivityStreamMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityStreamMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamMode")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityStreamStatus(value: ActivityStreamStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityStreamStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStreamStatus")(js.undefined)
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
    def withAssociatedRoles(value: DBClusterRoles): Self = {
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
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withBacktrackConsumedChangeRecords(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackConsumedChangeRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacktrackConsumedChangeRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackConsumedChangeRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withBacktrackWindow(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacktrackWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BacktrackWindow")(js.undefined)
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
    def withCapacity(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(js.undefined)
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
    def withCloneGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCreateTime")(js.undefined)
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
    def withCrossAccountClone(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossAccountClone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossAccountClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossAccountClone")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEndpoints(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterArn")(js.undefined)
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
    def withDBClusterMembers(value: DBClusterMemberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterOptionGroupMemberships(value: DBClusterOptionGroupMemberships): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterOptionGroupMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterOptionGroupMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterOptionGroupMemberships")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterParameterGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSubnetGroup(value: String): Self = {
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
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDbClusterResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbClusterResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbClusterResourceId")(js.undefined)
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
    def withEarliestBacktrackTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestBacktrackTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarliestBacktrackTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestBacktrackTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEarliestRestorableTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestRestorableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarliestRestorableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestRestorableTime")(js.undefined)
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
    def withEndpoint(value: String): Self = {
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
    def withEngineMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineMode")(js.undefined)
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
    def withHostedZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpEndpointEnabled(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpEndpointEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpEndpointEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpEndpointEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIAMDatabaseAuthenticationEnabled(value: BooleanOptional): Self = {
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
    def withPercentProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
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
    def withReadReplicaIdentifiers(value: ReadReplicaIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadReplicaIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withReaderEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReaderEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaderEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReaderEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationSourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingConfigurationInfo(value: ScalingConfigurationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingConfigurationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingConfigurationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingConfigurationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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

