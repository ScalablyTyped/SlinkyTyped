package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceJobsReportsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If set, only reports created after the specified date/time are returned.
    */
  var createdAfter: js.UndefOr[String] = js.native
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The content owner's external ID on which behalf the user is acting on. If
    * not set, the user is acting for himself (his own channel).
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * Requested page size. Server may return fewer report types than requested.
    * If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListReportsResponse.next_page_token
    * returned in response to the previous call to the `ListReports` method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * If set, only reports whose start time is greater than or equal the
    * specified date/time are returned.
    */
  var startTimeAtOrAfter: js.UndefOr[String] = js.native
  /**
    * If set, only reports whose start time is smaller than the specified
    * date/time are returned.
    */
  var startTimeBefore: js.UndefOr[String] = js.native
}

object ParamsResourceJobsReportsList {
  @scala.inline
  def apply(): ParamsResourceJobsReportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsReportsList]
  }
  @scala.inline
  implicit class ParamsResourceJobsReportsListOps[Self <: ParamsResourceJobsReportsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfContentOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfContentOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeAtOrAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeAtOrAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeAtOrAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeAtOrAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeBefore")(js.undefined)
        ret
    }
  }
  
}

