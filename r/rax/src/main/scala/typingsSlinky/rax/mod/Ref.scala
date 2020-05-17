package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * instance * / T | scala.Null, scala.Unit]
  - typingsSlinky.rax.mod.RefObject[T]
  - scala.Null
*/
trait Ref[T] extends LegacyRef[T]

object Ref {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* instance */ T | Null, Unit]): Ref[T] = value.asInstanceOf[Ref[T]]
  @scala.inline
  implicit def apply[T](value: Null): Ref[T] = value.asInstanceOf[Ref[T]]
  @scala.inline
  implicit def apply[T](value: RefObject[T]): Ref[T] = value.asInstanceOf[Ref[T]]
}

