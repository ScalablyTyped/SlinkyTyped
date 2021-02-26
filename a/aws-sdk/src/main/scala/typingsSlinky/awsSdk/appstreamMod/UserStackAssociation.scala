package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStackAssociation extends StObject {
  
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typingsSlinky.awsSdk.appstreamMod.AuthenticationType = js.native
  
  /**
    * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
    */
  var SendEmailNotification: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: String = js.native
  
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username = js.native
}
object UserStackAssociation {
  
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, StackName: String, UserName: Username): UserStackAssociation = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStackAssociation]
  }
  
  @scala.inline
  implicit class UserStackAssociationMutableBuilder[Self <: UserStackAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendEmailNotification(value: Boolean): Self = StObject.set(x, "SendEmailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendEmailNotificationUndefined: Self = StObject.set(x, "SendEmailNotification", js.undefined)
    
    @scala.inline
    def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: Username): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
