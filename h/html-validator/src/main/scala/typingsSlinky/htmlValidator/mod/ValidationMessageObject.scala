package typingsSlinky.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.htmlValidator.mod.ValidationMessageSimpleObject
  - typingsSlinky.htmlValidator.mod.ValidationMessageLocationObject
*/
trait ValidationMessageObject extends js.Object

object ValidationMessageObject {
  @scala.inline
  implicit def apply(value: ValidationMessageLocationObject | ValidationMessageSimpleObject): ValidationMessageObject = value.asInstanceOf[ValidationMessageObject]
}

