package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDialogReturnValue extends js.Object {
  /**
    * An array matching the filePaths array of base64 encoded strings which contains
    * security scoped bookmark data. securityScopedBookmarks must be enabled for this
    * to be populated.
    */
  var bookmarks: js.UndefOr[js.Array[String]] = js.native
  /**
    * whether or not the dialog was canceled.
    */
  var canceled: Boolean = js.native
  /**
    * An array of file paths chosen by the user. If the dialog is cancelled this will
    * be an empty array.
    */
  var filePaths: js.UndefOr[js.Array[String]] = js.native
}

object OpenDialogReturnValue {
  @scala.inline
  def apply(canceled: Boolean): OpenDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDialogReturnValue]
  }
  @scala.inline
  implicit class OpenDialogReturnValueOps[Self <: OpenDialogReturnValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBookmarks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePaths")(js.undefined)
        ret
    }
  }
  
}

