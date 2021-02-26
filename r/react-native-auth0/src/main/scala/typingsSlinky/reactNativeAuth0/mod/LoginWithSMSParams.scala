package typingsSlinky.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginWithSMSParams extends StObject {
  
  var audience: js.UndefOr[String] = js.native
  
  var code: String = js.native
  
  var phoneNumber: String = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object LoginWithSMSParams {
  
  @scala.inline
  def apply(code: String, phoneNumber: String): LoginWithSMSParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithSMSParams]
  }
  
  @scala.inline
  implicit class LoginWithSMSParamsMutableBuilder[Self <: LoginWithSMSParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
