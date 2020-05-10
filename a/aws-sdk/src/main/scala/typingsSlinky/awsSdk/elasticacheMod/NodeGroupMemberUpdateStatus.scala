package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupMemberUpdateStatus extends js.Object {
  /**
    * The cache cluster ID
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The node ID of the cache cluster
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The deletion date of the node
    */
  var NodeDeletionDate: js.UndefOr[js.Date] = js.native
  /**
    * The end date of the update for a node
    */
  var NodeUpdateEndDate: js.UndefOr[js.Date] = js.native
  /**
    * Reflects whether the update was initiated by the customer or automatically applied
    */
  var NodeUpdateInitiatedBy: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.NodeUpdateInitiatedBy] = js.native
  /**
    * The date when the update is triggered
    */
  var NodeUpdateInitiatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The start date of the update for a node
    */
  var NodeUpdateStartDate: js.UndefOr[js.Date] = js.native
  /**
    * The update status of the node
    */
  var NodeUpdateStatus: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.NodeUpdateStatus] = js.native
  /**
    * The date when the NodeUpdateStatus was last modified
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[js.Date] = js.native
}

object NodeGroupMemberUpdateStatus {
  @scala.inline
  def apply(): NodeGroupMemberUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupMemberUpdateStatus]
  }
  @scala.inline
  implicit class NodeGroupMemberUpdateStatusOps[Self <: NodeGroupMemberUpdateStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDeletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeDeletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeDeletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeDeletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUpdateEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeUpdateEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUpdateInitiatedBy(value: NodeUpdateInitiatedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateInitiatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeUpdateInitiatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateInitiatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUpdateInitiatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateInitiatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeUpdateInitiatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateInitiatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUpdateStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeUpdateStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUpdateStatus(value: NodeUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUpdateStatusModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateStatusModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeUpdateStatusModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeUpdateStatusModifiedDate")(js.undefined)
        ret
    }
  }
  
}

