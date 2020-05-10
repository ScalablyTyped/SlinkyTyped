package typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate extends GlobalTableGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettingsUpdate")
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate_UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.native
}

object UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(IndexName: String): UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
  @scala.inline
  implicit class UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdateOps[Self <: UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisionedWriteCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(js.undefined)
        ret
    }
  }
  
}

