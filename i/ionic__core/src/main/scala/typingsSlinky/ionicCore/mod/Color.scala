package typingsSlinky.ionicCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCore.mod.PredefinedColors
  - java.lang.String
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: PredefinedColors): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
}

