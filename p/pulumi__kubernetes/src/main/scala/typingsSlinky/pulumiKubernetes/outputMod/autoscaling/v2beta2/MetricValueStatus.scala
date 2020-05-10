package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2

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
  val averageUtilization: Double = js.native
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  val averageValue: String = js.native
  /**
    * value is the current value of the metric (as a quantity).
    */
  val value: String = js.native
}

object MetricValueStatus {
  @scala.inline
  def apply(averageUtilization: Double, averageValue: String, value: String): MetricValueStatus = {
    val __obj = js.Dynamic.literal(averageUtilization = averageUtilization.asInstanceOf[js.Any], averageValue = averageValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValueStatus]
  }
  @scala.inline
  implicit class MetricValueStatusOps[Self <: MetricValueStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageUtilization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAverageValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

