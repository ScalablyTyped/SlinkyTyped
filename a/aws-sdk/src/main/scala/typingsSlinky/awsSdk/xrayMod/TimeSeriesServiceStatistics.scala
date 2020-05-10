package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSeriesServiceStatistics extends js.Object {
  var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics] = js.native
  /**
    * The response time histogram for the selected entities.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.native
  var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics] = js.native
  /**
    * Timestamp of the window for which statistics are aggregated.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
}

object TimeSeriesServiceStatistics {
  @scala.inline
  def apply(): TimeSeriesServiceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesServiceStatistics]
  }
  @scala.inline
  implicit class TimeSeriesServiceStatisticsOps[Self <: TimeSeriesServiceStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeSummaryStatistics(value: EdgeStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EdgeSummaryStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeSummaryStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EdgeSummaryStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTimeHistogram(value: Histogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTimeHistogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTimeHistogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTimeHistogram")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceSummaryStatistics(value: ServiceStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSummaryStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceSummaryStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSummaryStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

