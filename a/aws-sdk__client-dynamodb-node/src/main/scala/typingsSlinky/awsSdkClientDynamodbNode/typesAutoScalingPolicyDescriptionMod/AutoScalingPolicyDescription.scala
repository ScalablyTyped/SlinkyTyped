package typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingPolicyDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.AutoScalingTargetTrackingScalingPolicyConfigurationDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicyDescription extends js.Object {
  /**
    * <p>The name of the scaling policy.</p>
    */
  var PolicyName: js.UndefOr[String] = js.native
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.native
}

object AutoScalingPolicyDescription {
  @scala.inline
  def apply(): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
  @scala.inline
  implicit class AutoScalingPolicyDescriptionOps[Self <: AutoScalingPolicyDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = {
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

