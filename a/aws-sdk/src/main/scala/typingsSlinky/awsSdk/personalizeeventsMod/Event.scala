package typingsSlinky.awsSdk.personalizeeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /**
    * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinquish unique events. Any subsequent events after the first with the same event ID are not used in model training.
    */
  var eventId: js.UndefOr[StringType] = js.native
  
  /**
    * The type of event. This property corresponds to the EVENT_TYPE field of the Interactions schema.
    */
  var eventType: StringType = js.native
  
  /**
    * A string map of event-specific data that you might choose to record. For example, if a user rates a movie on your site, you might send the movie ID and rating, and the number of movie ratings made by the user. Each item in the map consists of a key-value pair. For example,  {"itemId": "movie1"}   {"itemId": "movie2", "eventValue": "4.5"}   {"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}  The keys use camel case names that match the fields in the Interactions schema. The itemId and eventValue keys correspond to the ITEM_ID and EVENT_VALUE fields. In the above example, the eventType might be 'MovieRating' with eventValue being the rating. The numberOfRatings would match the 'NUMBER_OF_RATINGS' field defined in the Interactions schema.
    */
  var properties: EventPropertiesJSON = js.native
  
  /**
    * The timestamp on the client side when the event occurred.
    */
  var sentAt: js.Date = js.native
}
object Event {
  
  @scala.inline
  def apply(eventType: StringType, properties: EventPropertiesJSON, sentAt: js.Date): Event = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventType(value: StringType): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: EventPropertiesJSON): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentAt(value: js.Date): Self = this.set("sentAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventId(value: StringType): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
  }
}
