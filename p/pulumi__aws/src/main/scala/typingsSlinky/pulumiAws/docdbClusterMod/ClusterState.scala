package typingsSlinky.pulumiAws.docdbClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * Specifies whether any cluster modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of EC2 Availability Zones that
    * instances in the DB cluster can be created in.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifer`.
    */
  val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * List of DocDB Instances that are a part of this cluster
    */
  val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DocDB Cluster Resource ID
    */
  val clusterResourceId: js.UndefOr[Input[String]] = js.native
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A DB subnet group to associate with this DB instance.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * List of log types to export to cloudwatch. If omitted, no logs will be exported.
    * The following log types are supported: `audit`, `profiler`.
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS address of the DocDB instance
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * The database engine version. Updating this argument results in an outage.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The name of your final DB snapshot
    * when this DB cluster is deleted. If omitted, no final snapshot will be
    * made.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * Password for the master DB user. Note that this may
    * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
    */
  val masterPassword: js.UndefOr[Input[String]] = js.native
  /**
    * Username for the master DB user.
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
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
    */
  val readerEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
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
    def withEngine(value: Input[String]): Self = {
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

