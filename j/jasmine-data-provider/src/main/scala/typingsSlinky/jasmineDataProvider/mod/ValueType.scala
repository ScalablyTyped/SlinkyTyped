package typingsSlinky.jasmineDataProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Function0[T]
*/
trait ValueType[T] extends js.Object

object ValueType {
  @scala.inline
  implicit def apply[T](value: js.Function0[T]): ValueType[T] = value.asInstanceOf[ValueType[T]]
  @scala.inline
  implicit def apply[T](value: T): ValueType[T] = value.asInstanceOf[ValueType[T]]
}

