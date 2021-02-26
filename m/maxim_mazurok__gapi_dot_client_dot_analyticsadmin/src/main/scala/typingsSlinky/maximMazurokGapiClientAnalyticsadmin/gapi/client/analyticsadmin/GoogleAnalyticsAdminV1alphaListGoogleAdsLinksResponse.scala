package typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse extends StObject {
  
  /** List of GoogleAdsLinks. */
  var googleAdsLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaGoogleAdsLink]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponseMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleAdsLinks(value: js.Array[GoogleAnalyticsAdminV1alphaGoogleAdsLink]): Self = StObject.set(x, "googleAdsLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAdsLinksUndefined: Self = StObject.set(x, "googleAdsLinks", js.undefined)
    
    @scala.inline
    def setGoogleAdsLinksVarargs(value: GoogleAnalyticsAdminV1alphaGoogleAdsLink*): Self = StObject.set(x, "googleAdsLinks", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
