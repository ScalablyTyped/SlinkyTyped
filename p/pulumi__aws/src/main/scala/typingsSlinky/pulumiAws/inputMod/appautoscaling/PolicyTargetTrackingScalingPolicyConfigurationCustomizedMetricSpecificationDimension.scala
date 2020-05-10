package typingsSlinky.pulumiAws.inputMod.appautoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension extends js.Object {
  /**
    * The name of the policy.
    */
  var name: Input[String] = js.native
  var value: Input[String] = js.native
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension]
  }
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionOps[Self <: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

