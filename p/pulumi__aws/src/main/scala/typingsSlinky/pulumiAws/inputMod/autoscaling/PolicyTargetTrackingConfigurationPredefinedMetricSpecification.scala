package typingsSlinky.pulumiAws.inputMod.autoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfigurationPredefinedMetricSpecification extends js.Object {
  /**
    * The metric type.
    */
  var predefinedMetricType: Input[String] = js.native
  /**
    * Identifies the resource associated with the metric type.
    */
  var resourceLabel: js.UndefOr[Input[String]] = js.native
}

object PolicyTargetTrackingConfigurationPredefinedMetricSpecification {
  @scala.inline
  def apply(predefinedMetricType: Input[String]): PolicyTargetTrackingConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]
  }
  @scala.inline
  implicit class PolicyTargetTrackingConfigurationPredefinedMetricSpecificationOps[Self <: PolicyTargetTrackingConfigurationPredefinedMetricSpecification] (val x: Self) extends AnyVal {
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

