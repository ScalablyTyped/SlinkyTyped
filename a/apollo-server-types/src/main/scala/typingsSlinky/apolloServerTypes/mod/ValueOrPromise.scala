package typingsSlinky.apolloServerTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Promise[T]
*/
trait ValueOrPromise[T] extends js.Object

object ValueOrPromise {
  @scala.inline
  implicit def apply[T](value: js.Promise[T]): ValueOrPromise[T] = value.asInstanceOf[ValueOrPromise[T]]
  @scala.inline
  implicit def apply[T](value: T): ValueOrPromise[T] = value.asInstanceOf[ValueOrPromise[T]]
}

