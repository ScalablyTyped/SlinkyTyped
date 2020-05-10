package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobMetrics extends js.Object {
  /** Timestamp as of which metric values are current. */
  var metricTime: js.UndefOr[String] = js.native
  /** All metrics for this job. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.native
}

object JobMetrics {
  @scala.inline
  def apply(): JobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetrics]
  }
  @scala.inline
  implicit class JobMetricsOps[Self <: JobMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[MetricUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
  }
  
}

