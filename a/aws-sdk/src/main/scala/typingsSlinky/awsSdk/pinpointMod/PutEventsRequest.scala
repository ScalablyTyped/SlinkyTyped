package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var EventsRequest: typingsSlinky.awsSdk.pinpointMod.EventsRequest = js.native
}
object PutEventsRequest {
  
  @scala.inline
  def apply(ApplicationId: string, EventsRequest: EventsRequest): PutEventsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EventsRequest = EventsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsRequest]
  }
  
  @scala.inline
  implicit class PutEventsRequestMutableBuilder[Self <: PutEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsRequest(value: EventsRequest): Self = StObject.set(x, "EventsRequest", value.asInstanceOf[js.Any])
  }
}
