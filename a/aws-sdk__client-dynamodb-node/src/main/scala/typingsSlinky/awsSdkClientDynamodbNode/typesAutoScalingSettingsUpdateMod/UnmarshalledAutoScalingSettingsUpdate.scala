package typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod

import typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingPolicyUpdateMod.UnmarshalledAutoScalingPolicyUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAutoScalingSettingsUpdate extends AutoScalingSettingsUpdate {
  /**
    * <p>The scaling policy to apply for scaling target global table or global secondary index capacity units.</p>
    */
  @JSName("ScalingPolicyUpdate")
  var ScalingPolicyUpdate_UnmarshalledAutoScalingSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingPolicyUpdate] = js.native
}

object UnmarshalledAutoScalingSettingsUpdate {
  @scala.inline
  def apply(): UnmarshalledAutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAutoScalingSettingsUpdate]
  }
  @scala.inline
  implicit class UnmarshalledAutoScalingSettingsUpdateOps[Self <: UnmarshalledAutoScalingSettingsUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScalingPolicyUpdate(value: UnmarshalledAutoScalingPolicyUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicyUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingPolicyUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicyUpdate")(js.undefined)
        ret
    }
  }
  
}

