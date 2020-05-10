package typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod.UnmarshalledAutoScalingPolicyDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAutoScalingSettingsDescription extends AutoScalingSettingsDescription {
  /**
    * <p>Information about the scaling policies.</p>
    */
  @JSName("ScalingPolicies")
  var ScalingPolicies_UnmarshalledAutoScalingSettingsDescription: js.UndefOr[js.Array[UnmarshalledAutoScalingPolicyDescription]] = js.native
}

object UnmarshalledAutoScalingSettingsDescription {
  @scala.inline
  def apply(): UnmarshalledAutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAutoScalingSettingsDescription]
  }
  @scala.inline
  implicit class UnmarshalledAutoScalingSettingsDescriptionOps[Self <: UnmarshalledAutoScalingSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScalingPolicies(value: js.Array[UnmarshalledAutoScalingPolicyDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicies")(js.undefined)
        ret
    }
  }
  
}

