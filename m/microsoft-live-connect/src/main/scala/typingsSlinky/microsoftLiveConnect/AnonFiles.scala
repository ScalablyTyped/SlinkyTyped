package typingsSlinky.microsoftLiveConnect

import typingsSlinky.microsoftLiveConnect.Microsoft.Live.IFile
import typingsSlinky.microsoftLiveConnect.Microsoft.Live.IFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFiles extends js.Object {
  /**
    * Information on files choden in the picker.
    */
  var files: js.UndefOr[js.Array[IFile]] = js.native
  /**
    * Information on folders chosen in the picker.
    */
  var folders: js.UndefOr[js.Array[IFolder]] = js.native
}

object AnonFiles {
  @scala.inline
  def apply(): AnonFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFiles]
  }
  @scala.inline
  implicit class AnonFilesOps[Self <: AnonFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[IFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFolders(value: js.Array[IFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(js.undefined)
        ret
    }
  }
  
}

