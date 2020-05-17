package typingsSlinky.nodeVagrant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Error
  - java.lang.String
  - scala.Null
*/
trait ErrorArg extends js.Object

object ErrorArg {
  @scala.inline
  implicit def apply(value: js.Error): ErrorArg = value.asInstanceOf[ErrorArg]
  @scala.inline
  implicit def apply(value: Null): ErrorArg = value.asInstanceOf[ErrorArg]
  @scala.inline
  implicit def apply(value: String): ErrorArg = value.asInstanceOf[ErrorArg]
}

