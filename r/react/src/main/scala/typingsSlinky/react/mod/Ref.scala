package typingsSlinky.react.mod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.RefCallback[T]
  - typingsSlinky.react.mod.RefObject[T]
  - scala.Null
*/
trait Ref[T] extends LegacyRef[T]

object Ref {
  @scala.inline
  implicit def apply[T](value: Null): Ref[T] = value.asInstanceOf[Ref[T]]
  @scala.inline
  implicit def apply[T](value: RefCallback[T]): Ref[T] = value.asInstanceOf[Ref[T]]
  @scala.inline
  implicit def apply[T](value: ReactRef[T]): Ref[T] = value.asInstanceOf[Ref[T]]
}

