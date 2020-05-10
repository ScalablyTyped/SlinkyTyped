package typingsSlinky.pulumiAws.rdsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.engineModeMod.EngineMode
import typingsSlinky.pulumiAws.engineTypeMod.EngineType
import typingsSlinky.pulumiAws.inputMod.rds.ClusterS3Import
import typingsSlinky.pulumiAws.inputMod.rds.ClusterScalingConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of EC2 Availability Zones for the DB cluster storage where DB cluster instances can be created. RDS automatically assigns 3 AZs if less than 3 AZs are configured, which will show as a difference requiring resource recreation next deployment. It is recommended to specify 3 AZs or use `ignoreChanges` if necessary.
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
    * The RDS Cluster Resource ID
    */
  val clusterResourceId: js.UndefOr[Input[String]] = js.native
  /**
    * Copy all Cluster `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints][5]
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` specified on every [`aws.rds.ClusterInstance`](https://www.terraform.io/docs/providers/aws/r/rds_cluster_instance.html) in the cluster.
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
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `error`, `general`, `slowquery`, `postgresql` (PostgreSQL).
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS address of the RDS instance
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
    */
  val engine: js.UndefOr[Input[EngineType]] = js.native
  /**
    * The database engine mode. Valid values: `global`, `multimaster`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
    */
  val engineMode: js.UndefOr[Input[EngineMode]] = js.native
  /**
    * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The global cluster identifier specified on [`aws.rds.GlobalCluster`](https://www.terraform.io/docs/providers/aws/r/rds_global_cluster.html).
    */
  val globalClusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
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
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints][5]
    */
  val masterPassword: js.UndefOr[Input[String]] = js.native
  /**
    * Username for the master DB user. Please refer to the [RDS Naming Constraints][5]. This argument does not support in-place updates and cannot be changed during a restore from snapshot.
    */
  val masterUsername: js.UndefOr[Input[String]] = js.native
  /**
    * The port on which the DB accepts connections
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
    * Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * A read-only endpoint for the Aurora cluster, automatically
    * load-balanced across replicas
    */
  val readerEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of a source DB cluster or DB instance if this DB cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.native
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
    * Specifies whether the DB cluster is encrypted. The default is `false` for `provisioned` `engineMode` and `true` for `serverless` `engineMode`.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * List of VPC security groups to associate
    * with the Cluster
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyImmediately(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withBacktrackWindow(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backtrackWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBacktrackWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backtrackWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupRetentionPeriod(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterIdentifierPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIdentifierPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterIdentifierPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIdentifierPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterMembers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterResourceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyTagsToSnapshot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTagsToSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTagsToSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTagsToSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDbClusterParameterGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDbSubnetGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSubnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionProtection(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHttpEndpoint(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHttpEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHttpEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHttpEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCloudwatchLogsExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledCloudwatchLogsExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCloudwatchLogsExports")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: Input[EngineType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineMode(value: Input[EngineMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalSnapshotIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalClusterIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamDatabaseAuthenticationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamDatabaseAuthenticationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamDatabaseAuthenticationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoles(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUsername(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredBackupWindow(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredBackupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredBackupWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredBackupWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withReaderEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaderEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationSourceIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Import(value: Input[ClusterS3Import]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Import")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Import: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Import")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingConfiguration(value: Input[ClusterScalingConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFinalSnapshot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFinalSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageEncrypted(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

