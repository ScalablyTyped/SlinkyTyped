package typingsSlinky.roxNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait BasicType[T] extends js.Object

object BasicType {
  @scala.inline
  implicit def apply[T](value: Boolean): BasicType[T] = value.asInstanceOf[BasicType[T]]
  @scala.inline
  implicit def apply[T](value: Double): BasicType[T] = value.asInstanceOf[BasicType[T]]
  @scala.inline
  implicit def apply[T](value: String): BasicType[T] = value.asInstanceOf[BasicType[T]]
}

