package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobMetrics contains a collection of metrics describing the detailed
  * progress of a Dataflow job. Metrics correspond to user-defined and
  * system-defined metrics in the job.  This resource captures only the most
  * recent values of each metric; time-series data can be queried for them
  * (under the same metric names) from Cloud Monitoring.
  */
@js.native
trait SchemaJobMetrics extends js.Object {
  /**
    * Timestamp as of which metric values are current.
    */
  var metricTime: js.UndefOr[String] = js.native
  /**
    * All metrics for this job.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricUpdate]] = js.native
}

object SchemaJobMetrics {
  @scala.inline
  def apply(): SchemaJobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMetrics]
  }
  @scala.inline
  implicit class SchemaJobMetricsOps[Self <: SchemaJobMetrics] (val x: Self) extends AnyVal {
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
    def withMetrics(value: js.Array[SchemaMetricUpdate]): Self = {
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

