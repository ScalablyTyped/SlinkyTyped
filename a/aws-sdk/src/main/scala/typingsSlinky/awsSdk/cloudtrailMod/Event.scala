package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  /**
    * The AWS access key ID that was used to sign the request. If the request was made with temporary security credentials, this is the access key ID of the temporary credentials.
    */
  var AccessKeyId: js.UndefOr[String] = js.native
  
  /**
    * A JSON string that contains a representation of the event returned.
    */
  var CloudTrailEvent: js.UndefOr[String] = js.native
  
  /**
    * The CloudTrail ID of the event returned.
    */
  var EventId: js.UndefOr[String] = js.native
  
  /**
    * The name of the event returned.
    */
  var EventName: js.UndefOr[String] = js.native
  
  /**
    * The AWS service that the request was made to.
    */
  var EventSource: js.UndefOr[String] = js.native
  
  /**
    * The date and time of the event returned.
    */
  var EventTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Information about whether the event is a write event or a read event. 
    */
  var ReadOnly: js.UndefOr[String] = js.native
  
  /**
    * A list of resources referenced by the event returned.
    */
  var Resources: js.UndefOr[ResourceList] = js.native
  
  /**
    * A user name or role name of the requester that called the API in the event returned.
    */
  var Username: js.UndefOr[String] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    @scala.inline
    def setCloudTrailEvent(value: String): Self = StObject.set(x, "CloudTrailEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudTrailEventUndefined: Self = StObject.set(x, "CloudTrailEvent", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "EventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "EventName", js.undefined)
    
    @scala.inline
    def setEventSource(value: String): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceUndefined: Self = StObject.set(x, "EventSource", js.undefined)
    
    @scala.inline
    def setEventTime(value: js.Date): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    @scala.inline
    def setReadOnly(value: String): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    @scala.inline
    def setResources(value: ResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
