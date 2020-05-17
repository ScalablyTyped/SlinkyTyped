package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait MaybeArray[T] extends js.Object

object MaybeArray {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): MaybeArray[T] = value.asInstanceOf[MaybeArray[T]]
  @scala.inline
  implicit def apply[T](value: T): MaybeArray[T] = value.asInstanceOf[MaybeArray[T]]
}

