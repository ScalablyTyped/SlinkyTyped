package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgUploadLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get or set error message when AJAX Request to get file size throws error.
  	 *
  	 */
  var errorMessageAJAXRequestFileSize: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when ajax call to send cancel upload command.
  	 *
  	 */
  var errorMessageCancelUpload: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when trying to drop more than 1 file and mode is single.
  	 *
  	 */
  var errorMessageDropMultipleFilesWhenSingleModel: js.UndefOr[String] = js.native
  /**
  	 * Get or set message shown when max file size of the uploaded file exceeds the limit.
  	 *
  	 */
  var errorMessageFileSizeExceeded: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when ajax call to get file status throws error.
  	 *
  	 */
  var errorMessageGetFileStatus: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when maximum simultaneous files is less or equal to 0.
  	 *
  	 */
  var errorMessageMaxSimultaneousFiles: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when maximum allowed files exceeded.
  	 *
  	 */
  var errorMessageMaxUploadedFiles: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when file is not found.
  	 *
  	 */
  var errorMessageNoSuchFile: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message different from the other messages.
  	 *
  	 */
  var errorMessageOther: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when trying to remove non existing file.
  	 *
  	 */
  var errorMessageTryToRemoveNonExistingFile: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when trying to start non existing file.
  	 *
  	 */
  var errorMessageTryToStartNonExistingFile: js.UndefOr[String] = js.native
  /**
  	 * Get or set error message when file extension validation failed.
  	 *
  	 */
  var errorMessageValidatingFileExtension: js.UndefOr[String] = js.native
  /**
  	 * Get or set label for browse button in main container.
  	 *
  	 */
  var labelAddButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set label for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var labelClearAllButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set label for show/hide details button when main container is shown.
  	 *
  	 */
  var labelHideDetails: js.UndefOr[String] = js.native
  /**
  	 * Get or set filename when it could not be shown the whole file name and should be shorten.
  	 *
  	 */
  var labelProgressBarFileNameContinue: js.UndefOr[String] = js.native
  /**
  	 * Get or set label for show/hide details button when main container is hidden.
  	 *
  	 */
  var labelShowDetails: js.UndefOr[String] = js.native
  /**
  	 * Get or set template for showing uploading information in summary progress bar. It will be shown only in multiple upload mode. {0} uploaded filesize. {1} - total file size.
  	 *
  	 */
  var labelSummaryProgressBarTemplate: js.UndefOr[String] = js.native
  /**
  	 * Get or set label for button cancelling all files. Shown only in multiple upload mode.
  	 *
  	 */
  var labelSummaryProgressButtonCancel: js.UndefOr[String] = js.native
  /**
  	 * Get or set label for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
  	 *
  	 */
  var labelSummaryProgressButtonContinue: js.UndefOr[String] = js.native
  /**
  	 * Get or set label when upload is finished. Shown only in multiple upload mode.
  	 *
  	 */
  var labelSummaryProgressButtonDone: js.UndefOr[String] = js.native
  /**
  	 * Get or set template for showing summary template. {0} is count of uploaded files. {1} is total count of file to be uploaded.
  	 *
  	 */
  var labelSummaryTemplate: js.UndefOr[String] = js.native
  /**
  	 * Get or set label for the first shown browse button. When file is selected for the first time this button is hidden.
  	 *
  	 */
  var labelUploadButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for browse button in main container.
  	 *
  	 */
  var titleAddFileButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for the cancel upload button.
  	 *
  	 */
  var titleCancelUploadButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var titleClearAllButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var titleClearUploaded: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for hide details button.
  	 *
  	 */
  var titleHideDetailsButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for show details button.
  	 *
  	 */
  var titleShowDetailsButton: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for Continue button.
  	 *
  	 */
  var titleSingleUploadButtonContinue: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for button cancelling all files. Shown only in multiple upload mode.
  	 *
  	 */
  var titleSummaryProgressButtonCancel: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
  	 *
  	 */
  var titleSummaryProgressButtonContinue: js.UndefOr[String] = js.native
  /**
  	 * Get or set title when upload is finished. Shown only in multiple upload mode.
  	 *
  	 */
  var titleSummaryProgressButtonDone: js.UndefOr[String] = js.native
  /**
  	 * Get or set title for the first shown browse button. When file is selected for the first time this button is hidden.
  	 *
  	 */
  var titleUploadFileButtonInit: js.UndefOr[String] = js.native
}

