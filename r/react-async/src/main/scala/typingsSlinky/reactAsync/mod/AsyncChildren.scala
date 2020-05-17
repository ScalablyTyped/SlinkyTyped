package typingsSlinky.reactAsync.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * state * / typingsSlinky.reactAsync.mod.AsyncState[T], 
typingsSlinky.react.mod.ReactNode]
  - typingsSlinky.react.mod.ReactNode
*/
trait AsyncChildren[T] extends js.Object

object AsyncChildren {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* state */ AsyncState[T], TagMod[Any]]): AsyncChildren[T] = value.asInstanceOf[AsyncChildren[T]]
  @scala.inline
  implicit def apply[T](value: TagMod[Any]): AsyncChildren[T] = value.asInstanceOf[AsyncChildren[T]]
}

