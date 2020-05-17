package typingsSlinky.mysticateaSpy.mod.Spy_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each call. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mysticateaSpy.mod.Spy_.ReturnedCall[T]
  - typingsSlinky.mysticateaSpy.mod.Spy_.ThrownCall[T]
*/
trait Call[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object

object Call {
  @scala.inline
  implicit def apply[T](value: ReturnedCall[T]): Call[T] = value.asInstanceOf[Call[T]]
  @scala.inline
  implicit def apply[T](value: ThrownCall[T]): Call[T] = value.asInstanceOf[Call[T]]
}

