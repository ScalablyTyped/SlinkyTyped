package typingsSlinky.pdfmake.interfacesMod

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
  implicit def apply(value: CanvasEllipse): CanvasElement = value.asInstanceOf[CanvasElement]
  @scala.inline
  implicit def apply(value: CanvasLine): CanvasElement = value.asInstanceOf[CanvasElement]
  @scala.inline
  implicit def apply(value: CanvasPolyline): CanvasElement = value.asInstanceOf[CanvasElement]
  @scala.inline
  implicit def apply(value: CanvasRect): CanvasElement = value.asInstanceOf[CanvasElement]
}

