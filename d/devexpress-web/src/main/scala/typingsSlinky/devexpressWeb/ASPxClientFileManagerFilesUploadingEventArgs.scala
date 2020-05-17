package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FilesUploading event.
  */
@js.native
trait ASPxClientFileManagerFilesUploadingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Gets the names of files selected for upload.
    */
  var fileNames: js.Array[String] = js.native
  /**
    * Gets the path to the folder where files are being uploaded.
    */
  var folder: String = js.native
}

object ASPxClientFileManagerFilesUploadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerFilesUploadingEventArgsOps[Self <: ASPxClientFileManagerFilesUploadingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

