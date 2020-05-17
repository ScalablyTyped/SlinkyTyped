package typingsSlinky.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.saxes.mod.SaxesAttribute
  - typingsSlinky.saxes.mod.SaxesAttributePlain
  - typingsSlinky.saxes.mod.SaxesAttributeNSIncomplete
*/
trait AttributeEventForOptions[O /* <: SaxesOptions */] extends js.Object

object AttributeEventForOptions {
  @scala.inline
  implicit def apply[O](value: SaxesAttribute): AttributeEventForOptions[O] = value.asInstanceOf[AttributeEventForOptions[O]]
  @scala.inline
  implicit def apply[O](value: SaxesAttributeNSIncomplete): AttributeEventForOptions[O] = value.asInstanceOf[AttributeEventForOptions[O]]
  @scala.inline
  implicit def apply[O](value: SaxesAttributePlain): AttributeEventForOptions[O] = value.asInstanceOf[AttributeEventForOptions[O]]
}

