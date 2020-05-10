package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReportsRequest extends js.Object {
  /**
    * Requests, each request will have a separate response.
    * There can be a maximum of 5 requests. All requests should have the same
    * `dateRanges`, `viewId`, `segments`, `samplingLevel`, and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.native
}

object GetReportsRequest {
  @scala.inline
  def apply(): GetReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsRequest]
  }
  @scala.inline
  implicit class GetReportsRequestOps[Self <: GetReportsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportRequests(value: js.Array[ReportRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportRequests")(js.undefined)
        ret
    }
  }
  
}

