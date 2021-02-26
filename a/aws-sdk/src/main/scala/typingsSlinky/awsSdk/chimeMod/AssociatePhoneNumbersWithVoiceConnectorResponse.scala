package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatePhoneNumbersWithVoiceConnectorResponse extends StObject {
  
  /**
    * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.native
}
object AssociatePhoneNumbersWithVoiceConnectorResponse {
  
  @scala.inline
  def apply(): AssociatePhoneNumbersWithVoiceConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorResponse]
  }
  
  @scala.inline
  implicit class AssociatePhoneNumbersWithVoiceConnectorResponseMutableBuilder[Self <: AssociatePhoneNumbersWithVoiceConnectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumberErrors(value: PhoneNumberErrorList): Self = StObject.set(x, "PhoneNumberErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberErrorsUndefined: Self = StObject.set(x, "PhoneNumberErrors", js.undefined)
    
    @scala.inline
    def setPhoneNumberErrorsVarargs(value: PhoneNumberError*): Self = StObject.set(x, "PhoneNumberErrors", js.Array(value :_*))
  }
}
