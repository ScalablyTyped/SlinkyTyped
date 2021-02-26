package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMeetingDialOutRequest extends StObject {
  
  /**
    * Phone number used as the caller ID when the remote party receives a call.
    */
  var FromPhoneNumber: E164PhoneNumber = js.native
  
  /**
    * Token used by the Amazon Chime SDK attendee. Call the  CreateAttendee API to get a join token. 
    */
  var JoinToken: JoinTokenString = js.native
  
  /**
    * The Amazon Chime SDK meeting ID. Type: String Pattern: [a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12} Required: No
    */
  var MeetingId: GuidString = js.native
  
  /**
    * Phone number called when inviting someone to a meeting.
    */
  var ToPhoneNumber: E164PhoneNumber = js.native
}
object CreateMeetingDialOutRequest {
  
  @scala.inline
  def apply(
    FromPhoneNumber: E164PhoneNumber,
    JoinToken: JoinTokenString,
    MeetingId: GuidString,
    ToPhoneNumber: E164PhoneNumber
  ): CreateMeetingDialOutRequest = {
    val __obj = js.Dynamic.literal(FromPhoneNumber = FromPhoneNumber.asInstanceOf[js.Any], JoinToken = JoinToken.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any], ToPhoneNumber = ToPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingDialOutRequest]
  }
  
  @scala.inline
  implicit class CreateMeetingDialOutRequestMutableBuilder[Self <: CreateMeetingDialOutRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FromPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinToken(value: JoinTokenString): Self = StObject.set(x, "JoinToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "ToPhoneNumber", value.asInstanceOf[js.Any])
  }
}
