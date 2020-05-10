package typingsSlinky.pulumiAws.outputMod.elasticache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupClusterMode extends js.Object {
  /**
    * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
    */
  var numNodeGroups: Double = js.native
  /**
    * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
    */
  var replicasPerNodeGroup: Double = js.native
}

object ReplicationGroupClusterMode {
  @scala.inline
  def apply(numNodeGroups: Double, replicasPerNodeGroup: Double): ReplicationGroupClusterMode = {
    val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationGroupClusterMode]
  }
  @scala.inline
  implicit class ReplicationGroupClusterModeOps[Self <: ReplicationGroupClusterMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumNodeGroups(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNodeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicasPerNodeGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicasPerNodeGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

