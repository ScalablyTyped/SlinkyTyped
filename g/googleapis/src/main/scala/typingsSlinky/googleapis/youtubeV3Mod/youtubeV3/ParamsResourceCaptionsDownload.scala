package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCaptionsDownload extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The id parameter identifies the caption track that is being retrieved.
    * The value is a caption track ID as identified by the id property in a
    * caption resource.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * ID of the Google+ Page for the channel that the request is be on behalf
    * of
    */
  var onBehalfOf: js.UndefOr[String] = js.native
  
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The onBehalfOfContentOwner parameter indicates that the
    * request's authorization credentials identify a YouTube CMS user who is
    * acting on behalf of the content owner specified in the parameter value.
    * This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The actual CMS account that the user authenticates with must be
    * linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * The tfmt parameter specifies that the caption track should be returned in
    * a specific format. If the parameter is not included in the request, the
    * track is returned in its original format.
    */
  var tfmt: js.UndefOr[String] = js.native
  
  /**
    * The tlang parameter specifies that the API response should return a
    * translation of the specified caption track. The parameter value is an ISO
    * 639-1 two-letter language code that identifies the desired caption
    * language. The translation is generated by using machine translation, such
    * as Google Translate.
    */
  var tlang: js.UndefOr[String] = js.native
}
object ParamsResourceCaptionsDownload {
  
  @scala.inline
  def apply(): ParamsResourceCaptionsDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCaptionsDownload]
  }
  
  @scala.inline
  implicit class ParamsResourceCaptionsDownloadMutableBuilder[Self <: ParamsResourceCaptionsDownload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOnBehalfOf(value: String): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    @scala.inline
    def setTfmt(value: String): Self = StObject.set(x, "tfmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfmtUndefined: Self = StObject.set(x, "tfmt", js.undefined)
    
    @scala.inline
    def setTlang(value: String): Self = StObject.set(x, "tlang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlangUndefined: Self = StObject.set(x, "tlang", js.undefined)
  }
}
