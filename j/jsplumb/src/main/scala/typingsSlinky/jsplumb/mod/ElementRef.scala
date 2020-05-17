package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.ElementId
  - typingsSlinky.std.Element
*/
trait ElementRef extends js.Object

object ElementRef {
  @scala.inline
  implicit def apply(value: Element): ElementRef = value.asInstanceOf[ElementRef]
  @scala.inline
  implicit def apply(value: ElementId): ElementRef = value.asInstanceOf[ElementRef]
}

