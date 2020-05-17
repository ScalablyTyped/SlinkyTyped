package typingsSlinky.d3Selection.mod

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
trait ContainerElement extends js.Object

object ContainerElement {
  @scala.inline
  implicit def apply(value: HTMLElement): ContainerElement = value.asInstanceOf[ContainerElement]
  @scala.inline
  implicit def apply(value: SVGGElement): ContainerElement = value.asInstanceOf[ContainerElement]
  @scala.inline
  implicit def apply(value: SVGSVGElement): ContainerElement = value.asInstanceOf[ContainerElement]
}

