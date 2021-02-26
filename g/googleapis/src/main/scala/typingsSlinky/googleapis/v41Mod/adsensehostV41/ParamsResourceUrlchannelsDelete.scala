package typingsSlinky.googleapis.v41Mod.adsensehostV41

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUrlchannelsDelete extends StandardParameters {
  
  /**
    * Ad client from which to delete the URL channel.
    */
  var adClientId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * URL channel to delete.
    */
  var urlChannelId: js.UndefOr[String] = js.native
}
object ParamsResourceUrlchannelsDelete {
  
  @scala.inline
  def apply(): ParamsResourceUrlchannelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlchannelsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceUrlchannelsDeleteMutableBuilder[Self <: ParamsResourceUrlchannelsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setUrlChannelId(value: String): Self = StObject.set(x, "urlChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlChannelIdUndefined: Self = StObject.set(x, "urlChannelId", js.undefined)
  }
}
