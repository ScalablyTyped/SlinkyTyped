package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FilesUploaded event.
  */
@js.native
trait ASPxClientFileManagerFilesUploadedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of uploaded file names.
    */
  var fileNames: js.Array[String] = js.native
  /**
    * Gets the path to the folder where files are uploaded.
    */
  var folder: String = js.native
}

object ASPxClientFileManagerFilesUploadedEventArgs {
  @scala.inline
  def apply(fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadedEventArgs = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerFilesUploadedEventArgsOps[Self <: ASPxClientFileManagerFilesUploadedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

