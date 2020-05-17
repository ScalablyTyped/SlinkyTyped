package typingsSlinky.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aframe.mod.SinglePropertySchema[T]
  - typingsSlinky.aframe.mod.MultiPropertySchema[T]
*/
trait Schema_[T /* <: js.Object */] extends js.Object

object Schema_ {
  @scala.inline
  implicit def apply[T](value: MultiPropertySchema[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
  @scala.inline
  implicit def apply[T](value: SinglePropertySchema[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
}

