package typingsSlinky.pulumiAws.autoscalingPolicyMod

import typingsSlinky.pulumiAws.inputMod.autoscaling.PolicyStepAdjustment
import typingsSlinky.pulumiAws.inputMod.autoscaling.PolicyTargetTrackingConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyState extends js.Object {
  /**
    * Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
    */
  val adjustmentType: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the autoscaling group.
    */
  val autoscalingGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
    */
  val cooldown: js.UndefOr[Input[Double]] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance will contribute CloudWatch metrics. Without a value, AWS will default to the group's specified cooldown period.
    */
  val estimatedInstanceWarmup: js.UndefOr[Input[Double]] = js.native
  /**
    * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
    */
  val metricAggregationType: js.UndefOr[Input[String]] = js.native
  val minAdjustmentMagnitude: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the dimension.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The policy type, either "SimpleScaling", "StepScaling" or "TargetTrackingScaling". If this value isn't provided, AWS will default to "SimpleScaling."
    */
  val policyType: js.UndefOr[Input[String]] = js.native
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  val scalingAdjustment: js.UndefOr[Input[Double]] = js.native
  /**
    * A set of adjustments that manage
    * group scaling. These have the following structure:
    */
  val stepAdjustments: js.UndefOr[Input[js.Array[Input[PolicyStepAdjustment]]]] = js.native
  /**
    * A target tracking policy. These have the following structure:
    */
  val targetTrackingConfiguration: js.UndefOr[Input[PolicyTargetTrackingConfiguration]] = js.native
}

object PolicyState {
  @scala.inline
  def apply(): PolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyState]
  }
  @scala.inline
  implicit class PolicyStateOps[Self <: PolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustmentType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoscalingGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withCooldown(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedInstanceWarmup(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedInstanceWarmup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedInstanceWarmup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedInstanceWarmup")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricAggregationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricAggregationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricAggregationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricAggregationType")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAdjustmentMagnitude(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAdjustmentMagnitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAdjustmentMagnitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAdjustmentMagnitude")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyType")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingAdjustment(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingAdjustment")(js.undefined)
        ret
    }
    @scala.inline
    def withStepAdjustments(value: Input[js.Array[Input[PolicyStepAdjustment]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepAdjustments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepAdjustments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepAdjustments")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTrackingConfiguration(value: Input[PolicyTargetTrackingConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTrackingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTrackingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTrackingConfiguration")(js.undefined)
        ret
    }
  }
  
}

