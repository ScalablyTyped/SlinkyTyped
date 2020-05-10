package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPolicy extends js.Object {
  /**
    * The name of the scaling policy.
    */
  var PolicyName: typingsSlinky.awsSdk.autoscalingplansMod.PolicyName = js.native
  /**
    * The type of scaling policy.
    */
  var PolicyType: typingsSlinky.awsSdk.autoscalingplansMod.PolicyType = js.native
  /**
    * The target tracking scaling policy. Includes support for predefined or customized metrics.
    */
  var TargetTrackingConfiguration: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.TargetTrackingConfiguration] = js.native
}

object ScalingPolicy {
  @scala.inline
  def apply(PolicyName: PolicyName, PolicyType: PolicyType): ScalingPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
  @scala.inline
  implicit class ScalingPolicyOps[Self <: ScalingPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyType(value: PolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTrackingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTrackingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTrackingConfiguration")(js.undefined)
        ret
    }
  }
  
}

