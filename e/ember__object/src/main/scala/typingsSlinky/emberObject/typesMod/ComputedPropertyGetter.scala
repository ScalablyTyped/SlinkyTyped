package typingsSlinky.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberObject.typesMod.ComputedPropertyGetterFunction[T]
  - typingsSlinky.emberObject.typesMod.ComputedPropertyGetterObj[T]
*/
trait ComputedPropertyGetter[T] extends js.Object

object ComputedPropertyGetter {
  @scala.inline
  implicit def apply[T](value: ComputedPropertyGetterFunction[T]): ComputedPropertyGetter[T] = value.asInstanceOf[ComputedPropertyGetter[T]]
  @scala.inline
  implicit def apply[T](value: ComputedPropertyGetterObj[T]): ComputedPropertyGetter[T] = value.asInstanceOf[ComputedPropertyGetter[T]]
}

