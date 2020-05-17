package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.mongodb.mod.OptionalId[T]
*/
trait UpdateOptionalId[T] extends js.Object

object UpdateOptionalId {
  @scala.inline
  implicit def apply[T](value: OptionalId[T]): UpdateOptionalId[T] = value.asInstanceOf[UpdateOptionalId[T]]
  @scala.inline
  implicit def apply[T](value: T): UpdateOptionalId[T] = value.asInstanceOf[UpdateOptionalId[T]]
}

