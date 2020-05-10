package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseNodeGroupsInGlobalReplicationGroupMessage extends js.Object {
  /**
    * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for this parameter is true. 
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster. 
    */
  var GlobalNodeGroupsToRemove: js.UndefOr[GlobalNodeGroupIdList] = js.native
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster. 
    */
  var GlobalNodeGroupsToRetain: js.UndefOr[GlobalNodeGroupIdList] = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The number of node groups (shards) that results from the modification of the shard configuration
    */
  var NodeGroupCount: Integer = js.native
}

object DecreaseNodeGroupsInGlobalReplicationGroupMessage {
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String, NodeGroupCount: Integer): DecreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class DecreaseNodeGroupsInGlobalReplicationGroupMessageOps[Self <: DecreaseNodeGroupsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeGroupCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalNodeGroupsToRemove(value: GlobalNodeGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroupsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNodeGroupsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroupsToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalNodeGroupsToRetain(value: GlobalNodeGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroupsToRetain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNodeGroupsToRetain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroupsToRetain")(js.undefined)
        ret
    }
  }
  
}

