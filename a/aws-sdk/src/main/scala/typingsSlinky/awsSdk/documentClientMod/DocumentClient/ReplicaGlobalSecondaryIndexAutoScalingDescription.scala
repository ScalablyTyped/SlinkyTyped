package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * The current state of the replica global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexStatus] = js.native
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
}

object ReplicaGlobalSecondaryIndexAutoScalingDescription {
  @scala.inline
  def apply(): ReplicaGlobalSecondaryIndexAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  }
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexAutoScalingDescriptionOps[Self <: ReplicaGlobalSecondaryIndexAutoScalingDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexStatus(value: IndexStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedReadCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedWriteCapacityAutoScalingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(js.undefined)
        ret
    }
  }
  
}

