package typingsSlinky.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rxjs.typesMod.Subscribable[scala.Nothing | T]
  - js.Thenable[T]
  - typingsSlinky.rxjs.typesMod.InteropObservable[T]
*/
trait SubscribableOrPromise[T] extends ObservableInput[T]

object SubscribableOrPromise {
  @scala.inline
  implicit def apply[T](value: InteropObservable[T]): SubscribableOrPromise[T] = value.asInstanceOf[SubscribableOrPromise[T]]
  @scala.inline
  implicit def apply[T](value: Subscribable[scala.Nothing | T]): SubscribableOrPromise[T] = value.asInstanceOf[SubscribableOrPromise[T]]
  @scala.inline
  implicit def apply[T](value: js.Thenable[T]): SubscribableOrPromise[T] = value.asInstanceOf[SubscribableOrPromise[T]]
}

