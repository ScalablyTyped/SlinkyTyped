package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagAttendeeRequest extends StObject {
  
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: GuidString = js.native
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
  
  /**
    * The tag key-value pairs.
    */
  var Tags: AttendeeTagList = js.native
}
object TagAttendeeRequest {
  
  @scala.inline
  def apply(AttendeeId: GuidString, MeetingId: GuidString, Tags: AttendeeTagList): TagAttendeeRequest = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagAttendeeRequest]
  }
  
  @scala.inline
  implicit class TagAttendeeRequestMutableBuilder[Self <: TagAttendeeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: AttendeeTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
