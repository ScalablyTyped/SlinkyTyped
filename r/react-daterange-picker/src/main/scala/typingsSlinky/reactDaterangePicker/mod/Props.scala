package typingsSlinky.reactDaterangePicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactDaterangePicker.mod.RangeProps[T]
  - typingsSlinky.reactDaterangePicker.mod.SingleProps[T]
*/
trait Props[T] extends js.Object

object Props {
  @scala.inline
  implicit def apply[T](value: RangeProps[T]): Props[T] = value.asInstanceOf[Props[T]]
  @scala.inline
  implicit def apply[T](value: SingleProps[T]): Props[T] = value.asInstanceOf[Props[T]]
}

