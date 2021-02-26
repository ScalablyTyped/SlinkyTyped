package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnItemDragObjectResize extends OnItemDragObjectBase {
  
  var edge: js.UndefOr[left | right] = js.native
  
  @JSName("eventType")
  var eventType_OnItemDragObjectResize: resize = js.native
}
object OnItemDragObjectResize {
  
  @scala.inline
  def apply(eventType: resize, itemId: Id, time: Double): OnItemDragObjectResize = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectResize]
  }
  
  @scala.inline
  implicit class OnItemDragObjectResizeMutableBuilder[Self <: OnItemDragObjectResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdge(value: left | right): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    @scala.inline
    def setEventType(value: resize): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
  }
}
