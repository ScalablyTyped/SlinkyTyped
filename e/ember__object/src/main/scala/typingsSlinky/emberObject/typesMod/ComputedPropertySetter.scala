package typingsSlinky.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberObject.typesMod.ComputedPropertySetterFunction[T]
  - typingsSlinky.emberObject.typesMod.ComputedPropertySetterObj[T]
*/
trait ComputedPropertySetter[T] extends js.Object

object ComputedPropertySetter {
  @scala.inline
  implicit def apply[T](value: ComputedPropertySetterFunction[T]): ComputedPropertySetter[T] = value.asInstanceOf[ComputedPropertySetter[T]]
  @scala.inline
  implicit def apply[T](value: ComputedPropertySetterObj[T]): ComputedPropertySetter[T] = value.asInstanceOf[ComputedPropertySetter[T]]
}

