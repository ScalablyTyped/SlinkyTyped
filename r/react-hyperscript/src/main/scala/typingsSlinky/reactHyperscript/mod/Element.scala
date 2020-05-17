package typingsSlinky.reactHyperscript.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactElement
  - java.lang.String
  - scala.Double
  - scala.Null
*/
trait Element extends js.Object

object Element {
  @scala.inline
  implicit def apply(value: Double): Element = value.asInstanceOf[Element]
  @scala.inline
  implicit def apply(value: Null): Element = value.asInstanceOf[Element]
  @scala.inline
  implicit def apply(value: ReactElement): Element = value.asInstanceOf[Element]
  @scala.inline
  implicit def apply(value: String): Element = value.asInstanceOf[Element]
}

