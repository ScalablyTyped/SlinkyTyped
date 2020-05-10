package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaAutoScalingDescription extends js.Object {
  /**
    * Replica-specific global secondary index auto scaling settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingDescriptionList] = js.native
  /**
    * The Region where the replica exists.
    */
  var RegionName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.RegionName] = js.native
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaStatus] = js.native
}

object ReplicaAutoScalingDescription {
  @scala.inline
  def apply(): ReplicaAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaAutoScalingDescription]
  }
  @scala.inline
  implicit class ReplicaAutoScalingDescriptionOps[Self <: ReplicaAutoScalingDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexAutoScalingDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionName(value: RegionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedReadCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaProvisionedWriteCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaStatus(value: ReplicaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaStatus")(js.undefined)
        ret
    }
  }
  
}

