package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The number of nodes in the cluster that are active (i.e., capable of serving requests).
    */
  var ActiveNodes: js.UndefOr[IntegerOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
    */
  var ClusterArn: js.UndefOr[String] = js.native
  /**
    * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var ClusterDiscoveryEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The name of the DAX cluster.
    */
  var ClusterName: js.UndefOr[String] = js.native
  /**
    * The description of the cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf.
    */
  var IamRoleArn: js.UndefOr[String] = js.native
  /**
    * A list of nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.native
  /**
    * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * A list of nodes that are currently in the cluster.
    */
  var Nodes: js.UndefOr[NodeList] = js.native
  /**
    * Describes a notification topic and its status. Notification topics are used for publishing DAX events to subscribers using Amazon Simple Notification Service (SNS).
    */
  var NotificationConfiguration: js.UndefOr[typingsSlinky.awsSdk.daxMod.NotificationConfiguration] = js.native
  /**
    * The parameter group being used by nodes in the cluster.
    */
  var ParameterGroup: js.UndefOr[ParameterGroupStatus] = js.native
  /**
    * A range of time when maintenance of DAX cluster software will be performed. For example: sun:01:00-sun:09:00. Cluster maintenance normally takes less than 30 minutes, and is performed automatically within the maintenance window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The description of the server-side encryption status on the specified DAX cluster.
    */
  var SSEDescription: js.UndefOr[typingsSlinky.awsSdk.daxMod.SSEDescription] = js.native
  /**
    * A list of security groups, and the status of each, for the nodes in the cluster.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.native
  /**
    * The current status of the cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The subnet group where the DAX cluster is running.
    */
  var SubnetGroup: js.UndefOr[String] = js.native
  /**
    * The total number of nodes in the cluster.
    */
  var TotalNodes: js.UndefOr[IntegerOptional] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveNodes(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterDiscoveryEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterDiscoveryEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterDiscoveryEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterDiscoveryEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIdsToRemove(value: NodeIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeIdsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIdsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeIdsToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: NodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationConfiguration(value: NotificationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroup(value: ParameterGroupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroup")(js.undefined)
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
    def withSSEDescription(value: SSEDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroupMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
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
    def withSubnetGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalNodes(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNodes")(js.undefined)
        ret
    }
  }
  
}

