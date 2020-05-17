package typingsSlinky.reactAsync.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * data * / T, 
/ * state * / typingsSlinky.reactAsync.mod.AsyncFulfilled[T], 
typingsSlinky.react.mod.ReactNode]
  - typingsSlinky.react.mod.ReactNode
*/
trait FulfilledChildren[T] extends js.Object

object FulfilledChildren {
  @scala.inline
  implicit def apply[T](value: js.Function2[/* data */ T, /* state */ AsyncFulfilled[T], TagMod[Any]]): FulfilledChildren[T] = value.asInstanceOf[FulfilledChildren[T]]
  @scala.inline
  implicit def apply[T](value: TagMod[Any]): FulfilledChildren[T] = value.asInstanceOf[FulfilledChildren[T]]
}

