package typingsSlinky.relayRuntime.relayObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayObservableMod.Subscribable[T]
  - js.Promise[T]
  - T
*/
trait ObservableFromValue[T] extends js.Object

object ObservableFromValue {
  @scala.inline
  implicit def apply[T](value: js.Promise[T]): ObservableFromValue[T] = value.asInstanceOf[ObservableFromValue[T]]
  @scala.inline
  implicit def apply[T](value: Subscribable[T]): ObservableFromValue[T] = value.asInstanceOf[ObservableFromValue[T]]
  @scala.inline
  implicit def apply[T](value: T): ObservableFromValue[T] = value.asInstanceOf[ObservableFromValue[T]]
}

