package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBeautifulDnd.mod.VerticalAxis
  - typingsSlinky.reactBeautifulDnd.mod.HorizontalAxis
*/
trait Axis extends js.Object

object Axis {
  @scala.inline
  implicit def apply(value: HorizontalAxis): Axis = value.asInstanceOf[Axis]
  @scala.inline
  implicit def apply(value: VerticalAxis): Axis = value.asInstanceOf[Axis]
}

