package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCompaniesJobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The resource name of the company that owns the jobs to be
    * listed, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Optional.  If set to `true`, only job ID, job requisition ID and language
    * code will be returned.  A typical use is to synchronize job repositories.
    * Defaults to false.
    */
  var idsOnly: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Please DO NOT use this field except for small companies.
    * Suggest counting jobs page by page instead.  Optional.  Set to true if
    * the total number of open jobs is to be returned.  Defaults to false.
    */
  var includeJobsCount: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The requisition ID, also known as posting ID, assigned by the
    * company to the job.  The maximum number of allowable characters is 225.
    */
  var jobRequisitionId: js.UndefOr[String] = js.native
  /**
    * Optional.  The maximum number of jobs to be returned per page of results.
    * If ids_only is set to true, the maximum allowed page size is 1000.
    * Otherwise, the maximum allowed page size is 100.  Default is 100 if empty
    * or a number < 1 is specified.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The starting point of a query result.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceCompaniesJobsList {
  @scala.inline
  def apply(): ParamsResourceCompaniesJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCompaniesJobsList]
  }
  @scala.inline
  implicit class ParamsResourceCompaniesJobsListOps[Self <: ParamsResourceCompaniesJobsList] (val x: Self) extends AnyVal {
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
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withIdsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeJobsCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeJobsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withJobRequisitionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobRequisitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRequisitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobRequisitionId")(js.undefined)
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
  }
  
}

