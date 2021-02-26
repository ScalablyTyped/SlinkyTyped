package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStartCondition extends StObject {
  
  var EventFilter: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.EventFilter] = js.native
  
  var SegmentId: js.UndefOr[string] = js.native
}
object EventStartCondition {
  
  @scala.inline
  def apply(): EventStartCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventStartCondition]
  }
  
  @scala.inline
  implicit class EventStartConditionMutableBuilder[Self <: EventStartCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventFilter(value: EventFilter): Self = StObject.set(x, "EventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFilterUndefined: Self = StObject.set(x, "EventFilter", js.undefined)
    
    @scala.inline
    def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
  }
}
