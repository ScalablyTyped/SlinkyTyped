package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new TouchEvent from an existing browser event.
  * @property element - The target Element that the event was fired from.
  * @property touches - A list of all touches currently in contact with the device.
  * @property changedTouches - A list of touches that have changed since the last event.
  * @property event - The original browser TouchEvent.
  * @param device - The source device of the touch events.
  * @param event - The original browser TouchEvent.
  */
@JSGlobal("pc.TouchEvent")
@js.native
class TouchEvent protected ()
  extends typingsSlinky.playcanvas.pc.TouchEvent {
  def this(device: typingsSlinky.playcanvas.pc.TouchDevice, event: typingsSlinky.playcanvas.pc.TouchEvent) = this()
}