object IgUploadLocale {
  @scala.inline
  def apply(): IgUploadLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUploadLocale]
  }
  @scala.inline
  implicit class IgUploadLocaleOps[Self <: IgUploadLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessageAJAXRequestFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageAJAXRequestFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageAJAXRequestFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageAJAXRequestFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageCancelUpload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageCancelUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageCancelUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageCancelUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageDropMultipleFilesWhenSingleModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageDropMultipleFilesWhenSingleModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageDropMultipleFilesWhenSingleModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageDropMultipleFilesWhenSingleModel")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageFileSizeExceeded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageFileSizeExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageFileSizeExceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageFileSizeExceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageGetFileStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageGetFileStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageGetFileStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageGetFileStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageMaxSimultaneousFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxSimultaneousFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageMaxSimultaneousFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxSimultaneousFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageMaxUploadedFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxUploadedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageMaxUploadedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxUploadedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageNoSuchFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageNoSuchFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageNoSuchFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageNoSuchFile")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageOther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageOther")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageTryToRemoveNonExistingFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageTryToRemoveNonExistingFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageTryToRemoveNonExistingFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageTryToRemoveNonExistingFile")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageTryToStartNonExistingFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageTryToStartNonExistingFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageTryToStartNonExistingFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageTryToStartNonExistingFile")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageValidatingFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageValidatingFileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageValidatingFileExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageValidatingFileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAddButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAddButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAddButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAddButton")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelClearAllButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClearAllButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelClearAllButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClearAllButton")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHideDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHideDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHideDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHideDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelProgressBarFileNameContinue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProgressBarFileNameContinue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelProgressBarFileNameContinue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProgressBarFileNameContinue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelShowDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelShowDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelShowDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelShowDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSummaryProgressBarTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressBarTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSummaryProgressBarTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressBarTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSummaryProgressButtonCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressButtonCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSummaryProgressButtonCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressButtonCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSummaryProgressButtonContinue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressButtonContinue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSummaryProgressButtonContinue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressButtonContinue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSummaryProgressButtonDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressButtonDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSummaryProgressButtonDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryProgressButtonDone")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSummaryTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSummaryTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSummaryTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelUploadButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelUploadButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelUploadButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelUploadButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAddFileButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAddFileButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAddFileButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAddFileButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleCancelUploadButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCancelUploadButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleCancelUploadButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCancelUploadButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleClearAllButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClearAllButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleClearAllButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClearAllButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleClearUploaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClearUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleClearUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClearUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleHideDetailsButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHideDetailsButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleHideDetailsButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHideDetailsButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleShowDetailsButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleShowDetailsButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleShowDetailsButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleShowDetailsButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleSingleUploadButtonContinue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSingleUploadButtonContinue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSingleUploadButtonContinue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSingleUploadButtonContinue")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleSummaryProgressButtonCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSummaryProgressButtonCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSummaryProgressButtonCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSummaryProgressButtonCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleSummaryProgressButtonContinue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSummaryProgressButtonContinue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSummaryProgressButtonContinue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSummaryProgressButtonContinue")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleSummaryProgressButtonDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSummaryProgressButtonDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSummaryProgressButtonDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSummaryProgressButtonDone")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleUploadFileButtonInit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleUploadFileButtonInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleUploadFileButtonInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleUploadFileButtonInit")(js.undefined)
        ret
    }
  }
  
}

