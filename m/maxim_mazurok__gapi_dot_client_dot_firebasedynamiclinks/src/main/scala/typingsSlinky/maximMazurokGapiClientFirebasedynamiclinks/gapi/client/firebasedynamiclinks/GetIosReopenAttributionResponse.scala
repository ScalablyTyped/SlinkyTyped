package typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIosReopenAttributionResponse extends StObject {
  
  /** The deep-link attributed the app universal link open. For both regular FDL links and invite FDL links. */
  var deepLink: js.UndefOr[String] = js.native
  
  /** Optional invitation ID, for only invite typed requested FDL links. */
  var invitationId: js.UndefOr[String] = js.native
  
  /** FDL input value of the "&imv=" parameter, minimum app version to be returned to Google Firebase SDK running on iOS-9. */
  var iosMinAppVersion: js.UndefOr[String] = js.native
  
  /** The entire FDL, expanded from a short link. It is the same as the requested_link, if it is long. */
  var resolvedLink: js.UndefOr[String] = js.native
  
  /** Scion campaign value to be propagated by iSDK to Scion at app-reopen. */
  var utmCampaign: js.UndefOr[String] = js.native
  
  /** Scion content value to be propagated by iSDK to Scion at app-reopen. */
  var utmContent: js.UndefOr[String] = js.native
  
  /** Scion medium value to be propagated by iSDK to Scion at app-reopen. */
  var utmMedium: js.UndefOr[String] = js.native
  
  /** Scion source value to be propagated by iSDK to Scion at app-reopen. */
  var utmSource: js.UndefOr[String] = js.native
  
  /** Scion term value to be propagated by iSDK to Scion at app-reopen. */
  var utmTerm: js.UndefOr[String] = js.native
}
object GetIosReopenAttributionResponse {
  
  @scala.inline
  def apply(): GetIosReopenAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIosReopenAttributionResponse]
  }
  
  @scala.inline
  implicit class GetIosReopenAttributionResponseMutableBuilder[Self <: GetIosReopenAttributionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeepLink(value: String): Self = StObject.set(x, "deepLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepLinkUndefined: Self = StObject.set(x, "deepLink", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    @scala.inline
    def setIosMinAppVersion(value: String): Self = StObject.set(x, "iosMinAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosMinAppVersionUndefined: Self = StObject.set(x, "iosMinAppVersion", js.undefined)
    
    @scala.inline
    def setResolvedLink(value: String): Self = StObject.set(x, "resolvedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedLinkUndefined: Self = StObject.set(x, "resolvedLink", js.undefined)
    
    @scala.inline
    def setUtmCampaign(value: String): Self = StObject.set(x, "utmCampaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmCampaignUndefined: Self = StObject.set(x, "utmCampaign", js.undefined)
    
    @scala.inline
    def setUtmContent(value: String): Self = StObject.set(x, "utmContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmContentUndefined: Self = StObject.set(x, "utmContent", js.undefined)
    
    @scala.inline
    def setUtmMedium(value: String): Self = StObject.set(x, "utmMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmMediumUndefined: Self = StObject.set(x, "utmMedium", js.undefined)
    
    @scala.inline
    def setUtmSource(value: String): Self = StObject.set(x, "utmSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmSourceUndefined: Self = StObject.set(x, "utmSource", js.undefined)
    
    @scala.inline
    def setUtmTerm(value: String): Self = StObject.set(x, "utmTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmTermUndefined: Self = StObject.set(x, "utmTerm", js.undefined)
  }
}
