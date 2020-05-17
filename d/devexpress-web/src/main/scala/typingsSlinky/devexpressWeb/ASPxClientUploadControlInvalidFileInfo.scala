package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings of the file that hasn't passed validation.
  */
@js.native
trait ASPxClientUploadControlInvalidFileInfo extends js.Object {
  /**
    * Gets the error type.
    */
  var errorType: ASPxClientUploadControlValidationErrorTypeConsts = js.native
  /**
    * Gets the name of the invalid file.
    */
  var fileName: String = js.native
  /**
    * Gets the size of the invalid file.
    */
  var fileSize: Double = js.native
}

object ASPxClientUploadControlInvalidFileInfo {
  @scala.inline
  def apply(errorType: ASPxClientUploadControlValidationErrorTypeConsts, fileName: String, fileSize: Double): ASPxClientUploadControlInvalidFileInfo = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlInvalidFileInfo]
  }
  @scala.inline
  implicit class ASPxClientUploadControlInvalidFileInfoOps[Self <: ASPxClientUploadControlInvalidFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorType(value: ASPxClientUploadControlValidationErrorTypeConsts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

