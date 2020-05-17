package typingsSlinky.reactAsync.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * state * / typingsSlinky.reactAsync.mod.AsyncInitial[T], 
typingsSlinky.react.mod.ReactNode]
  - typingsSlinky.react.mod.ReactNode
*/
trait InitialChildren[T] extends js.Object

object InitialChildren {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* state */ AsyncInitial[T], TagMod[Any]]): InitialChildren[T] = value.asInstanceOf[InitialChildren[T]]
  @scala.inline
  implicit def apply[T](value: TagMod[Any]): InitialChildren[T] = value.asInstanceOf[InitialChildren[T]]
}

