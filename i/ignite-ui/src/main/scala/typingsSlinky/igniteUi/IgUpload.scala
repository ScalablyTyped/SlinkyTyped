package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgUpload
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get or set file allowed file extensions. When this array is empty - it is not made such validation. Example ["gif", "jpg", "bmp"].
  	 *
  	 */
  var allowedExtensions: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Get or set whether the file start upload automatically when it is selected. Default is false.
  	 *
  	 */
  var autostartupload: js.UndefOr[Boolean] = js.native
  /**
  	 * Defines the name of the cancel all button event click. Fired when cancel all button in summary is clicked. Fired only in multiple upload mode.
  	 */
  var cancelAllClicked: js.UndefOr[CancelAllClickedEvent] = js.native
  /**
  	 * UniqueId of the control - should not be changed by developer. Set from server-side wrapper.
  	 *
  	 */
  var controlId: js.UndefOr[String] = js.native
  /**
  	 * Get or set control specific CSS options. For example you can override specific control classes with custom ones.
  	 *
  	 */
  var css: js.UndefOr[js.Any] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when AJAX Request to get file size throws error.
  	 * Use option [locale.errorMessageAJAXRequestFileSize](ui.igupload#options:locale.errorMessageAJAXRequestFileSize).
  	 */
  var errorMessageAJAXRequestFileSize: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when ajax call to send cancel upload command.
  	 * Use option [locale.errorMessageCancelUpload](ui.igupload#options:locale.errorMessageCancelUpload).
  	 */
  var errorMessageCancelUpload: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when trying to drop more than 1 file and mode is single.
  	 * Use option [locale.errorMessageDropMultipleFilesWhenSingleModel](ui.igupload#options:locale.errorMessageDropMultipleFilesWhenSingleModel).
  	 */
  var errorMessageDropMultipleFilesWhenSingleModel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when ajax call to get file status throws error.
  	 * Use option [locale.errorMessageGetFileStatus](ui.igupload#options:locale.errorMessageGetFileStatus).
  	 */
  var errorMessageGetFileStatus: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set message shown when max file size of the uploaded file exceeds the limit.
  	 * Use option [locale.errorMessageMaxFileSizeExceeded](ui.igupload#options:locale.errorMessageMaxFileSizeExceeded).
  	 */
  var errorMessageMaxFileSizeExceeded: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when maximum simultaneous files is less or equal to 0.
  	 * Use option [locale.errorMessageMaxSimultaneousFiles](ui.igupload#options:locale.errorMessageMaxSimultaneousFiles).
  	 */
  var errorMessageMaxSimultaneousFiles: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when maximum allowed files exceeded.
  	 * Use option [locale.errorMessageMaxUploadedFiles](ui.igupload#options:locale.errorMessageMaxUploadedFiles).
  	 */
  var errorMessageMaxUploadedFiles: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when file is not found.
  	 * Use option [locale.errorMessageNoSuchFile](ui.igupload#options:locale.errorMessageNoSuchFile).
  	 */
  var errorMessageNoSuchFile: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *  Get or set error message different from the other messages.
  	 * Use option [locale.errorMessageOther](ui.igupload#options:locale.errorMessageOther).
  	 */
  var errorMessageOther: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when trying to remove non existing file.
  	 * Use option [locale.errorMessageTryToRemoveNonExistingFile](ui.igupload#options:locale.errorMessageTryToRemoveNonExistingFile).
  	 */
  var errorMessageTryToRemoveNonExistingFile: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when trying to start non existing file.
  	 * Use option [locale.errorMessageTryToStartNonExistingFile](ui.igupload#options:locale.errorMessageTryToStartNonExistingFile).
  	 */
  var errorMessageTryToStartNonExistingFile: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set error message when file extension validation failed.
  	 * Use option [locale.errorMessageValidatingFileExtension](ui.igupload#options:locale.errorMessageValidatingFileExtension).
  	 */
  var errorMessageValidatingFileExtension: js.UndefOr[String] = js.native
  /**
  	 * Set icon css classes for specified file extension
  	 *
  	 */
  var fileExtensionIcons: js.UndefOr[IgUploadFileExtensionIcons] = js.native
  /**
  	 * It is fired when validating file extensions
  	 */
  var fileExtensionsValidating: js.UndefOr[FileExtensionsValidatingEvent] = js.native
  /**
  	 * Defines the name of the file upload selected event. Fired when file is selected from browse dialog.
  	 * Return false in order to cancel uploading file.
  	 */
  var fileSelected: js.UndefOr[FileSelectedEvent] = js.native
  /**
  	 * Defines the name of the file upload selecting event. Fired when browse button is pressed.
  	 * Return false in order to cancel selecting file.
  	 */
  var fileSelecting: js.UndefOr[FileSelectingEvent] = js.native
  /**
  	 * The number of digits after the decimal point.
  	 *
  	 */
  var fileSizeDecimalDisplay: js.UndefOr[Double] = js.native
  /**
  	 * Get or set file size metrics how to be shown files size.
  	 *
  	 */
  var fileSizeMetric: js.UndefOr[js.Any] = js.native
  /**
  	 * Defines the name of the file upload cancel event. Fired when the server responses that the file is canceled.
  	 */
  var fileUploadAborted: js.UndefOr[FileUploadAbortedEvent] = js.native
  /**
  	 * Defines the name of the uploaded event. Fired when the file is uploaded
  	 */
  var fileUploaded: js.UndefOr[FileUploadedEvent] = js.native
  /**
  	 * Defines the name of the file uploading event. Fired every time when fileuploader get status for the upload.
  	 * Return false in order to cancel uploading file.
  	 */
  var fileUploading: js.UndefOr[FileUploadingEvent] = js.native
  /**
  	 * Get or set height of the main container of the file upload control. Main container contains all buttons, progressbar, etc.
  	 *
  	 */
  var height: js.UndefOr[Double | String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label for browse button in main container.
  	 * Use option [locale.labelAddButton](ui.igupload#options:locale.labelAddButton).
  	 */
  var labelAddButton: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label for summary Clear all button. It will be shown only in multiple upload mode.
  	 * Use option [locale.labelClearAllButton](ui.igupload#options:locale.labelClearAllButton).
  	 */
  var labelClearAllButton: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label for show/hide details button when main container is shown.
  	 * Use option [locale.labelHideDetails](ui.igupload#options:locale.labelHideDetails).
  	 */
  var labelHideDetails: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set filename when it could not be shown the whole file name and should be shorten.
  	 * Use option [locale.labelProgressBarFileNameContinue](ui.igupload#options:locale.labelProgressBarFileNameContinue).
  	 */
  var labelProgressBarFileNameContinue: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label for show/hide details button when main container is hidden.
  	 * Use option [locale.labelShowDetails](ui.igupload#options:locale.labelShowDetails).
  	 */
  var labelShowDetails: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set template for showing uploading information in summary progress bar. It will be shown only in multiple upload mode. {0} uploaded filesize. {1} - total file size.
  	 * Use option [locale.labelSummaryProgressBarTemplate](ui.igupload#options:locale.labelSummaryProgressBarTemplate).
  	 */
  var labelSummaryProgressBarTemplate: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label for button cancelling all files. Shown only in multiple upload mode.
  	 * Use option [locale.labelSummaryProgressButtonCancel](ui.igupload#options:locale.labelSummaryProgressButtonCancel).
  	 */
  var labelSummaryProgressButtonCancel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
  	 * Use option [locale.labelSummaryProgressButtonContinue](ui.igupload#options:locale.labelSummaryProgressButtonContinue).
  	 */
  var labelSummaryProgressButtonContinue: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label when upload is finished. Shown only in multiple upload mode.
  	 * Use option [locale.labelSummaryProgressButtonDone](ui.igupload#options:locale.labelSummaryProgressButtonDone).
  	 */
  var labelSummaryProgressButtonDone: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set template for showing summary template. {0} is count of uploaded files. {1} is total count of file to be uploaded.
  	 * Use option [locale.labelSummaryTemplate](ui.igupload#options:locale.labelSummaryTemplate).
  	 */
  var labelSummaryTemplate: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Get or set label for the first shown browse button. When file is selected for the first time this button is hidden.
  	 * Use option [locale.labelUploadButton](ui.igupload#options:locale.labelUploadButton).
  	 */
  var labelUploadButton: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgUploadLocale] = js.native
  /**
  	 * Maximum size(in bytes) allowed for the file to be uploaded. If it is set to null or -1 there is no limitation otherwise if the size(of the selected file) exceeds this value it is not allowed to be uploaded. This option is used for validation only on client side and only if the browser supports HTML5 file API and share information about the file size
  	 */
  var maxFileSize: js.UndefOr[js.Any] = js.native
  /**
  	 * Get or set count of files that could be uploaded at the same time.
  	 *
  	 */
  var maxSimultaneousFilesUploads: js.UndefOr[Double] = js.native
  /**
  	 * Get or set the maximum number of allowed files to upload.
  	 *
  	 */
  var maxUploadedFiles: js.UndefOr[Double] = js.native
  /**
  	 * Get or set multiple or single file upload. In single upload it is possible to upload only one file at the same time.
  	 *
  	 */
  var mode: js.UndefOr[js.Any] = js.native
  /**
  	 * Get or set a bool setting that allows user to select(for upload) more than 1 file from the browse dialog at once. HTML 5+ - it is supported by Chrome, MOzilla FF, Safar, Opera latest versions and IE10+
  	 *
  	 */
  var multipleFiles: js.UndefOr[Boolean] = js.native
  /**
  	 * Defines the name of the file upload error event. Fired when error is occurred.
  	 */
  var onError: js.UndefOr[OnErrorEvent] = js.native
  /**
  	 * It is fired before submitting to the server the uploading file(and its additional data if any). It could be used to append additional data fields to the FormData object(if the browser supports HTML5 file API - like newest Chrome, Firefox, IE11+). If the browser does not support HTML5 file API(IE10 and older) it could be added these data fields(as hidden input fields) to the form. Use the public API function addDataFields.
  	 */
  var onFormDataSubmit: js.UndefOr[OnFormDataSubmitEvent] = js.native
  /**
  	 * It is fired when event onload(of XmlHttpRequest) is fired. This event will be fired only if the browser supports HTML5 file API
  	 */
  var onXHRLoad: js.UndefOr[OnXHRLoadEvent] = js.native
  /**
  	 * Get or set URL of HTTPHandler to get information about file upload, current size and also to get commands
  	 *
  	 */
  var progressUrl: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Get or set whether to show File Extension icon
  	 *
  	 */
  var showFileExtensionIcon: js.UndefOr[Boolean] = js.native
  /**
  	 * Get or set URL for uploading.
  	 *
  	 */
  var uploadUrl: js.UndefOr[String] = js.native
  /**
  	 * Get or set whether to use only one request for sending data, when you are sending more than one file.
  	 *
  	 */
  var useSingleRequest: js.UndefOr[Boolean] = js.native
  /**
  	 * Get or set width of the main container of the file upload control. Main container contains all buttons, progressbar, etc.
  	 *
  	 */
  var width: js.UndefOr[Double | String] = js.native
}

object IgUpload {
  @scala.inline
  def apply(): IgUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUpload]
  }
  @scala.inline
  implicit class IgUploadOps[Self <: IgUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedExtensions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutostartupload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostartupload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutostartupload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostartupload")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelAllClicked(value: (/* event */ Event_, /* ui */ CancelAllClickedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAllClicked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCancelAllClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAllClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withControlId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlId")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
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
    def withErrorMessageMaxFileSizeExceeded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxFileSizeExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageMaxFileSizeExceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxFileSizeExceeded")(js.undefined)
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
    def withFileExtensionIcons(value: IgUploadFileExtensionIcons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtensionIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtensionIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtensionIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtensionsValidating(value: (/* event */ Event_, /* ui */ FileExtensionsValidatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtensionsValidating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileExtensionsValidating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtensionsValidating")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSelected(value: (/* event */ Event_, /* ui */ FileSelectedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSelecting(value: (/* event */ Event_, /* ui */ FileSelectingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelecting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSizeDecimalDisplay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizeDecimalDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSizeDecimalDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizeDecimalDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSizeMetric(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizeMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSizeMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSizeMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUploadAborted(value: (/* event */ Event_, /* ui */ FileUploadAbortedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadAborted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileUploadAborted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadAborted")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUploaded(value: (/* event */ Event_, /* ui */ FileUploadedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUploading(value: (/* event */ Event_, /* ui */ FileUploadingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploading")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileUploading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploading")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgUploadLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: js.Any): Self = {
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
    def withMaxSimultaneousFilesUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousFilesUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSimultaneousFilesUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousFilesUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUploadedFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUploadedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUploadedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUploadedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: (/* event */ Event_, /* ui */ OnErrorEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFormDataSubmit(value: (/* event */ Event_, /* ui */ OnFormDataSubmitEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormDataSubmit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFormDataSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormDataSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnXHRLoad(value: (/* event */ Event_, /* ui */ OnXHRLoadEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onXHRLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnXHRLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onXHRLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFileExtensionIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileExtensionIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFileExtensionIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileExtensionIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSingleRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSingleRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

