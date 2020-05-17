package typingsSlinky.gun.mod.Gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gun does not accept Array value, so we need extract to make types correct */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gun.mod.Gun.ArrayOf[T]
  - T
*/
trait AllowArray[T] extends js.Object

object AllowArray {
  @scala.inline
  implicit def apply[T](value: ArrayOf[T]): AllowArray[T] = value.asInstanceOf[AllowArray[T]]
  @scala.inline
  implicit def apply[T](value: T): AllowArray[T] = value.asInstanceOf[AllowArray[T]]
}

