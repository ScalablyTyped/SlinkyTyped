package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSqlInjectionMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the DeleteSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeToken] = js.native
}
object DeleteSqlInjectionMatchSetResponse {
  
  @scala.inline
  def apply(): DeleteSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSqlInjectionMatchSetResponse]
  }
  
  @scala.inline
  implicit class DeleteSqlInjectionMatchSetResponseMutableBuilder[Self <: DeleteSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
