package typingsSlinky.rsvp.mod.RSVP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// All the Promise methods essentially flatten existing promises, so that
// you don't end up with `Promise<Promise<Promise<string>>>` if you happen
// to return another `Promise` from a `.then()` invocation, etc. So all of
// them can take a type or a promise-like/then-able type.
/* Rewritten from type alias, can be one of: 
  - T
  - js.Thenable[T]
*/
trait Arg[T] extends js.Object

object Arg {
  @scala.inline
  implicit def apply[T](value: T): Arg[T] = value.asInstanceOf[Arg[T]]
  @scala.inline
  implicit def apply[T](value: js.Thenable[T]): Arg[T] = value.asInstanceOf[Arg[T]]
}

