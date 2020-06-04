package typingsSlinky.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator extends Validator

object AsyncValidator {
  @scala.inline
  def apply(validate: AbstractControl => ValidationErrors | Null): AsyncValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncValidator]
  }
}

