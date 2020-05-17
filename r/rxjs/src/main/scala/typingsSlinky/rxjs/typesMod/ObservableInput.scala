package typingsSlinky.rxjs.typesMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rxjs.typesMod.SubscribableOrPromise[T]
  - typingsSlinky.std.ArrayLike[T]
  - typingsSlinky.std.Iterable[T]
*/
trait ObservableInput[T] extends js.Object

object ObservableInput {
  @scala.inline
  implicit def apply[T](value: ArrayLike[T]): ObservableInput[T] = value.asInstanceOf[ObservableInput[T]]
  @scala.inline
  implicit def apply[T](value: js.Iterable[T]): ObservableInput[T] = value.asInstanceOf[ObservableInput[T]]
  @scala.inline
  implicit def apply[T](value: SubscribableOrPromise[T]): ObservableInput[T] = value.asInstanceOf[ObservableInput[T]]
}

