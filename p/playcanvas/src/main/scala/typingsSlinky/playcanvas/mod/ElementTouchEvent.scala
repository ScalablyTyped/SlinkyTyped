package typingsSlinky.playcanvas.mod

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
@JSImport("playcanvas", "ElementTouchEvent")
@js.native
class ElementTouchEvent protected ()
  extends typingsSlinky.playcanvas.pc.ElementTouchEvent {
  def this(
    event: typingsSlinky.playcanvas.pc.TouchEvent,
    element: typingsSlinky.playcanvas.pc.ElementComponent,
    camera: typingsSlinky.playcanvas.pc.CameraComponent,
    x: Double,
    y: Double,
    touch: typingsSlinky.playcanvas.pc.Touch
  ) = this()
}
