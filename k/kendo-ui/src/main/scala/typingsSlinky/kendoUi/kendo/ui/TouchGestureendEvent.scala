package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQueryEventObject
import typingsSlinky.kendoUi.kendo.mobile.ui.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchGestureendEvent extends TouchEvent {
  
  var center: js.UndefOr[Point] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var event: js.UndefOr[JQueryEventObject] = js.native
  
  var touches: js.UndefOr[js.Any] = js.native
}
object TouchGestureendEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Touch): TouchGestureendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchGestureendEvent]
  }
  
  @scala.inline
  implicit class TouchGestureendEventMutableBuilder[Self <: TouchGestureendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setEvent(value: JQueryEventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setTouches(value: js.Any): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
  }
}
