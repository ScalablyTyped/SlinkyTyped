package typingsSlinky.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStepScalingPolicyConfiguration extends js.Object {
  var adjustmentType: js.UndefOr[String] = js.native
  var cooldown: js.UndefOr[Double] = js.native
  var metricAggregationType: js.UndefOr[String] = js.native
  var minAdjustmentMagnitude: js.UndefOr[Double] = js.native
  var stepAdjustments: js.UndefOr[js.Array[PolicyStepScalingPolicyConfigurationStepAdjustment]] = js.native
}

object PolicyStepScalingPolicyConfiguration {
  @scala.inline
  def apply(): PolicyStepScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyStepScalingPolicyConfiguration]
  }
  @scala.inline
  implicit class PolicyStepScalingPolicyConfigurationOps[Self <: PolicyStepScalingPolicyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustmentType(value: String): Self = {
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
    def withCooldown(value: Double): Self = {
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
    def withMetricAggregationType(value: String): Self = {
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
    def withMinAdjustmentMagnitude(value: Double): Self = {
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
    def withStepAdjustments(value: js.Array[PolicyStepScalingPolicyConfigurationStepAdjustment]): Self = {
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
  }
  
}

