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
trait ParamsResourceLivechatmessagesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The hl parameter instructs the API to retrieve localized resource
    * metadata for a specific application language that the YouTube website
    * supports. The parameter value must be a language code included in the
    * list returned by the i18nLanguages.list method.  If localized resource
    * details are available in that language, the resource's snippet.localized
    * object will contain the localized values. However, if localized details
    * are not available, the snippet.localized object will contain resource
    * details in the resource's default language.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * The liveChatId parameter specifies the ID of the chat whose messages will
    * be returned.
    */
  var liveChatId: js.UndefOr[String] = js.native
  
  /**
    * The maxResults parameter specifies the maximum number of messages that
    * should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken property
    * identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies the liveChatComment resource parts that the
    * API response will include. Supported values are id and snippet.
    */
  var part: js.UndefOr[String] = js.native
  
  /**
    * The profileImageSize parameter specifies the size of the user profile
    * pictures that should be returned in the result set. Default: 88.
    */
  var profileImageSize: js.UndefOr[Double] = js.native
}
object ParamsResourceLivechatmessagesList {
  
  @scala.inline
  def apply(): ParamsResourceLivechatmessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLivechatmessagesList]
  }
  
  @scala.inline
  implicit class ParamsResourceLivechatmessagesListMutableBuilder[Self <: ParamsResourceLivechatmessagesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setProfileImageSize(value: Double): Self = StObject.set(x, "profileImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileImageSizeUndefined: Self = StObject.set(x, "profileImageSize", js.undefined)
  }
}
