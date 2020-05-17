package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.calidation.mod.SimpleValidator
  - typingsSlinky.calidation.mod.BlacklistValidator
  - typingsSlinky.calidation.mod.ValueValidator[js.Any]
  - typingsSlinky.calidation.mod.RegexValidator
  - typingsSlinky.calidation.mod.WhitelistValidator
  - typingsSlinky.calidation.mod.LengthValidator
*/
trait Validator extends js.Object

object Validator {
  @scala.inline
  implicit def apply(value: BlacklistValidator): Validator = value.asInstanceOf[Validator]
  @scala.inline
  implicit def apply(value: LengthValidator): Validator = value.asInstanceOf[Validator]
  @scala.inline
  implicit def apply(value: RegexValidator): Validator = value.asInstanceOf[Validator]
  @scala.inline
  implicit def apply(value: SimpleValidator): Validator = value.asInstanceOf[Validator]
  @scala.inline
  implicit def apply(value: ValueValidator[js.Any]): Validator = value.asInstanceOf[Validator]
  @scala.inline
  implicit def apply(value: WhitelistValidator): Validator = value.asInstanceOf[Validator]
}

