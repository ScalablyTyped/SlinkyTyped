package typingsSlinky.baseui.blockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait Responsive[T] extends js.Object

object Responsive {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): Responsive[T] = value.asInstanceOf[Responsive[T]]
  @scala.inline
  implicit def apply[T](value: T): Responsive[T] = value.asInstanceOf[Responsive[T]]
}

