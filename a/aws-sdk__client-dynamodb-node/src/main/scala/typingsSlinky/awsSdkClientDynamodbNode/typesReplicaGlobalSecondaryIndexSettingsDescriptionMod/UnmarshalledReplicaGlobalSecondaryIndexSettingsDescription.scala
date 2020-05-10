package typingsSlinky.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription extends ReplicaGlobalSecondaryIndexSettingsDescription {
  /**
    * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettings")
  var ProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
  /**
    * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettings")
  var ProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
}

object UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(IndexName: String): UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]
  }
  @scala.inline
  implicit class UnmarshalledReplicaGlobalSecondaryIndexSettingsDescriptionOps[Self <: UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisionedReadCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = {
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
    def withProvisionedWriteCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = {
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

