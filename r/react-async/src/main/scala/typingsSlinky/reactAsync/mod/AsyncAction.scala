package typingsSlinky.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAsync.mod.Start
  - typingsSlinky.reactAsync.mod.Cancel
  - typingsSlinky.reactAsync.mod.Fulfill[T]
  - typingsSlinky.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends js.Object

object AsyncAction {
  @scala.inline
  implicit def apply[T](value: Cancel): AsyncAction[T] = value.asInstanceOf[AsyncAction[T]]
  @scala.inline
  implicit def apply[T](value: Fulfill[T]): AsyncAction[T] = value.asInstanceOf[AsyncAction[T]]
  @scala.inline
  implicit def apply[T](value: Reject): AsyncAction[T] = value.asInstanceOf[AsyncAction[T]]
  @scala.inline
  implicit def apply[T](value: Start): AsyncAction[T] = value.asInstanceOf[AsyncAction[T]]
}

