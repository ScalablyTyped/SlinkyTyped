package typingsSlinky.pulumiAws.inputMod.appautoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification extends js.Object {
  var predefinedMetricType: Input[String] = js.native
  var resourceLabel: js.UndefOr[Input[String]] = js.native
}

object PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
  @scala.inline
  def apply(predefinedMetricType: Input[String]): PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]
  }
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationOps[Self <: PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredefinedMetricType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedMetricType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceLabel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLabel")(js.undefined)
        ret
    }
  }
  
}

