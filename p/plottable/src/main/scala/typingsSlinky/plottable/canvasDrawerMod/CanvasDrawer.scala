package typingsSlinky.plottable.canvasDrawerMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.plottable.drawerMod.IDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasDrawer", "CanvasDrawer")
@js.native
class CanvasDrawer protected () extends IDrawer {
  /**
    * @param _context The context for a canvas that this drawer will draw to.
    * @param _drawStep The draw step logic that actually draws.
    */
  def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
  var _context: js.Any = js.native
  var _drawStep: js.Any = js.native
  def getDrawStep(): CanvasDrawStep = js.native
}

