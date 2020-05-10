package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricHeader extends js.Object {
  /** Headers for the metrics in the response. */
  var metricHeaderEntries: js.UndefOr[js.Array[MetricHeaderEntry]] = js.native
  /** Headers for the pivots in the response. */
  var pivotHeaders: js.UndefOr[js.Array[PivotHeader]] = js.native
}

object MetricHeader {
  @scala.inline
  def apply(): MetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricHeader]
  }
  @scala.inline
  implicit class MetricHeaderOps[Self <: MetricHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricHeaderEntries(value: js.Array[MetricHeaderEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricHeaderEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricHeaderEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricHeaderEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotHeaders(value: js.Array[PivotHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaders")(js.undefined)
        ret
    }
  }
  
}

