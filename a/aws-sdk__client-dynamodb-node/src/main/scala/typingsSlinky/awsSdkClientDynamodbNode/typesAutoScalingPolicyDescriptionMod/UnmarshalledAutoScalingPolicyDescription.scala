package typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingPolicyDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAutoScalingPolicyDescription extends AutoScalingPolicyDescription {
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  @JSName("TargetTrackingScalingPolicyConfiguration")
  var TargetTrackingScalingPolicyConfiguration_UnmarshalledAutoScalingPolicyDescription: js.UndefOr[UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.native
}

object UnmarshalledAutoScalingPolicyDescription {
  @scala.inline
  def apply(): UnmarshalledAutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAutoScalingPolicyDescription]
  }
  @scala.inline
  implicit class UnmarshalledAutoScalingPolicyDescriptionOps[Self <: UnmarshalledAutoScalingPolicyDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetTrackingScalingPolicyConfiguration(value: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTrackingScalingPolicyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTrackingScalingPolicyConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTrackingScalingPolicyConfiguration")(js.undefined)
        ret
    }
  }
  
}

