package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricTarget defines the target value, average value, or average utilization of a specific
  * metric
  */
@js.native
trait MetricTarget extends js.Object {
  /**
    * averageUtilization is the target value of the average of the resource metric across all
    * relevant pods, represented as a percentage of the requested value of the resource for the
    * pods. Currently only valid for Resource metric source type
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.native
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.native
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  var `type`: Input[String] = js.native
  /**
    * value is the target value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.native
}

object MetricTarget {
  @scala.inline
  def apply(`type`: Input[String]): MetricTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTarget]
  }
  @scala.inline
  implicit class MetricTargetOps[Self <: MetricTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
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

