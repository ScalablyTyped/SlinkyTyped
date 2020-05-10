package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.File
import typingsSlinky.devextreme.AnonBytesLoaded
import typingsSlinky.devextreme.AnonBytesUploaded
import typingsSlinky.devextreme.AnonFile
import typingsSlinky.devextreme.AnonJQueryEventModel
import typingsSlinky.devextreme.AnonRequest
import typingsSlinky.devextreme.devextremeStrings.POST
import typingsSlinky.devextreme.devextremeStrings.PUT
import typingsSlinky.devextreme.devextremeStrings.instantly
import typingsSlinky.devextreme.devextremeStrings.useButtons
import typingsSlinky.devextreme.devextremeStrings.useForm
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileUploaderOptions extends EditorOptions[dxFileUploader] {
  /** A function that cancels the file upload. */
  var abortUpload: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* uploadInfo */ AnonBytesUploaded, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  /** Specifies a file type or several types accepted by the widget. */
  var accept: js.UndefOr[String] = js.native
  /** Specifies if an end user can remove a file from the selection and interrupt uploading. */
  var allowCanceling: js.UndefOr[Boolean] = js.native
  /** Restricts file extensions that can be uploaded to the server. */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
  /** Specifies the chunk size in bytes. Applies only if uploadMode is "instantly" or "useButtons". Requires a server that can process file chunks. */
  var chunkSize: js.UndefOr[Double] = js.native
  /** The text displayed when the extension of the file being uploaded is not an allowed file extension. */
  var invalidFileExtensionMessage: js.UndefOr[String] = js.native
  /** The text displayed when the size of the file being uploaded is greater than the maxFileSize. */
  var invalidMaxFileSizeMessage: js.UndefOr[String] = js.native
  /** The text displayed when the size of the file being uploaded is less than the minFileSize. */
  var invalidMinFileSizeMessage: js.UndefOr[String] = js.native
  /** Specifies the text displayed on the area to which an end-user can drop a file. */
  var labelText: js.UndefOr[String] = js.native
  /** Specifies the maximum file size (in bytes) allowed for uploading. Applies only if uploadMode is "instantly" or "useButtons". */
  var maxFileSize: js.UndefOr[Double] = js.native
  /** Specifies the minimum file size (in bytes) allowed for uploading. Applies only if uploadMode is "instantly" or "useButtons". */
  var minFileSize: js.UndefOr[Double] = js.native
  /** Specifies whether the widget enables an end-user to select a single file or multiple files. */
  var multiple: js.UndefOr[Boolean] = js.native
  /** Specifies the value passed to the name attribute of the underlying input element. Required to access uploaded files on the server. */
  var name: js.UndefOr[String] = js.native
  /** A function that is executed when a file segment is uploaded. */
  var onProgress: js.UndefOr[js.Function1[/* e */ AnonBytesLoaded, _]] = js.native
  /** A function that is executed when the file upload is aborted. */
  var onUploadAborted: js.UndefOr[js.Function1[/* e */ AnonFile, _]] = js.native
  /** A function that is executed when an error occurs during the file upload. */
  var onUploadError: js.UndefOr[js.Function1[/* e */ AnonRequest, _]] = js.native
  /** A function that is executed when the file upload is started. */
  var onUploadStarted: js.UndefOr[js.Function1[/* e */ AnonFile, _]] = js.native
  /** A function that is executed when a file is successfully uploaded. */
  var onUploaded: js.UndefOr[js.Function1[/* e */ AnonFile, _]] = js.native
  /** A function that is executed when one or several files are added to or removed from the selection. */
  @JSName("onValueChanged")
  var onValueChanged_dxFileUploaderOptions: js.UndefOr[js.Function1[/* e */ AnonJQueryEventModel, _]] = js.native
  /** Gets the current progress in percentages. */
  var progress: js.UndefOr[Double] = js.native
  /** The message displayed by the widget when it is ready to upload the specified files. */
  var readyToUploadMessage: js.UndefOr[String] = js.native
  /** The text displayed on the button that opens the file browser. */
  var selectButtonText: js.UndefOr[String] = js.native
  /** Specifies whether or not the widget displays the list of selected files. */
  var showFileList: js.UndefOr[Boolean] = js.native
  /** The text displayed on the button that starts uploading. */
  var uploadButtonText: js.UndefOr[String] = js.native
  /** A function that uploads a file in chunks. */
  var uploadChunk: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* uploadInfo */ AnonBytesUploaded, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  /** The message displayed by the widget on uploading failure. */
  var uploadFailedMessage: js.UndefOr[String] = js.native
  /** A function that uploads a file. */
  var uploadFile: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* progressCallback */ js.Function, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  /** Specifies headers for the upload request. */
  var uploadHeaders: js.UndefOr[js.Any] = js.native
  /** Specifies the method for the upload request. */
  var uploadMethod: js.UndefOr[POST | PUT] = js.native
  /** Specifies how the widget uploads files. */
  var uploadMode: js.UndefOr[instantly | useButtons | useForm] = js.native
  /** Specifies a target Url for the upload request. */
  var uploadUrl: js.UndefOr[String] = js.native
  /** The message displayed by the widget when uploading is finished. */
  var uploadedMessage: js.UndefOr[String] = js.native
  /** Specifies a File instance representing the selected file. Read-only when uploadMode is "useForm". */
  @JSName("value")
  var value_dxFileUploaderOptions: js.UndefOr[js.Array[File]] = js.native
}

object dxFileUploaderOptions {
  @scala.inline
  def apply(): dxFileUploaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileUploaderOptions]
  }
  @scala.inline
  implicit class dxFileUploaderOptionsOps[Self <: dxFileUploaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortUpload(value: (/* file */ File, /* uploadInfo */ AnonBytesUploaded) => Promise[_] | JQueryPromise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortUpload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAbortUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCanceling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCanceling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCanceling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCanceling")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedFileExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFileExtensionMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileExtensionMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFileExtensionMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileExtensionMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMaxFileSizeMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMaxFileSizeMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMaxFileSizeMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMaxFileSizeMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMinFileSizeMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMinFileSizeMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMinFileSizeMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMinFileSizeMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelText")(js.undefined)
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
    def withMinFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* e */ AnonBytesLoaded => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploadAborted(value: /* e */ AnonFile => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadAborted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploadAborted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadAborted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploadError(value: /* e */ AnonRequest => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploadStarted(value: /* e */ AnonFile => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploadStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploaded(value: /* e */ AnonFile => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* e */ AnonJQueryEventModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyToUploadMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyToUploadMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyToUploadMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyToUploadMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFileList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileList")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadChunk(value: (/* file */ File, /* uploadInfo */ AnonBytesUploaded) => Promise[_] | JQueryPromise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadChunk")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUploadChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadFailedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFailedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadFailedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFailedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadFile(value: (/* file */ File, /* progressCallback */ js.Function) => Promise[_] | JQueryPromise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUploadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFile")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadMethod(value: POST | PUT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadMode(value: instantly | useButtons | useForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMode")(js.undefined)
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
    def withUploadedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

