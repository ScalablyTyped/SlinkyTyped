package typingsSlinky.graphqlCompose.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Promise[T]
  - T
*/
trait MaybePromise[T] extends js.Object

object MaybePromise {
  @scala.inline
  implicit def apply[T](value: js.Promise[T]): MaybePromise[T] = value.asInstanceOf[MaybePromise[T]]
  @scala.inline
  implicit def apply[T](value: T): MaybePromise[T] = value.asInstanceOf[MaybePromise[T]]
}

