package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of results returned by this request. Currently, the
    * default maximum is set to 1000. If `page_size` isn't provided or the size
    * provided is a number larger than 1000, it's automatically set to 1000.
    * Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.  Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Service for which search is performed. services/{service} {service} the
    * name of a service, for example 'service.googleapis.com'.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Set a query `{expression}` for querying tenancy units. Your
    * `{expression}` must be in the format: `field_name=literal_string`. The
    * `field_name` is the name of the field you want to compare. Supported
    * fields are `tenant_resources.tag` and `tenant_resources.resource`.  For
    * example, to search tenancy units that contain at least one tenant
    * resource with a given tag 'xyz', use the query
    * `tenant_resources.tag=xyz`. To search tenancy units that contain at least
    * one tenant resource with a given resource name 'projects/123456', use the
    * query `tenant_resources.resource=projects/123456`.  Multiple expressions
    * can be joined with `AND`s. Tenancy units must match all expressions to be
    * included in the result set. For example, `tenant_resources.tag=xyz AND
    * tenant_resources.resource=projects/123456`  Optional.
    */
  var query: js.UndefOr[String] = js.native
}

object ParamsResourceServicesSearch {
  @scala.inline
  def apply(): ParamsResourceServicesSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesSearch]
  }
  @scala.inline
  implicit class ParamsResourceServicesSearchOps[Self <: ParamsResourceServicesSearch] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

