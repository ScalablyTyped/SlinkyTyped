package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.FileUploadComplete event.
  */
@js.native
trait ASPxClientUploadControlFileUploadCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String = js.native
  /**
    * Gets the error text to be displayed within the ASPxUploadControl's error frame.
    */
  var errorText: String = js.native
  /**
    * Gets the index of a <strong>file input element</strong> within the ASPxUploadControl.
    */
  var inputIndex: Double = js.native
  /**
    * Gets or sets a value indicating whether the uploaded file passes validation.
    */
  var isValid: Boolean = js.native
}

object ASPxClientUploadControlFileUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean): ASPxClientUploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFileUploadCompleteEventArgs]
  }
  @scala.inline
  implicit class ASPxClientUploadControlFileUploadCompleteEventArgsOps[Self <: ASPxClientUploadControlFileUploadCompleteEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

