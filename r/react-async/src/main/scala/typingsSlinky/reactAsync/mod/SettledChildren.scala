package typingsSlinky.reactAsync.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * state * / typingsSlinky.reactAsync.mod.AsyncFulfilled[T] | typingsSlinky.reactAsync.mod.AsyncRejected[T], 
typingsSlinky.react.mod.ReactNode]
  - typingsSlinky.react.mod.ReactNode
*/
trait SettledChildren[T] extends js.Object

object SettledChildren {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* state */ AsyncFulfilled[T] | AsyncRejected[T], TagMod[Any]]): SettledChildren[T] = value.asInstanceOf[SettledChildren[T]]
  @scala.inline
  implicit def apply[T](value: TagMod[Any]): SettledChildren[T] = value.asInstanceOf[SettledChildren[T]]
}

