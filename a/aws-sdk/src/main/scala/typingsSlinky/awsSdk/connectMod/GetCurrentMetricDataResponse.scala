package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentMetricDataResponse extends js.Object {
  /**
    * The time at which the metrics were retrieved and cached for pagination.
    */
  var DataSnapshotTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the real-time metrics.
    */
  var MetricResults: js.UndefOr[CurrentMetricResults] = js.native
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
}

object GetCurrentMetricDataResponse {
  @scala.inline
  def apply(): GetCurrentMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentMetricDataResponse]
  }
  @scala.inline
  implicit class GetCurrentMetricDataResponseOps[Self <: GetCurrentMetricDataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSnapshotTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSnapshotTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSnapshotTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSnapshotTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricResults(value: CurrentMetricResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
  }
  
}

