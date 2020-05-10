package typingsSlinky.fineUploader.mod

import typingsSlinky.fineUploader.coreMod.DeleteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDeleteFileOptions extends DeleteFileOptions {
  /**
    * The message displayed in the confirm delete dialog
    *
    * @default `'Are you sure you want to delete {filename}?'`
    */
  var confirmMessage: js.UndefOr[String] = js.native
  /**
    * The status message to appear next to a file that has failed to delete
    *
    * @default `'Delete failed'`
    */
  var deletingFailedText: js.UndefOr[String] = js.native
  /**
    * The status message to appear next to a file that is pending deletion
    *
    * @default `'Deleting...'`
    */
  var deletingStatusText: js.UndefOr[String] = js.native
  /**
    * If this value is set to `true`, the user will be required to confirm the file delete request via a confirmation dialog
    *
    * @default `false`
    */
  var forceConfirm: js.UndefOr[Boolean] = js.native
}

object UIDeleteFileOptions {
  @scala.inline
  def apply(): UIDeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDeleteFileOptions]
  }
  @scala.inline
  implicit class UIDeleteFileOptionsOps[Self <: UIDeleteFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletingFailedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletingFailedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletingFailedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletingFailedText")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletingStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletingStatusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletingStatusText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletingStatusText")(js.undefined)
        ret
    }
    @scala.inline
    def withForceConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceConfirm")(js.undefined)
        ret
    }
  }
  
}

