package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricValueStatus holds the current value for a metric
  */
@js.native
trait MetricValueStatus extends js.Object {
  /**
    * currentAverageUtilization is the current value of the average of the resource metric across
    * all relevant pods, represented as a percentage of the requested value of the resource for
    * the pods.
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.native
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.native
  /**
    * value is the current value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.native
}

object MetricValueStatus {
  @scala.inline
  def apply(): MetricValueStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValueStatus]
  }
  @scala.inline
  implicit class MetricValueStatusOps[Self <: MetricValueStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageUtilization(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

