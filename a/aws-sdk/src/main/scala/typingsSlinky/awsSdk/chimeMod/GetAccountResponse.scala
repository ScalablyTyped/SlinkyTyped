package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountResponse extends StObject {
  
  var Account: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Account] = js.native
}
object GetAccountResponse {
  
  @scala.inline
  def apply(): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountResponse]
  }
  
  @scala.inline
  implicit class GetAccountResponseMutableBuilder[Self <: GetAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
