package typingsSlinky.colorHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.colorHash.mod.ColorValueArray
*/
trait Lightness extends js.Object

object Lightness {
  @scala.inline
  implicit def apply(value: ColorValueArray): Lightness = value.asInstanceOf[Lightness]
  @scala.inline
  implicit def apply(value: Double): Lightness = value.asInstanceOf[Lightness]
}

