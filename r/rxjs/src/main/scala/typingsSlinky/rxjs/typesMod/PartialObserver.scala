package typingsSlinky.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rxjs.typesMod.NextObserver[T]
  - typingsSlinky.rxjs.typesMod.ErrorObserver[T]
  - typingsSlinky.rxjs.typesMod.CompletionObserver[T]
*/
trait PartialObserver[T] extends js.Object

object PartialObserver {
  @scala.inline
  implicit def apply[T](value: CompletionObserver[T]): PartialObserver[T] = value.asInstanceOf[PartialObserver[T]]
  @scala.inline
  implicit def apply[T](value: ErrorObserver[T]): PartialObserver[T] = value.asInstanceOf[PartialObserver[T]]
  @scala.inline
  implicit def apply[T](value: NextObserver[T]): PartialObserver[T] = value.asInstanceOf[PartialObserver[T]]
}

