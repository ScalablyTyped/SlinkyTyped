package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistoryList extends StandardParameters {
  /**
    * Only include resource versions that were current at some point during the
    * time period specified in the date time value. The date parameter format
    * is yyyy-mm-ddThh:mm:ss[Z|(+|-)hh:mm] Clients may specify any of the
    * following: An entire year: `_at=2019` An entire month: `_at=2019-01` A
    * specific day: `_at=2019-01-20` A specific second:
    * `_at=2018-12-31T23:59:58Z`
    */
  var at: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of search results on a page.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The name of the resource to retrieve.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Used to retrieve the first, previous, next, or last page of resource
    * versions when using pagination. Value should be set to the value of the
    * `link.url` field returned in the response to the previous request, where
    * `link.relation` is "first", "previous", "next" or "last". Omit `page` if
    * no previous request has been made.
    */
  var page: js.UndefOr[String] = js.native
  /**
    * Only include resource versions that were created at or after the given
    * instant in time. The instant in time uses the format
    * YYYY-MM-DDThh:mm:ss.sss+zz:zz (for example 2015-02-07T13:28:17.239+02:00
    * or 2017-01-01T00:00:00Z). The time must be specified to the second and
    * include a time zone.
    */
  var since: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistoryList {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistoryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistoryList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistoryListOps[Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistoryList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.undefined)
        ret
    }
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
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
  }
  
}

