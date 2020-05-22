package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new ElementDragHelper.
  * @param element - The Element that should become draggable.
  * @param [axis] - Optional axis to constrain to, either 'x', 'y' or null.
  */
@JSGlobal("pc.ElementDragHelper")
@js.native
class ElementDragHelper protected ()
  extends typingsSlinky.playcanvas.pc.EventHandler {
  def this(element: typingsSlinky.playcanvas.pc.ElementComponent) = this()
  def this(element: typingsSlinky.playcanvas.pc.ElementComponent, axis: String) = this()
}

