package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutePolicyType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * The breach threshold for the alarm. Conditional: This parameter is required if the policy type is StepScaling and not supported otherwise.
    */
  var BreachThreshold: js.UndefOr[MetricScale] = js.native
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before executing the policy. This parameter is not supported if the policy type is StepScaling or TargetTrackingScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var HonorCooldown: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HonorCooldown] = js.native
  /**
    * The metric value to compare to BreachThreshold. This enables you to execute a policy of type StepScaling and determine which step adjustment to use. For example, if the breach threshold is 50 and you want to use a step adjustment with a lower bound of 0 and an upper bound of 10, you can set the metric value to 59. If you specify a metric value that doesn't correspond to a step adjustment for the policy, the call returns an error. Conditional: This parameter is required if the policy type is StepScaling and not supported otherwise.
    */
  var MetricValue: js.UndefOr[MetricScale] = js.native
  /**
    * The name or ARN of the policy.
    */
  var PolicyName: ResourceName = js.native
}

object ExecutePolicyType {
  @scala.inline
  def apply(PolicyName: ResourceName): ExecutePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutePolicyType]
  }
  @scala.inline
  implicit class ExecutePolicyTypeOps[Self <: ExecutePolicyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScalingGroupName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withBreachThreshold(value: MetricScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreachThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreachThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreachThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorCooldown(value: HonorCooldown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HonorCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HonorCooldown")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricValue(value: MetricScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricValue")(js.undefined)
        ret
    }
  }
  
}

