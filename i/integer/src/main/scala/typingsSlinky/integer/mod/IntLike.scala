package typingsSlinky.integer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.integer.mod.IntClass
*/
trait IntLike extends js.Object

object IntLike {
  @scala.inline
  implicit def apply(value: Double): IntLike = value.asInstanceOf[IntLike]
  @scala.inline
  implicit def apply(value: IntClass): IntLike = value.asInstanceOf[IntLike]
  @scala.inline
  implicit def apply(value: String): IntLike = value.asInstanceOf[IntLike]
}

