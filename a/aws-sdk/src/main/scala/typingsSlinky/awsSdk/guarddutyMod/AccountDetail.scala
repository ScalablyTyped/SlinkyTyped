package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountDetail extends StObject {
  
  /**
    * The member account ID.
    */
  var AccountId: typingsSlinky.awsSdk.guarddutyMod.AccountId = js.native
  
  /**
    * The email address of the member account.
    */
  var Email: typingsSlinky.awsSdk.guarddutyMod.Email = js.native
}
object AccountDetail {
  
  @scala.inline
  def apply(AccountId: AccountId, Email: Email): AccountDetail = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetail]
  }
  
  @scala.inline
  implicit class AccountDetailMutableBuilder[Self <: AccountDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
  }
}
