package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersSettingsSendasSmimeinfoDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The immutable ID for the SmimeInfo.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The email address that appears in the "From:" header for mail sent using
    * this alias.
    */
  var sendAsEmail: js.UndefOr[String] = js.native
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersSettingsSendasSmimeinfoDelete {
  
  @scala.inline
  def apply(): ParamsResourceUsersSettingsSendasSmimeinfoDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsSendasSmimeinfoDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersSettingsSendasSmimeinfoDeleteMutableBuilder[Self <: ParamsResourceUsersSettingsSendasSmimeinfoDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
