package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A string in place of a Brush object is treated as a Solid Brush of that color. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.go.mod.Brush
  - java.lang.String
*/
trait BrushLike extends js.Object

object BrushLike {
  @scala.inline
  implicit def apply(value: Brush): BrushLike = value.asInstanceOf[BrushLike]
  @scala.inline
  implicit def apply(value: String): BrushLike = value.asInstanceOf[BrushLike]
}

