package typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest extends StObject {
  
  /** Required. The requests specifying the user links to update. A maximum of 1000 user links can be updated in a batch. */
  var requests: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]] = js.native
}
object GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequestMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
