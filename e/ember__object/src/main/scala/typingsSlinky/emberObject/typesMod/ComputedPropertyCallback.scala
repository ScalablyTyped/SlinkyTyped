package typingsSlinky.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberObject.typesMod.ComputedPropertyGetterFunction[T]
  - typingsSlinky.emberObject.typesMod.ComputedPropertyObj[T]
*/
trait ComputedPropertyCallback[T] extends js.Object

object ComputedPropertyCallback {
  @scala.inline
  implicit def apply[T](value: ComputedPropertyGetterFunction[T]): ComputedPropertyCallback[T] = value.asInstanceOf[ComputedPropertyCallback[T]]
  @scala.inline
  implicit def apply[T](value: ComputedPropertyObj[T]): ComputedPropertyCallback[T] = value.asInstanceOf[ComputedPropertyCallback[T]]
}

