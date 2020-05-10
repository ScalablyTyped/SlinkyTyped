package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPolicy extends js.Object {
  /**
    * The adjustment type, which specifies how ScalingAdjustment is interpreted. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The CloudWatch alarms related to the policy.
    */
  var Alarms: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Alarms] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before any further dynamic scaling activities can start.
    */
  var Cooldown: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Cooldown] = js.native
  /**
    * Indicates whether the policy is enabled (true) or disabled (false).
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.EstimatedInstanceWarmup] = js.native
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError.
    */
  var MinAdjustmentMagnitude: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MinAdjustmentMagnitude] = js.native
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MinAdjustmentStep] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The policy type. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.native
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach.
    */
  var StepAdjustments: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.StepAdjustments] = js.native
  /**
    * A target tracking scaling policy.
    */
  var TargetTrackingConfiguration: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.TargetTrackingConfiguration] = js.native
}

object ScalingPolicy {
  @scala.inline
  def apply(): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingPolicy]
  }
  @scala.inline
  implicit class ScalingPolicyOps[Self <: ScalingPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAlarms(value: Alarms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroupName(value: XmlStringMaxLen255): Self = {
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
    def withPolicyARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyARN")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: XmlStringMaxLen255): Self = {
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

