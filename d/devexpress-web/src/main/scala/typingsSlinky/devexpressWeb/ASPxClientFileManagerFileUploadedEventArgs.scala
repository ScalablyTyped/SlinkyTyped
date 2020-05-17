package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileUploaded event.
  */
@js.native
trait ASPxClientFileManagerFileUploadedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the uploaded file.
    */
  var fileName: String = js.native
  /**
    * Gets the path to the folder where a file is uploaded.
    */
  var folder: String = js.native
}

object ASPxClientFileManagerFileUploadedEventArgs {
  @scala.inline
  def apply(fileName: String, folder: String): ASPxClientFileManagerFileUploadedEventArgs = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerFileUploadedEventArgsOps[Self <: ASPxClientFileManagerFileUploadedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
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

