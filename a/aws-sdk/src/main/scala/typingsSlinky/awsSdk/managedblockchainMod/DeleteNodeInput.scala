package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNodeInput extends js.Object {
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network that the node belongs to.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString = js.native
}

object DeleteNodeInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): DeleteNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNodeInput]
  }
  @scala.inline
  implicit class DeleteNodeInputOps[Self <: DeleteNodeInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

