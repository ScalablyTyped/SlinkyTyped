package typingsSlinky.pulumiAws.rdsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.enumsRdsMod.EngineMode
import typingsSlinky.pulumiAws.enumsRdsMod.EngineType
import typingsSlinky.pulumiAws.inputMod.rds.ClusterRestoreToPointInTime
import typingsSlinky.pulumiAws.inputMod.rds.ClusterS3Import
import typingsSlinky.pulumiAws.inputMod.rds.ClusterScalingConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterArgs extends js.Object {
  
  /**
    * Enable to allow major engine version upgrades when changing engine versions. Defaults to `false`.
    */
  val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A list of EC2 Availability Zones for the DB cluster storage where DB cluster instances can be created. RDS automatically assigns 3 AZs if less than 3 AZs are configured, which will show as a difference requiring resource recreation next provider update. It is recommended to specify 3 AZs or use [the `ignoreChanges` argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if necessary.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
    */
  val backtrackWindow: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
    */
  val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of RDS Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Copy all Cluster `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` specified on every `aws.rds.ClusterInstance` in the cluster.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Enable HTTP endpoint (data API). Only valid when `engineMode` is set to `serverless`.
    */
  val enableHttpEndpoint: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Set of log types to export to cloudwatch. If omitted, no logs will be exported. The following log types are supported: `audit`, `error`, `general`, `slowquery`, `postgresql` (PostgreSQL).
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
    */
  val engine: js.UndefOr[Input[EngineType]] = js.native
  
  /**
    * The database engine mode. Valid values: `global` (only valid for Aurora MySQL 1.21 and earlier), `multimaster`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
    */
  val engineMode: js.UndefOr[Input[EngineMode]] = js.native
  
  /**
    * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of your final DB snapshot when this DB cluster is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The global cluster identifier specified on `aws.rds.GlobalCluster`.
    */
  val globalClusterIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html) for availability and limitations.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A List of ARNs for the IAM roles to associate to the RDS Cluster.
    */
  val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Password for the master DB user. Note that this may show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
    */
  val masterPassword: js.UndefOr[Input[String]] = js.native
  
  /**
    * Username for the master DB user. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints). This argument does not support in-place updates and cannot be changed during a restore from snapshot.
    */
  val masterUsername: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port on which the DB accepts connections
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * ARN of the source DB cluster or DB instance if this DB cluster is created as a Read Replica.
    */
  val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PIT.html). More details below.
    */
  val restoreToPointInTime: js.UndefOr[Input[ClusterRestoreToPointInTime]] = js.native
  
  val s3Import: js.UndefOr[Input[ClusterS3Import]] = js.native
  
  /**
    * Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
    */
  val scalingConfiguration: js.UndefOr[Input[ClusterScalingConfiguration]] = js.native
  
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The source region for an encrypted replica DB cluster.
    */
  val sourceRegion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the DB cluster is encrypted
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A map of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * List of VPC security groups to associate with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ClusterArgs {
  
  @scala.inline
  def apply(): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterArgs]
  }
  
  @scala.inline
  implicit class ClusterArgsOps[Self <: ClusterArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMajorVersionUpgrade(value: Input[Boolean]): Self = this.set("allowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMajorVersionUpgrade: Self = this.set("allowMajorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    
    @scala.inline
    def setBacktrackWindow(value: Input[Double]): Self = this.set("backtrackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacktrackWindow: Self = this.set("backtrackWindow", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: Input[Double]): Self = this.set("backupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("backupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: Input[String]): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("clusterIdentifier", js.undefined)
    
    @scala.inline
    def setClusterIdentifierPrefix(value: Input[String]): Self = this.set("clusterIdentifierPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifierPrefix: Self = this.set("clusterIdentifierPrefix", js.undefined)
    
    @scala.inline
    def setClusterMembersVarargs(value: Input[String]*): Self = this.set("clusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setClusterMembers(value: Input[js.Array[Input[String]]]): Self = this.set("clusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterMembers: Self = this.set("clusterMembers", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: Input[Boolean]): Self = this.set("copyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("copyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    
    @scala.inline
    def setDbClusterParameterGroupName(value: Input[String]): Self = this.set("dbClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterParameterGroupName: Self = this.set("dbClusterParameterGroupName", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupName(value: Input[String]): Self = this.set("dbSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroupName: Self = this.set("dbSubnetGroupName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Input[Boolean]): Self = this.set("deletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("deletionProtection", js.undefined)
    
    @scala.inline
    def setEnableHttpEndpoint(value: Input[Boolean]): Self = this.set("enableHttpEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHttpEndpoint: Self = this.set("enableHttpEndpoint", js.undefined)
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsVarargs(value: Input[String]*): Self = this.set("enabledCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = this.set("enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledCloudwatchLogsExports: Self = this.set("enabledCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEngine(value: Input[EngineType]): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineMode(value: Input[EngineMode]): Self = this.set("engineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineMode: Self = this.set("engineMode", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setFinalSnapshotIdentifier(value: Input[String]): Self = this.set("finalSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalSnapshotIdentifier: Self = this.set("finalSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setGlobalClusterIdentifier(value: Input[String]): Self = this.set("globalClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalClusterIdentifier: Self = this.set("globalClusterIdentifier", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = this.set("iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamDatabaseAuthenticationEnabled: Self = this.set("iamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setIamRolesVarargs(value: Input[String]*): Self = this.set("iamRoles", js.Array(value :_*))
    
    @scala.inline
    def setIamRoles(value: Input[js.Array[Input[String]]]): Self = this.set("iamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoles: Self = this.set("iamRoles", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setMasterPassword(value: Input[String]): Self = this.set("masterPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterPassword: Self = this.set("masterPassword", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: Input[String]): Self = this.set("masterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("masterUsername", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: Input[String]): Self = this.set("preferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("preferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: Input[String]): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("preferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setReplicationSourceIdentifier(value: Input[String]): Self = this.set("replicationSourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSourceIdentifier: Self = this.set("replicationSourceIdentifier", js.undefined)
    
    @scala.inline
    def setRestoreToPointInTime(value: Input[ClusterRestoreToPointInTime]): Self = this.set("restoreToPointInTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreToPointInTime: Self = this.set("restoreToPointInTime", js.undefined)
    
    @scala.inline
    def setS3Import(value: Input[ClusterS3Import]): Self = this.set("s3Import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Import: Self = this.set("s3Import", js.undefined)
    
    @scala.inline
    def setScalingConfiguration(value: Input[ClusterScalingConfiguration]): Self = this.set("scalingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingConfiguration: Self = this.set("scalingConfiguration", js.undefined)
    
    @scala.inline
    def setSkipFinalSnapshot(value: Input[Boolean]): Self = this.set("skipFinalSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFinalSnapshot: Self = this.set("skipFinalSnapshot", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: Input[String]): Self = this.set("snapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotIdentifier: Self = this.set("snapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSourceRegion(value: Input[String]): Self = this.set("sourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRegion: Self = this.set("sourceRegion", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Input[Boolean]): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("storageEncrypted", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
  }
}
