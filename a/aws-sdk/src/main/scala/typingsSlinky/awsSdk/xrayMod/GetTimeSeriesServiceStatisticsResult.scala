package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTimeSeriesServiceStatisticsResult extends js.Object {
  /**
    * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation may show statistics from an older version of the group's filter expression.
    */
  var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.native
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The collection of statistics.
    */
  var TimeSeriesServiceStatistics: js.UndefOr[TimeSeriesServiceStatisticsList] = js.native
}

object GetTimeSeriesServiceStatisticsResult {
  @scala.inline
  def apply(): GetTimeSeriesServiceStatisticsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsResult]
  }
  @scala.inline
  implicit class GetTimeSeriesServiceStatisticsResultOps[Self <: GetTimeSeriesServiceStatisticsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsOldGroupVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsOldGroupVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsOldGroupVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsOldGroupVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSeriesServiceStatistics(value: TimeSeriesServiceStatisticsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeSeriesServiceStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSeriesServiceStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeSeriesServiceStatistics")(js.undefined)
        ret
    }
  }
  
}

