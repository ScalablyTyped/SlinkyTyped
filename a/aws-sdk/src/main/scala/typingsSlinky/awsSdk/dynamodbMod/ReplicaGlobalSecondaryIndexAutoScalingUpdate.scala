package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexAutoScalingUpdate extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.IndexName] = js.native
  var ProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
}

object ReplicaGlobalSecondaryIndexAutoScalingUpdate {
  @scala.inline
  def apply(): ReplicaGlobalSecondaryIndexAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  }
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexAutoScalingUpdateOps[Self <: ReplicaGlobalSecondaryIndexAutoScalingUpdate] (val x: Self) extends AnyVal {
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
    def withProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedReadCapacityAutoScalingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingUpdate")(js.undefined)
        ret
    }
  }
  
}

