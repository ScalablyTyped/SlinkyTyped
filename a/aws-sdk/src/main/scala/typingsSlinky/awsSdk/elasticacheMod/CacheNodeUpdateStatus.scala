package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheNodeUpdateStatus extends js.Object {
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
    * The date when the NodeUpdateStatus was last modified&gt;
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[js.Date] = js.native
}

object CacheNodeUpdateStatus {
  @scala.inline
  def apply(
    CacheNodeId: String = null,
    NodeDeletionDate: js.Date = null,
    NodeUpdateEndDate: js.Date = null,
    NodeUpdateInitiatedBy: NodeUpdateInitiatedBy = null,
    NodeUpdateInitiatedDate: js.Date = null,
    NodeUpdateStartDate: js.Date = null,
    NodeUpdateStatus: NodeUpdateStatus = null,
    NodeUpdateStatusModifiedDate: js.Date = null
  ): CacheNodeUpdateStatus = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId.asInstanceOf[js.Any])
    if (NodeDeletionDate != null) __obj.updateDynamic("NodeDeletionDate")(NodeDeletionDate.asInstanceOf[js.Any])
    if (NodeUpdateEndDate != null) __obj.updateDynamic("NodeUpdateEndDate")(NodeUpdateEndDate.asInstanceOf[js.Any])
    if (NodeUpdateInitiatedBy != null) __obj.updateDynamic("NodeUpdateInitiatedBy")(NodeUpdateInitiatedBy.asInstanceOf[js.Any])
    if (NodeUpdateInitiatedDate != null) __obj.updateDynamic("NodeUpdateInitiatedDate")(NodeUpdateInitiatedDate.asInstanceOf[js.Any])
    if (NodeUpdateStartDate != null) __obj.updateDynamic("NodeUpdateStartDate")(NodeUpdateStartDate.asInstanceOf[js.Any])
    if (NodeUpdateStatus != null) __obj.updateDynamic("NodeUpdateStatus")(NodeUpdateStatus.asInstanceOf[js.Any])
    if (NodeUpdateStatusModifiedDate != null) __obj.updateDynamic("NodeUpdateStatusModifiedDate")(NodeUpdateStatusModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNodeUpdateStatus]
  }
}

