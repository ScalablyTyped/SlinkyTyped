package typingsSlinky.graphql.promiseOrValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Promise[T]
  - T
*/
trait PromiseOrValue[T] extends js.Object

object PromiseOrValue {
  @scala.inline
  implicit def apply[T](value: js.Promise[T]): PromiseOrValue[T] = value.asInstanceOf[PromiseOrValue[T]]
  @scala.inline
  implicit def apply[T](value: T): PromiseOrValue[T] = value.asInstanceOf[PromiseOrValue[T]]
}

