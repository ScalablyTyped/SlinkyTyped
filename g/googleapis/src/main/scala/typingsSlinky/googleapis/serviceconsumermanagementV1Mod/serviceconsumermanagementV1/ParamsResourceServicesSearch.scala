package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
