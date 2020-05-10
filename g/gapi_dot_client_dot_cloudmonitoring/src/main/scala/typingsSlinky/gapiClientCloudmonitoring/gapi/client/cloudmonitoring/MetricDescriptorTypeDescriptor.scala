package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDescriptorTypeDescriptor extends js.Object {
  /** The method of collecting data for the metric. See Metric types. */
  var metricType: js.UndefOr[String] = js.native
  /** The data type of of individual points in the metric's time series. See Metric value types. */
  var valueType: js.UndefOr[String] = js.native
}

object MetricDescriptorTypeDescriptor {
  @scala.inline
  def apply(): MetricDescriptorTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDescriptorTypeDescriptor]
  }
  @scala.inline
  implicit class MetricDescriptorTypeDescriptorOps[Self <: MetricDescriptorTypeDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricType")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
  }
  
}

