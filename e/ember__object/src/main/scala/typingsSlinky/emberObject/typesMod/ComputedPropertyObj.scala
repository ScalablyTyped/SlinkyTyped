package typingsSlinky.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberObject.typesMod.ComputedPropertyGetterObj[T]
  - typingsSlinky.emberObject.typesMod.ComputedPropertySetterObj[T]
  - typingsSlinky.emberObject.typesMod.ComputedPropertyGetterObj[T] with typingsSlinky.emberObject.typesMod.ComputedPropertySetterObj[T]
*/
trait ComputedPropertyObj[T] extends ComputedPropertyCallback[T]

object ComputedPropertyObj {
  @scala.inline
  implicit def apply[T](
    value: (ComputedPropertyGetterObj[T] with ComputedPropertySetterObj[T]) | ComputedPropertyGetterObj[T]
  ): ComputedPropertyObj[T] = value.asInstanceOf[ComputedPropertyObj[T]]
  @scala.inline
  implicit def apply[T](value: ComputedPropertySetterObj[T]): ComputedPropertyObj[T] = value.asInstanceOf[ComputedPropertyObj[T]]
}

