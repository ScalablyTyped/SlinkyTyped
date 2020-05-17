package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.ElementId
  - typingsSlinky.std.Element
  - js.Array[typingsSlinky.std.Element | typingsSlinky.jsplumb.mod.ElementId]
*/
trait ElementGroupRef extends js.Object

object ElementGroupRef {
  @scala.inline
  implicit def apply(value: js.Array[Element | ElementId]): ElementGroupRef = value.asInstanceOf[ElementGroupRef]
  @scala.inline
  implicit def apply(value: Element): ElementGroupRef = value.asInstanceOf[ElementGroupRef]
  @scala.inline
  implicit def apply(value: ElementId): ElementGroupRef = value.asInstanceOf[ElementGroupRef]
}

