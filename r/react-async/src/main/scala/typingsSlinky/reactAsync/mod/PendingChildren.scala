package typingsSlinky.reactAsync.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * state * / typingsSlinky.reactAsync.mod.AsyncPending[T], 
typingsSlinky.react.mod.ReactNode]
  - typingsSlinky.react.mod.ReactNode
*/
trait PendingChildren[T] extends js.Object

object PendingChildren {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* state */ AsyncPending[T], TagMod[Any]]): PendingChildren[T] = value.asInstanceOf[PendingChildren[T]]
  @scala.inline
  implicit def apply[T](value: TagMod[Any]): PendingChildren[T] = value.asInstanceOf[PendingChildren[T]]
}

