package typingsSlinky.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rxjs.fromEventMod.HasEventTargetAddRemove[T]
  - typingsSlinky.rxjs.fromEventMod.NodeStyleEventEmitter
  - typingsSlinky.rxjs.fromEventMod.NodeCompatibleEventEmitter
  - typingsSlinky.rxjs.fromEventMod.JQueryStyleEventEmitter
*/
trait EventTargetLike[T] extends FromEventTarget[T]

object EventTargetLike {
  @scala.inline
  implicit def apply[T](value: HasEventTargetAddRemove[T]): EventTargetLike[T] = value.asInstanceOf[EventTargetLike[T]]
  @scala.inline
  implicit def apply[T](value: JQueryStyleEventEmitter): EventTargetLike[T] = value.asInstanceOf[EventTargetLike[T]]
  @scala.inline
  implicit def apply[T](value: NodeCompatibleEventEmitter): EventTargetLike[T] = value.asInstanceOf[EventTargetLike[T]]
  @scala.inline
  implicit def apply[T](value: NodeStyleEventEmitter): EventTargetLike[T] = value.asInstanceOf[EventTargetLike[T]]
}

