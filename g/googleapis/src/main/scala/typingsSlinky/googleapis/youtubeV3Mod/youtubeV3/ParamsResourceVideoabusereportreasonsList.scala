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
trait ParamsResourceVideoabusereportreasonsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The hl parameter specifies the language that should be used for text
    * values in the API response.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies the videoCategory resource parts that the
    * API response will include. Supported values are id and snippet.
    */
  var part: js.UndefOr[String] = js.native
}
object ParamsResourceVideoabusereportreasonsList {
  
  @scala.inline
  def apply(): ParamsResourceVideoabusereportreasonsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideoabusereportreasonsList]
  }
  
  @scala.inline
  implicit class ParamsResourceVideoabusereportreasonsListMutableBuilder[Self <: ParamsResourceVideoabusereportreasonsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
  }
}
