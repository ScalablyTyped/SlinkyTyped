package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.AnonX
import typingsSlinky.pdfmake.pdfmakeStrings.ellipse
import typingsSlinky.pdfmake.pdfmakeStrings.line
import typingsSlinky.pdfmake.pdfmakeStrings.polyline
import typingsSlinky.pdfmake.pdfmakeStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pdfmake.interfacesMod.CanvasRect
  - typingsSlinky.pdfmake.interfacesMod.CanvasPolyline
  - typingsSlinky.pdfmake.interfacesMod.CanvasLine
  - typingsSlinky.pdfmake.interfacesMod.CanvasEllipse
*/
trait CanvasElement extends js.Object

object CanvasElement {
  @scala.inline
  def CanvasRect(h: Double, `type`: rect, w: Double, x: Double, y: Double): CanvasElement = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
  @scala.inline
  def CanvasPolyline(points: js.Array[AnonX], `type`: polyline): CanvasElement = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
  @scala.inline
  def CanvasLine(`type`: line, x1: Double, x2: Double, y1: Double, y2: Double): CanvasElement = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
  @scala.inline
  def CanvasEllipse(r1: Double, `type`: ellipse, x: Double, y: Double): CanvasElement = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasElement]
  }
}

