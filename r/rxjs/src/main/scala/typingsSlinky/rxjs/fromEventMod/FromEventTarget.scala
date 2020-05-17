package typingsSlinky.rxjs.fromEventMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rxjs.fromEventMod.EventTargetLike[T]
  - typingsSlinky.std.ArrayLike[typingsSlinky.rxjs.fromEventMod.EventTargetLike[T]]
*/
trait FromEventTarget[T] extends js.Object

object FromEventTarget {
  @scala.inline
  implicit def apply[T](value: ArrayLike[EventTargetLike[T]]): FromEventTarget[T] = value.asInstanceOf[FromEventTarget[T]]
  @scala.inline
  implicit def apply[T](value: EventTargetLike[T]): FromEventTarget[T] = value.asInstanceOf[FromEventTarget[T]]
}

