package typingsSlinky.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.saxes.mod.SaxesAttributeNS
  - typingsSlinky.saxes.mod.SaxesAttributePlain
*/
trait SaxesAttribute
  extends AttributeEventForOptions[js.Any]

object SaxesAttribute {
  @scala.inline
  implicit def apply(value: SaxesAttributeNS): SaxesAttribute = value.asInstanceOf[SaxesAttribute]
  @scala.inline
  implicit def apply(value: SaxesAttributePlain): SaxesAttribute = value.asInstanceOf[SaxesAttribute]
}

