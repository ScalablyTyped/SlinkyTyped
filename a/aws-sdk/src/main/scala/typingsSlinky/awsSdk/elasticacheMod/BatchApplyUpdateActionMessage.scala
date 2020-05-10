package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchApplyUpdateActionMessage extends js.Object {
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.native
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String = js.native
}

object BatchApplyUpdateActionMessage {
  @scala.inline
  def apply(ServiceUpdateName: String): BatchApplyUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ServiceUpdateName = ServiceUpdateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchApplyUpdateActionMessage]
  }
  @scala.inline
  implicit class BatchApplyUpdateActionMessageOps[Self <: BatchApplyUpdateActionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceUpdateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheClusterIds(value: CacheClusterIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterIds")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupIds(value: ReplicationGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupIds")(js.undefined)
        ret
    }
  }
  
}

