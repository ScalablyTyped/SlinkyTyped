package typingsSlinky.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStepScalingPolicyConfigurationStepAdjustment extends js.Object {
  var metricIntervalLowerBound: js.UndefOr[String] = js.native
  var metricIntervalUpperBound: js.UndefOr[String] = js.native
  var scalingAdjustment: Double = js.native
}

object PolicyStepScalingPolicyConfigurationStepAdjustment {
  @scala.inline
  def apply(scalingAdjustment: Double): PolicyStepScalingPolicyConfigurationStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepScalingPolicyConfigurationStepAdjustment]
  }
  @scala.inline
  implicit class PolicyStepScalingPolicyConfigurationStepAdjustmentOps[Self <: PolicyStepScalingPolicyConfigurationStepAdjustment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScalingAdjustment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricIntervalLowerBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricIntervalLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricIntervalLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricIntervalLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricIntervalUpperBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricIntervalUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricIntervalUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricIntervalUpperBound")(js.undefined)
        ret
    }
  }
  
}

