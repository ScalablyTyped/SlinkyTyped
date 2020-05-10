package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAction extends js.Object {
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The status of the service update on the cache node
    */
  var CacheNodeUpdateStatus: js.UndefOr[CacheNodeUpdateStatusList] = js.native
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The estimated length of time for the update to complete
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.native
  /**
    * The status of the service update on the node group
    */
  var NodeGroupUpdateStatus: js.UndefOr[NodeGroupUpdateStatusList] = js.native
  /**
    * The progress of the service update on the replication group
    */
  var NodesUpdated: js.UndefOr[String] = js.native
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  /**
    * The recommended date to apply the service update to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the update is first available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[js.Date] = js.native
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdateSeverity] = js.native
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdateStatus] = js.native
  /**
    * Reflects the nature of the service update 
    */
  var ServiceUpdateType: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdateType] = js.native
  /**
    * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication group was created after the recommended apply-by date.
    */
  var SlaMet: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.SlaMet] = js.native
  /**
    * The date that the service update is available to a replication group
    */
  var UpdateActionAvailableDate: js.UndefOr[js.Date] = js.native
  /**
    * The status of the update action
    */
  var UpdateActionStatus: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.UpdateActionStatus] = js.native
  /**
    * The date when the UpdateActionStatus was last modified
    */
  var UpdateActionStatusModifiedDate: js.UndefOr[js.Date] = js.native
}

object UpdateAction {
  @scala.inline
  def apply(): UpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAction]
  }
  @scala.inline
  implicit class UpdateActionOps[Self <: UpdateAction] (val x: Self) extends AnyVal {
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
    def withCacheNodeUpdateStatus(value: CacheNodeUpdateStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeGroupUpdateStatus(value: NodeGroupUpdateStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNodesUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodesUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateRecommendedApplyByDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateRecommendedApplyByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateRecommendedApplyByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateRecommendedApplyByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateReleaseDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateReleaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateReleaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateSeverity(value: ServiceUpdateSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateStatus(value: ServiceUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateType(value: ServiceUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateType")(js.undefined)
        ret
    }
    @scala.inline
    def withSlaMet(value: SlaMet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlaMet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlaMet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlaMet")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateActionAvailableDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionAvailableDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateActionAvailableDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionAvailableDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateActionStatus(value: UpdateActionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateActionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateActionStatusModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionStatusModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateActionStatusModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionStatusModifiedDate")(js.undefined)
        ret
    }
  }
  
}

