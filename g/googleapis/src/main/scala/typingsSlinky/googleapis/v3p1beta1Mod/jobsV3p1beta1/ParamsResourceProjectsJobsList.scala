package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsJobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The filter string specifies the jobs to be enumerated.
    * Supported operator: =, AND  The fields eligible for filtering are:  *
    * `companyName` (Required) * `requisitionId` (Optional)  Sample Query:  *
    * companyName = "projects/api-test-project/companies/123" * companyName =
    * "projects/api-test-project/companies/123" AND requisitionId = "req-1"
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional.  The desired job attributes returned for jobs in the search
    * response. Defaults to JobView.JOB_VIEW_FULL if no value is specified.
    */
  var jobView: js.UndefOr[String] = js.native
  /**
    * Optional.  The maximum number of jobs to be returned per page of results.
    * If job_view is set to JobView.JOB_VIEW_ID_ONLY, the maximum allowed page
    * size is 1000. Otherwise, the maximum allowed page size is 100.  Default
    * is 100 if empty or a number < 1 is specified.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The starting point of a query result.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.  The resource name of the project under which the job is
    * created.  The format is "projects/{project_id}", for example,
    * "projects/api-test-project".
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsJobsList {
  @scala.inline
  def apply(): ParamsResourceProjectsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsJobsListOps[Self <: ParamsResourceProjectsJobsList] (val x: Self) extends AnyVal {
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
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withJobView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobView")(js.undefined)
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
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

