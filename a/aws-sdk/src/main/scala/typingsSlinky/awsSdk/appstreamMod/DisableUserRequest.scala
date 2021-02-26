package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableUserRequest extends StObject {
  
  /**
    * The authentication type for the user. You must specify USERPOOL.
    */
  var AuthenticationType: typingsSlinky.awsSdk.appstreamMod.AuthenticationType = js.native
  
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username = js.native
}
object DisableUserRequest {
  
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): DisableUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableUserRequest]
  }
  
  @scala.inline
  implicit class DisableUserRequestMutableBuilder[Self <: DisableUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: Username): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
