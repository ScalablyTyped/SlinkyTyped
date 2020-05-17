package typingsSlinky.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait ArrayOrSingle[T /* <: js.Any */] extends js.Object

object ArrayOrSingle {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): ArrayOrSingle[T] = value.asInstanceOf[ArrayOrSingle[T]]
  @scala.inline
  implicit def apply[T](value: T): ArrayOrSingle[T] = value.asInstanceOf[ArrayOrSingle[T]]
}

