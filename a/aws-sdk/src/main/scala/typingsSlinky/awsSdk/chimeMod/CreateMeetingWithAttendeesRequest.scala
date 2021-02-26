package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMeetingWithAttendeesRequest extends StObject {
  
  /**
    * The request containing the attendees to create.
    */
  var Attendees: js.UndefOr[CreateMeetingWithAttendeesRequestItemList] = js.native
  
  /**
    * The unique identifier for the client request. Use a different token for different meetings.
    */
  var ClientRequestToken: typingsSlinky.awsSdk.chimeMod.ClientRequestToken = js.native
  
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.native
  
  /**
    * The Region in which to create the meeting. Default: us-east-1. Available values: af-south-1, ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-south-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserIdType] = js.native
  
  var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.native
  
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[MeetingTagList] = js.native
}
object CreateMeetingWithAttendeesRequest {
  
  @scala.inline
  def apply(ClientRequestToken: ClientRequestToken): CreateMeetingWithAttendeesRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingWithAttendeesRequest]
  }
  
  @scala.inline
  implicit class CreateMeetingWithAttendeesRequestMutableBuilder[Self <: CreateMeetingWithAttendeesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendees(value: CreateMeetingWithAttendeesRequestItemList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesUndefined: Self = StObject.set(x, "Attendees", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: CreateAttendeeRequestItem*): Self = StObject.set(x, "Attendees", js.Array(value :_*))
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalMeetingId(value: ExternalMeetingIdType): Self = StObject.set(x, "ExternalMeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalMeetingIdUndefined: Self = StObject.set(x, "ExternalMeetingId", js.undefined)
    
    @scala.inline
    def setMediaRegion(value: String): Self = StObject.set(x, "MediaRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaRegionUndefined: Self = StObject.set(x, "MediaRegion", js.undefined)
    
    @scala.inline
    def setMeetingHostId(value: ExternalUserIdType): Self = StObject.set(x, "MeetingHostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingHostIdUndefined: Self = StObject.set(x, "MeetingHostId", js.undefined)
    
    @scala.inline
    def setNotificationsConfiguration(value: MeetingNotificationConfiguration): Self = StObject.set(x, "NotificationsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsConfigurationUndefined: Self = StObject.set(x, "NotificationsConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: MeetingTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
