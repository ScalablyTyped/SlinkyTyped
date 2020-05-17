package typingsSlinky.rsvp.mod.RSVP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rsvp.mod.RSVP.Resolved[T]
  - typingsSlinky.rsvp.mod.RSVP.Rejected[js.Any]
  - typingsSlinky.rsvp.mod.RSVP.Pending
*/
trait PromiseState[T] extends js.Object

object PromiseState {
  @scala.inline
  implicit def apply[T](value: Pending): PromiseState[T] = value.asInstanceOf[PromiseState[T]]
  @scala.inline
  implicit def apply[T](value: Rejected[js.Any]): PromiseState[T] = value.asInstanceOf[PromiseState[T]]
  @scala.inline
  implicit def apply[T](value: Resolved[T]): PromiseState[T] = value.asInstanceOf[PromiseState[T]]
}

