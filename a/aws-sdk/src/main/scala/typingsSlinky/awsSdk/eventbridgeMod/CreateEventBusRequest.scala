package typingsSlinky.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEventBusRequest extends StObject {
  
  /**
    * If you are creating a partner event bus, this specifies the partner event source that the new event bus will be matched with.
    */
  var EventSourceName: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.EventSourceName] = js.native
  
  /**
    * The name of the new event bus.  Event bus names cannot contain the / character. You can't use the name default for a custom event bus, as this name is already used for your account's default event bus. If this is a partner event bus, the name must exactly match the name of the partner event source that this event bus is matched to.
    */
  var Name: EventBusName = js.native
  
  /**
    * Tags to associate with the event bus.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateEventBusRequest {
  
  @scala.inline
  def apply(Name: EventBusName): CreateEventBusRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventBusRequest]
  }
  
  @scala.inline
  implicit class CreateEventBusRequestMutableBuilder[Self <: CreateEventBusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSourceName(value: EventSourceName): Self = StObject.set(x, "EventSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceNameUndefined: Self = StObject.set(x, "EventSourceName", js.undefined)
    
    @scala.inline
    def setName(value: EventBusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
