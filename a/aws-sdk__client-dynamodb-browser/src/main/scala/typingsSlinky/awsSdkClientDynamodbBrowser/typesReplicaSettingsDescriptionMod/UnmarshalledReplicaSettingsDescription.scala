package typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaSettingsDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicaSettingsDescription extends ReplicaSettingsDescription {
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  @JSName("ReplicaGlobalSecondaryIndexSettings")
  var ReplicaGlobalSecondaryIndexSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]] = js.native
  /**
    * <p>Autoscaling settings for a global table replica's read capacity units.</p>
    */
  @JSName("ReplicaProvisionedReadCapacityAutoScalingSettings")
  var ReplicaProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
  /**
    * <p>AutoScaling settings for a global table replica's write capacity units.</p>
    */
  @JSName("ReplicaProvisionedWriteCapacityAutoScalingSettings")
  var ReplicaProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
}

object UnmarshalledReplicaSettingsDescription {
  @scala.inline
  def apply(RegionName: String): UnmarshalledReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaSettingsDescription]
  }
  @scala.inline
  implicit class UnmarshalledReplicaSettingsDescriptionOps[Self <: UnmarshalledReplicaSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicaGlobalSecondaryIndexSettings(value: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaGlobalSecondaryIndexSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaGlobalSecondaryIndexSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaProvisionedReadCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = {
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
    def withReplicaProvisionedWriteCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = {
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
  }
  
}

