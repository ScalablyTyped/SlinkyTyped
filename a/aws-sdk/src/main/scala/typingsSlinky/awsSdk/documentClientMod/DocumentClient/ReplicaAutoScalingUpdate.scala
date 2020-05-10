package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaAutoScalingUpdate extends js.Object {
  /**
    * The Region where the replica exists.
    */
  var RegionName: typingsSlinky.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
  /**
    * Represents the auto scaling settings of global secondary indexes that will be modified.
    */
  var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList] = js.native
  var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
}

object ReplicaAutoScalingUpdate {
  @scala.inline
  def apply(RegionName: RegionName): ReplicaAutoScalingUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAutoScalingUpdate]
  }
  @scala.inline
  implicit class ReplicaAutoScalingUpdateOps[Self <: ReplicaAutoScalingUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegionName(value: RegionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicaGlobalSecondaryIndexUpdates(value: ReplicaGlobalSecondaryIndexAutoScalingUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaGlobalSecondaryIndexUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedReadCapacityAutoScalingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingUpdate")(js.undefined)
        ret
    }
  }
  
}

