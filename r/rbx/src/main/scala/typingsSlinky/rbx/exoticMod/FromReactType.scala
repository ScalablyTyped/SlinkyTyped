package typingsSlinky.rbx.exoticMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Any
*/
trait FromReactType[T /* <: ReactComponentClass[_] */] extends js.Object

object FromReactType {
  @scala.inline
  implicit def apply[T](value: js.Any): FromReactType[T] = value.asInstanceOf[FromReactType[T]]
  @scala.inline
  implicit def apply[T](value: T): FromReactType[T] = value.asInstanceOf[FromReactType[T]]
}

