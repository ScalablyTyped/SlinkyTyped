package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroup extends js.Object {
  /**
    * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 90 node groups numbered 0001 to 0090. Optionally, the user can provide the id for a node group. 
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * A list containing information about individual nodes within the node group (shard).
    */
  var NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.native
  /**
    * The endpoint of the primary node in this node group (shard).
    */
  var PrimaryEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The endpoint of the replica nodes in this node group (shard).
    */
  var ReaderEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The keyspace for this node group (shard).
    */
  var Slots: js.UndefOr[String] = js.native
  /**
    * The current state of this replication group - creating, available, etc.
    */
  var Status: js.UndefOr[String] = js.native
}

object NodeGroup {
  @scala.inline
  def apply(): NodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroup]
  }
  @scala.inline
  implicit class NodeGroupOps[Self <: NodeGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeGroupMembers(value: NodeGroupMemberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withReaderEndpoint(value: Endpoint): Self = {
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
    def withSlots(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slots")(js.undefined)
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
  }
  
}

