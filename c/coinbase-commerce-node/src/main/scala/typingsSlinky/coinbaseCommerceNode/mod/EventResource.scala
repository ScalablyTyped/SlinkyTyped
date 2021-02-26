package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonconfirmed
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColoncreated
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColondelayed
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonfailed
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonpending
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonresolved
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event Resource.
  *
  * @link
  */
@js.native
trait EventResource[T] extends StObject {
  
  /**
    * API version of the `data` payload.
    */
  var api_version: String = js.native
  
  /**
    * Event creation time.
    */
  var created_at: Timestamp = js.native
  
  /**
    * Event Payload.
    * Resource of the associated object at the time of the event.
    */
  var data: T = js.native
  
  /**
    * Event UUID.
    */
  var id: String = js.native
  
  /**
    * Resource name.
    */
  var resource: event = js.native
  
  /**
    * Event type.
    */
  var `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved = js.native
}
object EventResource {
  
  @scala.inline
  def apply[T](
    api_version: String,
    created_at: Timestamp,
    data: T,
    id: String,
    resource: event,
    `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
  ): EventResource[T] = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResource[T]]
  }
  
  @scala.inline
  implicit class EventResourceMutableBuilder[Self <: EventResource[_], T] (val x: Self with EventResource[T]) extends AnyVal {
    
    @scala.inline
    def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: event): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
