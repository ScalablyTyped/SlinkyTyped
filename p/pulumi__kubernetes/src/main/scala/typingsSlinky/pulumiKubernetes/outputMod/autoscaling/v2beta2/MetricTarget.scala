package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2

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
  val averageUtilization: Double = js.native
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  val averageValue: String = js.native
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  val `type`: String = js.native
  /**
    * value is the target value of the metric (as a quantity).
    */
  val value: String = js.native
}

object MetricTarget {
  @scala.inline
  def apply(averageUtilization: Double, averageValue: String, `type`: String, value: String): MetricTarget = {
    val __obj = js.Dynamic.literal(averageUtilization = averageUtilization.asInstanceOf[js.Any], averageValue = averageValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

