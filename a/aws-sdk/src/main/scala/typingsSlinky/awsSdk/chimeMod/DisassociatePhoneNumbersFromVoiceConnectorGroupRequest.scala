package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociatePhoneNumbersFromVoiceConnectorGroupRequest extends StObject {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: E164PhoneNumberList = js.native
  
  /**
    * The Amazon Chime Voice Connector group ID.
    */
  var VoiceConnectorGroupId: NonEmptyString = js.native
}
object DisassociatePhoneNumbersFromVoiceConnectorGroupRequest {
  
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList, VoiceConnectorGroupId: NonEmptyString): DisassociatePhoneNumbersFromVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers.asInstanceOf[js.Any], VoiceConnectorGroupId = VoiceConnectorGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorGroupRequest]
  }
  
  @scala.inline
  implicit class DisassociatePhoneNumbersFromVoiceConnectorGroupRequestMutableBuilder[Self <: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = StObject.set(x, "E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "E164PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setVoiceConnectorGroupId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorGroupId", value.asInstanceOf[js.Any])
  }
}
