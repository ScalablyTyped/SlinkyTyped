package typingsSlinky.d3Drag.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.SVGSVGElement
  - typingsSlinky.std.SVGGElement
*/
trait DragContainerElement extends js.Object

object DragContainerElement {
  @scala.inline
  implicit def apply(value: HTMLElement): DragContainerElement = value.asInstanceOf[DragContainerElement]
  @scala.inline
  implicit def apply(value: SVGGElement): DragContainerElement = value.asInstanceOf[DragContainerElement]
  @scala.inline
  implicit def apply(value: SVGSVGElement): DragContainerElement = value.asInstanceOf[DragContainerElement]
}

