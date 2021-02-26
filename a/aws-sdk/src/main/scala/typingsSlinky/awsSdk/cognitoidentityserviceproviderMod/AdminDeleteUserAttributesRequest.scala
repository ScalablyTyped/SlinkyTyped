package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminDeleteUserAttributesRequest extends StObject {
  
  /**
    * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributeNames: AttributeNameListType = js.native
  
  /**
    * The user pool ID for the user pool where you want to delete user attributes.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The user name of the user from which you would like to delete attributes.
    */
  var Username: UsernameType = js.native
}
object AdminDeleteUserAttributesRequest {
  
  @scala.inline
  def apply(UserAttributeNames: AttributeNameListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminDeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(UserAttributeNames = UserAttributeNames.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDeleteUserAttributesRequest]
  }
  
  @scala.inline
  implicit class AdminDeleteUserAttributesRequestMutableBuilder[Self <: AdminDeleteUserAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserAttributeNames(value: AttributeNameListType): Self = StObject.set(x, "UserAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributeNamesVarargs(value: AttributeNameType*): Self = StObject.set(x, "UserAttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
