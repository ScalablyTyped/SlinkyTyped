package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A number in place of a Margin object is treated as a uniform Margin with that thickness */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.go.mod.Margin
  - scala.Double
*/
trait MarginLike extends js.Object

object MarginLike {
  @scala.inline
  implicit def apply(value: Double): MarginLike = value.asInstanceOf[MarginLike]
  @scala.inline
  implicit def apply(value: Margin): MarginLike = value.asInstanceOf[MarginLike]
}

