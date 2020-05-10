package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseReplicaCountMessage extends js.Object {
  /**
    * If True, the number of replica nodes is decreased immediately. ApplyImmediately=False is not currently supported.
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ with Automatic Failover is enabled: 1   If Multi-AZ with Automatic Failover is not enabled: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
    */
  var NewReplicaCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
    */
  var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.native
  /**
    * A list of the node ids to remove from the replication group or node group (shard).
    */
  var ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.native
  /**
    * The id of the replication group from which you want to remove replica nodes.
    */
  var ReplicationGroupId: String = js.native
}

object DecreaseReplicaCountMessage {
  @scala.inline
  def apply(ApplyImmediately: Boolean, ReplicationGroupId: String): DecreaseReplicaCountMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicaCountMessage]
  }
  @scala.inline
  implicit class DecreaseReplicaCountMessageOps[Self <: DecreaseReplicaCountMessage] (val x: Self) extends AnyVal {
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
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewReplicaCount(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewReplicaCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewReplicaCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewReplicaCount")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaConfiguration(value: ReplicaConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicasToRemove(value: RemoveReplicasList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicasToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicasToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicasToRemove")(js.undefined)
        ret
    }
  }
  
}

