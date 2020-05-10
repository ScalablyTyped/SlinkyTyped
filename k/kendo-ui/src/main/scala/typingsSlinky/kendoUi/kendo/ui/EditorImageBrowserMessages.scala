package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorImageBrowserMessages extends js.Object {
  var deleteFile: js.UndefOr[String] = js.native
  var directoryNotFound: js.UndefOr[String] = js.native
  var emptyFolder: js.UndefOr[String] = js.native
  var invalidFileType: js.UndefOr[String] = js.native
  var orderBy: js.UndefOr[String] = js.native
  var orderByName: js.UndefOr[String] = js.native
  var orderBySize: js.UndefOr[String] = js.native
  var overwriteFile: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var uploadFile: js.UndefOr[String] = js.native
}

object EditorImageBrowserMessages {
  @scala.inline
  def apply(): EditorImageBrowserMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserMessages]
  }
  @scala.inline
  implicit class EditorImageBrowserMessagesOps[Self <: EditorImageBrowserMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFile")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryNotFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryNotFound")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileType")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderByName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderByName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByName")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBySize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBySize")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFile")(js.undefined)
        ret
    }
  }
  
}

