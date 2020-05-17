package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.openseadragon.anon.Bounds
import typingsSlinky.openseadragon.anon.DebugGridColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "Drawer")
@js.native
class Drawer protected () extends js.Object {
  // element : Element; // Deprecated
  def this(options: DebugGridColor) = this()
  var canvas: HTMLCanvasElement | HTMLElement = js.native
  var container: Element = js.native
  var context: CanvasRenderingContext2D | Null = js.native
  def blendSketch(options: Bounds): Unit = js.native
  def canRotate(): Boolean = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def drawTile(
    tile: Tile,
     // TODO: determine handler parameter types
  drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ js.Any, /* rendered */ js.Any, Unit],
    useSketch: Boolean
  ): Unit = js.native
  def drawTile(
    tile: Tile,
     // TODO: determine handler parameter types
  drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ js.Any, /* rendered */ js.Any, Unit],
    useSketch: Boolean,
    scale: Double
  ): Unit = js.native
  def drawTile(
    tile: Tile,
     // TODO: determine handler parameter types
  drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ js.Any, /* rendered */ js.Any, Unit],
    useSketch: Boolean,
    scale: Double,
    translate: Point
  ): Unit = js.native
  def getCanvasSize(sketch: Boolean): Point = js.native
  def getOpacity(): Double = js.native
  def setOpacity(opacity: Double): Drawer = js.native
  def viewportToDrawerRectangle(rectangle: Rect): Rect = js.native
}

