package typingsSlinky.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTypeSummary extends StObject {
  
  /**
    * The system-generated ID of the event.
    */
  var EventTypeId: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeId] = js.native
  
  /**
    * The name of the event.
    */
  var EventTypeName: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeName] = js.native
  
  /**
    * The resource type of the event.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ResourceType] = js.native
  
  /**
    * The name of the service for which the event applies.
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ServiceName] = js.native
}
object EventTypeSummary {
  
  @scala.inline
  def apply(): EventTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeSummary]
  }
  
  @scala.inline
  implicit class EventTypeSummaryMutableBuilder[Self <: EventTypeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTypeId(value: EventTypeId): Self = StObject.set(x, "EventTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeIdUndefined: Self = StObject.set(x, "EventTypeId", js.undefined)
    
    @scala.inline
    def setEventTypeName(value: EventTypeName): Self = StObject.set(x, "EventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeNameUndefined: Self = StObject.set(x, "EventTypeName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
