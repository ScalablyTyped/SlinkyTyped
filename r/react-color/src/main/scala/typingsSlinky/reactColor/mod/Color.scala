package typingsSlinky.reactColor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.reactColor.mod.HSLColor
  - typingsSlinky.reactColor.mod.RGBColor
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: HSLColor): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: RGBColor): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
}

