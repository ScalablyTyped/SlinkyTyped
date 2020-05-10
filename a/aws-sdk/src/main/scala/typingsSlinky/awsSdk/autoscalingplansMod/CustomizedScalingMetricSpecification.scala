package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizedScalingMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric. Conditional: If you published your metric with dimensions, you must specify the same dimensions in your customized scaling metric specification.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: typingsSlinky.awsSdk.autoscalingplansMod.MetricName = js.native
  /**
    * The namespace of the metric.
    */
  var Namespace: MetricNamespace = js.native
  /**
    * The statistic of the metric.
    */
  var Statistic: MetricStatistic = js.native
  /**
    * The unit of the metric. 
    */
  var Unit: js.UndefOr[MetricUnit] = js.native
}

object CustomizedScalingMetricSpecification {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: MetricNamespace, Statistic: MetricStatistic): CustomizedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedScalingMetricSpecification]
  }
  @scala.inline
  implicit class CustomizedScalingMetricSpecificationOps[Self <: CustomizedScalingMetricSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: MetricNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistic(value: MetricStatistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: MetricDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: MetricUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(js.undefined)
        ret
    }
  }
  
}

