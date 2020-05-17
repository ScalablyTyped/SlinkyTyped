package typingsSlinky.colorCheck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.colorCheck.mod.RGB
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: RGB): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
}

