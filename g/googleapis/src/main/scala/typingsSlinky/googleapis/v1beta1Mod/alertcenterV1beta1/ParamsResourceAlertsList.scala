package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAlertsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alerts are associated with. Inferred from the caller
    * identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Optional. A query string for filtering alert results. For more details,
    * see [Query filters](/admin-sdk/alertcenter/guides/query-filters) and
    * [Supported query filter
    * fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional. The sort order of the list results. If not specified results
    * may be returned in arbitrary order. You can sort the results in
    * descending order based on the creation timestamp using
    * `order_by="create_time desc"`. Currently, only sorting by `create_time
    * desc` is supported.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Optional. The requested page size. Server may return fewer items than
    * requested. If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. A token identifying a page of results the server should return.
    * If empty, a new iteration is started. To continue an iteration, pass in
    * the value from the previous ListAlertsResponse's next_page_token field.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceAlertsList {
  
  @scala.inline
  def apply(): ParamsResourceAlertsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAlertsListMutableBuilder[Self <: ParamsResourceAlertsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
