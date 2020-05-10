package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupUpdateStatus extends js.Object {
  /**
    * The ID of the node group
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * The status of the service update on the node group member
    */
  var NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList] = js.native
}

object NodeGroupUpdateStatus {
  @scala.inline
  def apply(): NodeGroupUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupUpdateStatus]
  }
  @scala.inline
  implicit class NodeGroupUpdateStatusOps[Self <: NodeGroupUpdateStatus] (val x: Self) extends AnyVal {
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
    def withNodeGroupMemberUpdateStatus(value: NodeGroupMemberUpdateStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupMemberUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupMemberUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupMemberUpdateStatus")(js.undefined)
        ret
    }
  }
  
}

