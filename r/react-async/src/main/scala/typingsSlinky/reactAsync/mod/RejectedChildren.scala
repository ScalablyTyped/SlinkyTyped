package typingsSlinky.reactAsync.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * error * / typingsSlinky.std.Error, 
/ * state * / typingsSlinky.reactAsync.mod.AsyncRejected[T], 
typingsSlinky.react.mod.ReactNode]
  - typingsSlinky.react.mod.ReactNode
*/
trait RejectedChildren[T] extends js.Object

object RejectedChildren {
  @scala.inline
  implicit def apply[T](value: js.Function2[/* error */ js.Error, /* state */ AsyncRejected[T], TagMod[Any]]): RejectedChildren[T] = value.asInstanceOf[RejectedChildren[T]]
  @scala.inline
  implicit def apply[T](value: TagMod[Any]): RejectedChildren[T] = value.asInstanceOf[RejectedChildren[T]]
}

