package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Any
*/
trait AnyToUnknown[T] extends js.Object

object AnyToUnknown {
  @scala.inline
  implicit def apply[T](value: js.Any): AnyToUnknown[T] = value.asInstanceOf[AnyToUnknown[T]]
  @scala.inline
  implicit def apply[T](value: T): AnyToUnknown[T] = value.asInstanceOf[AnyToUnknown[T]]
}

