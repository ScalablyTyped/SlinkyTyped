package typingsSlinky.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAsync.mod.AsyncInitial[T]
  - typingsSlinky.reactAsync.mod.AsyncPending[T]
  - typingsSlinky.reactAsync.mod.AsyncFulfilled[T]
  - typingsSlinky.reactAsync.mod.AsyncRejected[T]
*/
trait AsyncState[T] extends js.Object

object AsyncState {
  @scala.inline
  implicit def apply[T](value: AsyncFulfilled[T]): AsyncState[T] = value.asInstanceOf[AsyncState[T]]
  @scala.inline
  implicit def apply[T](value: AsyncInitial[T]): AsyncState[T] = value.asInstanceOf[AsyncState[T]]
  @scala.inline
  implicit def apply[T](value: AsyncPending[T]): AsyncState[T] = value.asInstanceOf[AsyncState[T]]
  @scala.inline
  implicit def apply[T](value: AsyncRejected[T]): AsyncState[T] = value.asInstanceOf[AsyncState[T]]
}

