package typingsSlinky.nodeWaves.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
  - js.Array[typingsSlinky.std.HTMLElement]
*/
trait ElementSelector extends js.Object

object ElementSelector {
  @scala.inline
  implicit def apply(value: js.Array[HTMLElement]): ElementSelector = value.asInstanceOf[ElementSelector]
  @scala.inline
  implicit def apply(value: HTMLElement): ElementSelector = value.asInstanceOf[ElementSelector]
  @scala.inline
  implicit def apply(value: String): ElementSelector = value.asInstanceOf[ElementSelector]
}

