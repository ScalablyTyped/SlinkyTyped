package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * The Availability Zone (AZ) in which the node has been deployed.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var Endpoint: js.UndefOr[typingsSlinky.awsSdk.daxMod.Endpoint] = js.native
  /**
    * The date and time (in UNIX epoch format) when the node was launched.
    */
  var NodeCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * A system-generated identifier for the node.
    */
  var NodeId: js.UndefOr[String] = js.native
  /**
    * The current status of the node. For example: available.
    */
  var NodeStatus: js.UndefOr[String] = js.native
  /**
    * The status of the parameter group associated with this node. For example, in-sync.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
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
    def withNodeCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeCreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupStatus")(js.undefined)
        ret
    }
  }
  
}

