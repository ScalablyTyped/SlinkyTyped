package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricTransformation extends js.Object {
  /**
    * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
    */
  var defaultValue: js.UndefOr[DefaultValue] = js.native
  /**
    * The name of the CloudWatch metric.
    */
  var metricName: MetricName = js.native
  /**
    * The namespace of the CloudWatch metric.
    */
  var metricNamespace: MetricNamespace = js.native
  /**
    * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
    */
  var metricValue: MetricValue = js.native
}

object MetricTransformation {
  @scala.inline
  def apply(metricName: MetricName, metricNamespace: MetricNamespace, metricValue: MetricValue): MetricTransformation = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTransformation]
  }
  @scala.inline
  implicit class MetricTransformationOps[Self <: MetricTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricNamespace(value: MetricNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricValue(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: DefaultValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
  }
  
}

