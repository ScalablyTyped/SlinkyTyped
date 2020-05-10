package typingsSlinky.pulumiAws.inputMod.autoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStepAdjustment extends js.Object {
  /**
    * The lower bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity.
    */
  var metricIntervalLowerBound: js.UndefOr[Input[String]] = js.native
  /**
    * The upper bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity. The upper bound
    * must be greater than the lower bound.
    */
  var metricIntervalUpperBound: js.UndefOr[Input[String]] = js.native
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  var scalingAdjustment: Input[Double] = js.native
}

object PolicyStepAdjustment {
  @scala.inline
  def apply(scalingAdjustment: Input[Double]): PolicyStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepAdjustment]
  }
  @scala.inline
  implicit class PolicyStepAdjustmentOps[Self <: PolicyStepAdjustment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScalingAdjustment(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricIntervalLowerBound(value: Input[String]): Self = {
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
    def withMetricIntervalUpperBound(value: Input[String]): Self = {
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

