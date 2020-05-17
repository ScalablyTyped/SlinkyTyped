package typingsSlinky.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeSvg.mod.int32ARGBColor
  - typingsSlinky.reactNativeSvg.mod.rgbaArray
  - java.lang.String
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: int32ARGBColor): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: rgbaArray): Color = value.asInstanceOf[Color]
}

