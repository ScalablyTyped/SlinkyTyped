package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountCountError extends StObject {
  
  /** Account owner. */
  var account: js.UndefOr[UserInfo] = js.native
  
  /** Account query error. */
  var errorType: js.UndefOr[String] = js.native
}
object AccountCountError {
  
  @scala.inline
  def apply(): AccountCountError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCountError]
  }
  
  @scala.inline
  implicit class AccountCountErrorMutableBuilder[Self <: AccountCountError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: UserInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
  }
}
