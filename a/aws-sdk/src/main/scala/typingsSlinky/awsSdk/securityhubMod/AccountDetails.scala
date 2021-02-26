package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountDetails extends StObject {
  
  /**
    * The ID of an AWS account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.AccountId] = js.native
  
  /**
    * The email of an AWS account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.native
}
object AccountDetails {
  
  @scala.inline
  def apply(): AccountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountDetails]
  }
  
  @scala.inline
  implicit class AccountDetailsMutableBuilder[Self <: AccountDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: NonEmptyString): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
  }
}
