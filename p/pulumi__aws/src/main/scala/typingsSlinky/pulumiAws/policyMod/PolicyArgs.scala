package typingsSlinky.pulumiAws.policyMod

import typingsSlinky.pulumiAws.inputMod.appautoscaling.PolicyStepScalingPolicyConfiguration
import typingsSlinky.pulumiAws.inputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyArgs extends js.Object {
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * For DynamoDB, only `TargetTrackingScaling` is supported. For Amazon ECS, Spot Fleet, and Amazon RDS, both `StepScaling` and `TargetTrackingScaling` are supported. For any other service, only `StepScaling` is supported. Defaults to `StepScaling`.
    */
  val policyType: js.UndefOr[Input[String]] = js.native
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: Input[String] = js.native
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: Input[String] = js.native
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: Input[String] = js.native
  /**
    * Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfiguration: js.UndefOr[Input[PolicyStepScalingPolicyConfiguration]] = js.native
  /**
    * A target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
    */
  val targetTrackingScalingPolicyConfiguration: js.UndefOr[Input[PolicyTargetTrackingScalingPolicyConfiguration]] = js.native
}

object PolicyArgs {
  @scala.inline
  def apply(resourceId: Input[String], scalableDimension: Input[String], serviceNamespace: Input[String]): PolicyArgs = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
  @scala.inline
  implicit class PolicyArgsOps[Self <: PolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalableDimension(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalableDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceNamespace")(value.asInstanceOf[js.Any])
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
    def withStepScalingPolicyConfiguration(value: Input[PolicyStepScalingPolicyConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepScalingPolicyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepScalingPolicyConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepScalingPolicyConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTrackingScalingPolicyConfiguration(value: Input[PolicyTargetTrackingScalingPolicyConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTrackingScalingPolicyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTrackingScalingPolicyConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTrackingScalingPolicyConfiguration")(js.undefined)
        ret
    }
  }
  
}

