package typingsSlinky.q.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Thenable[T]
  - T
*/
trait IWhenable[T] extends js.Object

object IWhenable {
  @scala.inline
  implicit def apply[T](value: T): IWhenable[T] = value.asInstanceOf[IWhenable[T]]
  @scala.inline
  implicit def apply[T](value: js.Thenable[T]): IWhenable[T] = value.asInstanceOf[IWhenable[T]]
}

