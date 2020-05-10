package typingsSlinky.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSettings extends js.Object {
  /** Enables or disables the multiple files upload. When it is enabled, you can upload multiple files at a time and when disabled, you can upload only one file at a time.
    * @Default {true}
    */
  var allowMultipleFile: js.UndefOr[Boolean] = js.native
  /** Enables or disables the auto upload option while uploading files in FileExplorer control.
    * @Default {false}
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /** Specifies the actions for upload dialog during initialization.
    * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true }}
    */
  var dialogAction: js.UndefOr[js.Any] = js.native
  /** Specifies the position at which the upload dialog is displayed using X and Y values. X: Sets the left position value for dialog. Y: Sets the top position value for dialog.
    * @Default {null}
    */
  var dialogPosition: js.UndefOr[js.Any] = js.native
  /** Specifies the maximum file size allowed to upload. It accepts the value in bytes.
    * @Default {31457280}
    */
  var maxFileSize: js.UndefOr[Double] = js.native
  /** Specifies the file details which are to be displayed when selected for upload by setting the showFileDetails to true.
    * @Default {true}
    */
  var showFileDetails: js.UndefOr[Boolean] = js.native
}

object UploadSettings {
  @scala.inline
  def apply(): UploadSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSettings]
  }
  @scala.inline
  implicit class UploadSettingsOps[Self <: UploadSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleFile")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogAction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogAction")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFileDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFileDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileDetails")(js.undefined)
        ret
    }
  }
  
}

