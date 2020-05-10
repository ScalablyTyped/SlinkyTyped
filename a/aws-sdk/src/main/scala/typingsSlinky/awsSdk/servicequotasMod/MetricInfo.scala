package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricInfo extends js.Object {
  /**
    * A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific characteristics that describe it, and you can think of dimensions as categories for those characteristics. These dimensions are part of the CloudWatch Metric Identity that measures usage against a particular service quota.
    */
  var MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition] = js.native
  /**
    * The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
    */
  var MetricName: js.UndefOr[QuotaMetricName] = js.native
  /**
    * The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name for the namespace when you create a metric.
    */
  var MetricNamespace: js.UndefOr[QuotaMetricNamespace] = js.native
  /**
    * Statistics are metric data aggregations over specified periods of time. This is the recommended statistic to use when comparing usage in the CloudWatch Metric against your Service Quota.
    */
  var MetricStatisticRecommendation: js.UndefOr[Statistic] = js.native
}

object MetricInfo {
  @scala.inline
  def apply(): MetricInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricInfo]
  }
  @scala.inline
  implicit class MetricInfoOps[Self <: MetricInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricDimensions(value: MetricDimensionsMapDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricName(value: QuotaMetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricNamespace(value: QuotaMetricNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricStatisticRecommendation(value: Statistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricStatisticRecommendation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricStatisticRecommendation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricStatisticRecommendation")(js.undefined)
        ret
    }
  }
  
}

