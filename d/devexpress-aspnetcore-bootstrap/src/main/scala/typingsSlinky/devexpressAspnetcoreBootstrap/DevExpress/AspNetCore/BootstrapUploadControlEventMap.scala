package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapUploadControlEventMap extends ControlEventMap {
  var dropZoneEnter: UploadControlDropZoneEnterEventArgs = js.native
  var dropZoneLeave: UploadControlDropZoneLeaveEventArgs = js.native
  var fileInputCountChanged: EventArgs = js.native
  var fileUploadComplete: UploadControlFileUploadCompleteEventArgs = js.native
  var filesUploadComplete: UploadControlFilesUploadCompleteEventArgs = js.native
  var filesUploadStart: UploadControlFilesUploadStartEventArgs = js.native
  var textChanged: UploadControlTextChangedEventArgs = js.native
  var uploadingProgressChanged: UploadControlUploadingProgressChangedEventArgs = js.native
  var validationErrorOccurred: UploadControlValidationErrorOccurredEventArgs = js.native
}

object BootstrapUploadControlEventMap {
  @scala.inline
  def apply(
    dropZoneEnter: UploadControlDropZoneEnterEventArgs,
    dropZoneLeave: UploadControlDropZoneLeaveEventArgs,
    fileInputCountChanged: EventArgs,
    fileUploadComplete: UploadControlFileUploadCompleteEventArgs,
    filesUploadComplete: UploadControlFilesUploadCompleteEventArgs,
    filesUploadStart: UploadControlFilesUploadStartEventArgs,
    init: EventArgs,
    textChanged: UploadControlTextChangedEventArgs,
    uploadingProgressChanged: UploadControlUploadingProgressChangedEventArgs,
    validationErrorOccurred: UploadControlValidationErrorOccurredEventArgs
  ): BootstrapUploadControlEventMap = {
    val __obj = js.Dynamic.literal(dropZoneEnter = dropZoneEnter.asInstanceOf[js.Any], dropZoneLeave = dropZoneLeave.asInstanceOf[js.Any], fileInputCountChanged = fileInputCountChanged.asInstanceOf[js.Any], fileUploadComplete = fileUploadComplete.asInstanceOf[js.Any], filesUploadComplete = filesUploadComplete.asInstanceOf[js.Any], filesUploadStart = filesUploadStart.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], uploadingProgressChanged = uploadingProgressChanged.asInstanceOf[js.Any], validationErrorOccurred = validationErrorOccurred.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUploadControlEventMap]
  }
  @scala.inline
  implicit class BootstrapUploadControlEventMapOps[Self <: BootstrapUploadControlEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropZoneEnter(value: UploadControlDropZoneEnterEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZoneEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropZoneLeave(value: UploadControlDropZoneLeaveEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZoneLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileInputCountChanged(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputCountChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileUploadComplete(value: UploadControlFileUploadCompleteEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesUploadComplete(value: UploadControlFilesUploadCompleteEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesUploadComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesUploadStart(value: UploadControlFilesUploadStartEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesUploadStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextChanged(value: UploadControlTextChangedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadingProgressChanged(value: UploadControlUploadingProgressChangedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadingProgressChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationErrorOccurred(value: UploadControlValidationErrorOccurredEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrorOccurred")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

