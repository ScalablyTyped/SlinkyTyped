package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadComplete client event, which enables you to perform specific actions after all selected files have been uploaded.
  */
@js.native
trait ASPxClientUploadControlFilesUploadCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String = js.native
  /**
    * Gets the error text to be displayed within the upload control's error frame.
    */
  var errorText: String = js.native
}

object ASPxClientUploadControlFilesUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String): ASPxClientUploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFilesUploadCompleteEventArgs]
  }
  @scala.inline
  implicit class ASPxClientUploadControlFilesUploadCompleteEventArgsOps[Self <: ASPxClientUploadControlFilesUploadCompleteEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}

