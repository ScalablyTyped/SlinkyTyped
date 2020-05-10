package typingsSlinky.pulumiAws.daxClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.dax.ClusterNode
import typingsSlinky.pulumiAws.inputMod.dax.ClusterServerSideEncryption
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * The ARN of the DAX cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * List of Availability Zones in which the
    * nodes will be created
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS name of the DAX cluster without the port appended
    */
  val clusterAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Group identifier. DAX converts this name to
    * lowercase
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  /**
    * The configuration endpoint for this DAX cluster,
    * consisting of a DNS name and a port number
    */
  val configurationEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Description for the cluster
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A valid Amazon Resource Name (ARN) that identifies
    * an IAM role. At runtime, DAX will assume this role and use the role's
    * permissions to access DynamoDB on your behalf
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the weekly time range for when
    * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
    * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
    * `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The compute and memory capacity of the nodes. See
    * [Nodes][1] for supported node types
    */
  val nodeType: js.UndefOr[Input[String]] = js.native
  /**
    * List of node objects including `id`, `address`, `port` and
    * `availabilityZone`. Referenceable e.g. as
    * `${aws_dax_cluster.test.nodes.0.address}`
    */
  val nodes: js.UndefOr[Input[js.Array[Input[ClusterNode]]]] = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send DAX notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the parameter group to associate
    * with this DAX cluster
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The port used by the configuration endpoint
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of nodes in the DAX cluster. A
    * replication factor of 1 will create a single-node cluster, without any read
    * replicas
    */
  val replicationFactor: js.UndefOr[Input[Double]] = js.native
  /**
    * One or more VPC security groups associated
    * with the cluster
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Encrypt at rest options
    */
  val serverSideEncryption: js.UndefOr[Input[ClusterServerSideEncryption]] = js.native
  /**
    * Name of the subnet group to be used for the
    * cluster
    */
  val subnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    def withClusterAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindow(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(js.undefined)
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
    def withNodes(value: Input[js.Array[Input[ClusterNode]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroupName")(js.undefined)
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
    def withReplicationFactor(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: Input[ClusterServerSideEncryption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetGroupName")(js.undefined)
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
  }
  
}

