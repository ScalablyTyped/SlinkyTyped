package typingsSlinky.pulumiAws.redshiftClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.redshift.ClusterLogging
import typingsSlinky.pulumiAws.inputMod.redshift.ClusterSnapshotCopy
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
    */
  val allowVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
    */
  val automatedSnapshotRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The Cluster Identifier. Must be a lower case
    * string.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the parameter group to be associated with this cluster.
    */
  val clusterParameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: js.UndefOr[Input[String]] = js.native
  /**
    * The specific revision number of the database in the cluster
    */
  val clusterRevisionNumber: js.UndefOr[Input[String]] = js.native
  /**
    * A list of security groups to be associated with this cluster.
    */
  val clusterSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  val clusterSubnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The cluster type to use. Either `single-node` or `multi-node`.
    */
  val clusterType: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
    * The version selected runs on all the nodes in the cluster.
    */
  val clusterVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the first database to be created when the cluster is created.
    * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS name of the cluster
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * The Elastic IP (EIP) address for the cluster.
    */
  val elasticIp: js.UndefOr[Input[String]] = js.native
  /**
    * If true , the data in the cluster is encrypted at rest.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The connection endpoint
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * If true , enhanced VPC routing is enabled.
    */
  val enhancedVpcRouting: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skipFinalSnapshot` must be false.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
    */
  val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * Logging, documented below.
    */
  val logging: js.UndefOr[Input[ClusterLogging]] = js.native
  /**
    * Password for the master DB user.
    * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
    * contain at least one uppercase letter, one lowercase letter, and one number.
    */
  val masterPassword: js.UndefOr[Input[String]] = js.native
  /**
    * Username for the master DB user.
    */
  val masterUsername: js.UndefOr[Input[String]] = js.native
  /**
    * The node type to be provisioned for the cluster.
    */
  val nodeType: js.UndefOr[Input[String]] = js.native
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
    */
  val numberOfNodes: js.UndefOr[Input[Double]] = js.native
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  val ownerAccount: js.UndefOr[Input[String]] = js.native
  /**
    * The port number on which the cluster accepts incoming connections.
    * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.
    * Format: ddd:hh24:mi-ddd:hh24:mi
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * If true, the cluster can be accessed from a public network. Default is `true`.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the cluster the source snapshot was created from.
    */
  val snapshotClusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration of automatic copy of snapshots from one region to another. Documented below.
    */
  val snapshotCopy: js.UndefOr[Input[ClusterSnapshotCopy]] = js.native
  /**
    * The name of the snapshot from which to create the new cluster.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
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
    def withAllowVersionUpgrade(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVersionUpgrade")(js.undefined)
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
    def withAutomatedSnapshotRetentionPeriod(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatedSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedSnapshotRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
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
    def withClusterParameterGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterPublicKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterRevisionNumber(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRevisionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSecurityGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSubnetGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSubnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterType")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterVersion")(js.undefined)
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
    def withDnsName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticIp")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.undefined)
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
    def withEnhancedVpcRouting(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedVpcRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedVpcRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedVpcRouting")(js.undefined)
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
    def withLogging(value: Input[ClusterLogging]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
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
    def withNodeType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfNodes(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccount(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(js.undefined)
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
    def withPubliclyAccessible(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(js.undefined)
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
    def withSnapshotClusterIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotCopy(value: Input[ClusterSnapshotCopy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotCopy")(js.undefined)
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

