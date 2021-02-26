package typingsSlinky.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ElementTouchEvent.
  * @property touches - The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
  * @property changedTouches - The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
  * @property touch - The touch object that triggered the event.
  * @param event - The TouchEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  * @param x - The x coordinate of the touch that triggered the event.
  * @param y - The y coordinate of the touch that triggered the event.
  * @param touch - The touch object that triggered the event.
  */
@js.native
trait ElementTouchEvent extends ElementInputEvent {
  
  /**
    * The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
    */
  var changedTouches: js.Array[Touch] = js.native
  
  /**
    * The touch object that triggered the event.
    */
  var touch: Touch = js.native
  
  /**
    * The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
    */
  var touches: js.Array[Touch] = js.native
}
object ElementTouchEvent {
  
  @scala.inline
  def apply(
    camera: CameraComponent,
    changedTouches: js.Array[Touch],
    element: ElementComponent,
    event: MouseEvent | TouchEvent,
    stopPropagation: () => Unit,
    touch: Touch,
    touches: js.Array[Touch]
  ): ElementTouchEvent = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), touch = touch.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementTouchEvent]
  }
  
  @scala.inline
  implicit class ElementTouchEventMutableBuilder[Self <: ElementTouchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedTouches(value: js.Array[Touch]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedTouchesVarargs(value: Touch*): Self = StObject.set(x, "changedTouches", js.Array(value :_*))
    
    @scala.inline
    def setTouch(value: Touch): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouches(value: js.Array[Touch]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesVarargs(value: Touch*): Self = StObject.set(x, "touches", js.Array(value :_*))
  }
}
