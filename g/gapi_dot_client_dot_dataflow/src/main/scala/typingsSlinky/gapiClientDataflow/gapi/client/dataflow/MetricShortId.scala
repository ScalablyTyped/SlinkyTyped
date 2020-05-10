package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricShortId extends js.Object {
  /**
    * The index of the corresponding metric in
    * the ReportWorkItemStatusRequest. Required.
    */
  var metricIndex: js.UndefOr[Double] = js.native
  /** The service-generated short identifier for the metric. */
  var shortId: js.UndefOr[String] = js.native
}

object MetricShortId {
  @scala.inline
  def apply(): MetricShortId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricShortId]
  }
  @scala.inline
  implicit class MetricShortIdOps[Self <: MetricShortId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShortId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortId")(js.undefined)
        ret
    }
  }
  
}

