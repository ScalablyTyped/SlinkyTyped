package typingsSlinky.emotionSerialize.helperMod

import typingsSlinky.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - F
  - T
*/
trait Equal[A, B, T, F] extends Interpolation[A]

object Equal {
  @scala.inline
  implicit def apply[A, B, T, F](value: F | T): Equal[A, B, T, F] = value.asInstanceOf[Equal[A, B, T, F]]
}

