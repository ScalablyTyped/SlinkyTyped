package typingsSlinky.ono.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Error
  - typingsSlinky.ono.typesMod.ErrorPOJO
*/
trait ErrorLike extends js.Object

object ErrorLike {
  @scala.inline
  implicit def apply(value: js.Error): ErrorLike = value.asInstanceOf[ErrorLike]
  @scala.inline
  implicit def apply(value: ErrorPOJO): ErrorLike = value.asInstanceOf[ErrorLike]
}

