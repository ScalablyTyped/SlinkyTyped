package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events that are related to data validation (see ASPxClientEdit.Validate).
  */
@js.native
trait ASPxClientEditValidationEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the error description.
    */
  var errorText: String = js.native
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    */
  var isValid: Boolean = js.native
  /**
    * Gets or sets the editor's value being validated.
    */
  var value: String = js.native
}

object ASPxClientEditValidationEventArgs {
  @scala.inline
  def apply(errorText: String, isValid: Boolean, value: String): ASPxClientEditValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientEditValidationEventArgs]
  }
  @scala.inline
  implicit class ASPxClientEditValidationEventArgsOps[Self <: ASPxClientEditValidationEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

