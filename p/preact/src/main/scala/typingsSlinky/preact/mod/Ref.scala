package typingsSlinky.preact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.preact.mod.RefObject[T]
  - typingsSlinky.preact.mod.RefCallback[T]
*/
trait Ref[T] extends js.Object

object Ref {
  @scala.inline
  implicit def apply[T](value: RefCallback[T]): Ref[T] = value.asInstanceOf[Ref[T]]
  @scala.inline
  implicit def apply[T](value: RefObject[T]): Ref[T] = value.asInstanceOf[Ref[T]]
}

