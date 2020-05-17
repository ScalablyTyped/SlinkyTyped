package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.ValidationErrorOccurred event.
  */
@js.native
trait ASPxClientUploadControlValidationErrorOccurredEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the error text.
    */
  var errorText: String = js.native
  /**
    * Returns an array of invalid files.
    */
  var invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo] = js.native
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the ASPxClientUploadControl.ValidationErrorOccurred event fires.
    */
  var showAlert: Boolean = js.native
  /**
    * Gets the validation settings for the selected files.
    */
  var validationSettings: ASPxClientUploadControlValidationSettings = js.native
}

object ASPxClientUploadControlValidationErrorOccurredEventArgs {
  @scala.inline
  def apply(
    errorText: String,
    invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo],
    showAlert: Boolean,
    validationSettings: ASPxClientUploadControlValidationSettings
  ): ASPxClientUploadControlValidationErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any], validationSettings = validationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlValidationErrorOccurredEventArgs]
  }
  @scala.inline
  implicit class ASPxClientUploadControlValidationErrorOccurredEventArgsOps[Self <: ASPxClientUploadControlValidationErrorOccurredEventArgs] (val x: Self) extends AnyVal {
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
    def withInvalidFiles(value: js.Array[ASPxClientUploadControlInvalidFileInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationSettings(value: ASPxClientUploadControlValidationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

