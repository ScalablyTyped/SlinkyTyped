package typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate extends ReplicaGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettingsUpdate")
  var ProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.native
}

object UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(IndexName: String): UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]
  }
  @scala.inline
  implicit class UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdateOps[Self <: UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisionedReadCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedReadCapacityAutoScalingSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedReadCapacityAutoScalingSettingsUpdate")(js.undefined)
        ret
    }
  }
  
}

