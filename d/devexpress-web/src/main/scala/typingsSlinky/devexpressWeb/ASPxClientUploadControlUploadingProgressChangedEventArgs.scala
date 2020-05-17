package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.UploadingProgressChanged event.
  */
@js.native
trait ASPxClientUploadControlUploadingProgressChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the content length of the currently uploaded file.
    */
  var currentFileContentLength: Double = js.native
  /**
    * Gets the name of the file being currently uploaded.
    */
  var currentFileName: String = js.native
  /**
    * Gets the position of the current file upload progress.
    */
  var currentFileProgress: Double = js.native
  /**
    * Gets the content length of the current file already uploaded to the server.
    */
  var currentFileUploadedContentLength: Double = js.native
  /**
    * Gets the number of the files selected for upload.
    */
  var fileCount: Double = js.native
  /**
    * Gets the current position of total upload progress.
    */
  var progress: Double = js.native
  /**
    * Gets the content length of the files selected for upload.
    */
  var totalContentLength: Double = js.native
  /**
    * Gets the content length of the files already uploaded to the server.
    */
  var uploadedContentLength: Double = js.native
}

object ASPxClientUploadControlUploadingProgressChangedEventArgs {
  @scala.inline
  def apply(
    currentFileContentLength: Double,
    currentFileName: String,
    currentFileProgress: Double,
    currentFileUploadedContentLength: Double,
    fileCount: Double,
    progress: Double,
    totalContentLength: Double,
    uploadedContentLength: Double
  ): ASPxClientUploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength.asInstanceOf[js.Any], currentFileName = currentFileName.asInstanceOf[js.Any], currentFileProgress = currentFileProgress.asInstanceOf[js.Any], currentFileUploadedContentLength = currentFileUploadedContentLength.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], totalContentLength = totalContentLength.asInstanceOf[js.Any], uploadedContentLength = uploadedContentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlUploadingProgressChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientUploadControlUploadingProgressChangedEventArgsOps[Self <: ASPxClientUploadControlUploadingProgressChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentFileContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFileProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFileUploadedContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileUploadedContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadedContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedContentLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

