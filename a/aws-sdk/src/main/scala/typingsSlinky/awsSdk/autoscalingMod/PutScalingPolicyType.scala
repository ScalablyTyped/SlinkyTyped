package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScalingPolicyType extends js.Object {
  /**
    * Specifies whether the ScalingAdjustment parameter is an absolute number or a percentage of the current capacity. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. Valid only if the policy type is StepScaling or SimpleScaling. For more information, see Scaling Adjustment Types in the Amazon EC2 Auto Scaling User Guide.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before any further dynamic scaling activities can start. If this parameter is not specified, the default cooldown period for the group applies. Valid only if the policy type is SimpleScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var Cooldown: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Cooldown] = js.native
  /**
    * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see Disabling a Scaling Policy for an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. The default is to use the value specified for the default cooldown period for the group. Valid only if the policy type is StepScaling or TargetTrackingScaling.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.EstimatedInstanceWarmup] = js.native
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average. Valid only if the policy type is StepScaling.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError. This property replaces the MinAdjustmentStep property. For example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a MinAdjustmentMagnitude of 2. If the group has 4 instances and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a MinAdjustmentMagnitude of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances. Valid only if the policy type is SimpleScaling or StepScaling.
    */
  var MinAdjustmentMagnitude: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MinAdjustmentMagnitude] = js.native
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MinAdjustmentStep] = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: XmlStringMaxLen255 = js.native
  /**
    * The policy type. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling. If the policy type is null, the value is treated as SimpleScaling.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The amount by which a simple scaling policy scales the Auto Scaling group in response to an alarm breach. The adjustment is based on the value that you specified in the AdjustmentType parameter (either an absolute number or a percentage). A positive value adds to the current capacity and a negative value subtracts from the current capacity. For exact capacity, you must specify a positive value. Conditional: If you specify SimpleScaling for the policy type, you must specify this parameter. (Not used with any other policy type.) 
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.native
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach. Conditional: If you specify StepScaling for the policy type, you must specify this parameter. (Not used with any other policy type.) 
    */
  var StepAdjustments: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.StepAdjustments] = js.native
  /**
    * A target tracking scaling policy. Includes support for predefined or customized metrics. For more information, see TargetTrackingConfiguration in the Amazon EC2 Auto Scaling API Reference. Conditional: If you specify TargetTrackingScaling for the policy type, you must specify this parameter. (Not used with any other policy type.) 
    */
  var TargetTrackingConfiguration: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.TargetTrackingConfiguration] = js.native
}

object PutScalingPolicyType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, PolicyName: XmlStringMaxLen255): PutScalingPolicyType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyType]
  }
  @scala.inline
  implicit class PutScalingPolicyTypeOps[Self <: PutScalingPolicyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdjustmentType(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjustmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdjustmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCooldown(value: Cooldown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cooldown")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: ScalingPolicyEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedInstanceWarmup(value: EstimatedInstanceWarmup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedInstanceWarmup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedInstanceWarmup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedInstanceWarmup")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricAggregationType(value: XmlStringMaxLen32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricAggregationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricAggregationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricAggregationType")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAdjustmentMagnitude(value: MinAdjustmentMagnitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinAdjustmentMagnitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAdjustmentMagnitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinAdjustmentMagnitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAdjustmentStep(value: MinAdjustmentStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinAdjustmentStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAdjustmentStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinAdjustmentStep")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyType(value: XmlStringMaxLen64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingAdjustment(value: PolicyIncrement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingAdjustment")(js.undefined)
        ret
    }
    @scala.inline
    def withStepAdjustments(value: StepAdjustments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepAdjustments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepAdjustments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepAdjustments")(js.undefined)
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

