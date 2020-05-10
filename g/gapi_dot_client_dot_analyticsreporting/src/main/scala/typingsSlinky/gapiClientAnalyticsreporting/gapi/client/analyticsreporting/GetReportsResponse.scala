package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReportsResponse extends js.Object {
  /** Responses corresponding to each of the request. */
  var reports: js.UndefOr[js.Array[Report]] = js.native
}

object GetReportsResponse {
  @scala.inline
  def apply(): GetReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsResponse]
  }
  @scala.inline
  implicit class GetReportsResponseOps[Self <: GetReportsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReports(value: js.Array[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(js.undefined)
        ret
    }
  }
  
}

