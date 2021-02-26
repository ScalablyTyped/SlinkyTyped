package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMembersGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Email or immutable ID of the group
    */
  var groupKey: js.UndefOr[String] = js.native
  
  /**
    * Email or immutable ID of the member
    */
  var memberKey: js.UndefOr[String] = js.native
}
object ParamsResourceMembersGet {
  
  @scala.inline
  def apply(): ParamsResourceMembersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersGet]
  }
  
  @scala.inline
  implicit class ParamsResourceMembersGetMutableBuilder[Self <: ParamsResourceMembersGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    @scala.inline
    def setMemberKey(value: String): Self = StObject.set(x, "memberKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberKeyUndefined: Self = StObject.set(x, "memberKey", js.undefined)
  }
}
