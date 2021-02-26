package typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest extends StObject {
  
  /**
    * Optional. If set, then email the new users notifying them that they've been granted permissions to the resource. Regardless of whether this is set or not, notify_new_user field
    * inside each individual request is ignored.
    */
  var notifyNewUsers: js.UndefOr[Boolean] = js.native
  
  /** Required. The requests specifying the user links to create. A maximum of 1000 user links can be created in a batch. */
  var requests: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaCreateUserLinkRequest]] = js.native
}
object GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequestMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyNewUsers(value: Boolean): Self = StObject.set(x, "notifyNewUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyNewUsersUndefined: Self = StObject.set(x, "notifyNewUsers", js.undefined)
    
    @scala.inline
    def setRequests(value: js.Array[GoogleAnalyticsAdminV1alphaCreateUserLinkRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: GoogleAnalyticsAdminV1alphaCreateUserLinkRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
