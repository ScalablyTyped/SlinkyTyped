package typingsSlinky.factoryGirl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.factoryGirl.mod.Generator[T]
*/
trait Definition[T] extends js.Object

object Definition {
  @scala.inline
  implicit def apply[T](value: Generator[T]): Definition[T] = value.asInstanceOf[Definition[T]]
  @scala.inline
  implicit def apply[T](value: T): Definition[T] = value.asInstanceOf[Definition[T]]
}

