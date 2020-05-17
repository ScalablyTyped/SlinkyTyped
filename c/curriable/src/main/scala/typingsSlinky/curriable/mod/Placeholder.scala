package typingsSlinky.curriable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Symbol
  - scala.Double
*/
trait Placeholder extends js.Object

object Placeholder {
  @scala.inline
  implicit def apply(value: Double): Placeholder = value.asInstanceOf[Placeholder]
  @scala.inline
  implicit def apply(value: js.Symbol): Placeholder = value.asInstanceOf[Placeholder]
}

