package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminEnableUserRequest extends StObject {
  
  /**
    * The user pool ID for the user pool where you want to enable the user.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The user name of the user you wish to enable.
    */
  var Username: UsernameType = js.native
}
object AdminEnableUserRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminEnableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminEnableUserRequest]
  }
  
  @scala.inline
  implicit class AdminEnableUserRequestMutableBuilder[Self <: AdminEnableUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
