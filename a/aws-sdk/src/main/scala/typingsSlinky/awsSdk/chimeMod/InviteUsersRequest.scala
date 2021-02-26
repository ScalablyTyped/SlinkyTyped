package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteUsersRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The user email addresses to which to send the email invitation.
    */
  var UserEmailList: typingsSlinky.awsSdk.chimeMod.UserEmailList = js.native
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.UserType] = js.native
}
object InviteUsersRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, UserEmailList: UserEmailList): InviteUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserEmailList = UserEmailList.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteUsersRequest]
  }
  
  @scala.inline
  implicit class InviteUsersRequestMutableBuilder[Self <: InviteUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailList(value: UserEmailList): Self = StObject.set(x, "UserEmailList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailListVarargs(value: EmailAddress*): Self = StObject.set(x, "UserEmailList", js.Array(value :_*))
    
    @scala.inline
    def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
