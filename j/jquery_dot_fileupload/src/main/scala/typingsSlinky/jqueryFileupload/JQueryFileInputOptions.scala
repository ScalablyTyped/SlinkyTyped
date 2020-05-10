package typingsSlinky.jqueryFileupload

import org.scalajs.dom.raw.Element
import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface options for the plugin
@js.native
trait JQueryFileInputOptions extends js.Object {
  var active: js.UndefOr[js.Function] = js.native
  /**
    * The add callback is invoked as soon as files are added to the fileupload
    * widget (via file input selection, drag & drop, paste or add API call).
    * If the singleFileUploads option is enabled, this callback will be
    * called once for each file in the selection for XHR file uploads, else
    * once for each file selection.
    *
    * The upload starts when the submit method is invoked on the data parameter.
    * The data object contains a files property holding the added files
    * and allows you to override plugin options as well as define ajax settings.
    *
    * Listeners for this callback can also be bound the following way:
    * .bind('fileuploadadd', func);
    *
    * data.submit() returns a Promise object and allows to attach additional
    * handlers using jQuery's Deferred callbacks:
    * data.submit().done(func).fail(func).always(func);
    */
  var add: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject, Unit]
  ] = js.native
  var always: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileInputOptions, Unit]] = js.native
  /**
    * By default, uploads are started automatically when adding files:
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /**
    * Interval in milliseconds to calculate progress bitrate:
    */
  var bitrateInterval: js.UndefOr[Double] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject, Unit]
  ] = js.native
  var chunkalways: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var chunkdone: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var chunkfail: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var chunksend: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.native
  var contentType: js.UndefOr[String] = js.native
  /**
    * The type of data that is expected back from the server.
    */
  var dataType: js.UndefOr[String] = js.native
  var done: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.native
  var dragover: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.native
  var drop: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.native
  /**
    * The drop target element(s), by the default the complete document.
    * Set to null to disable drag & drop support:
    */
  var dropZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  var fail: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.native
  /**
    * The file input field(s), that are listened to for change events.
    * If undefined, it is set to the file input fields inside
    * of the widget element on plugin initialization.
    * Set to null to disable the change listener.
    */
  var fileInput: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  var files: js.UndefOr[js.Any] = js.native
  /**
    * Set the following option to true to force iframe transport uploads:
    */
  var forceIframeTransport: js.UndefOr[Boolean] = js.native
  /**
    * Additional form data to be sent along with the file uploads can be set
    * using this option, which accepts an array of objects with name and
    * value properties, a function returning such an array, a FormData
    * object (for XHR file uploads), or a simple object.
    * The form of the first fileInput is given as parameter to the function:
    */
  var formData: js.UndefOr[js.Any] = js.native
  /**
    * Translation function, gets the message key to be translated
    * and an object with context specific data as arguments:
    */
  var i18n: js.UndefOr[js.Any] = js.native
  /**
    * To limit the number of concurrent uploads,
    * set the following option to an integer greater than 0:
    */
  var limitConcurrentUploads: js.UndefOr[Double] = js.native
  /**
    * The following option limits the number of files uploaded with one
    * XHR request to keep the request size under or equal to the defined
    * limit in bytes
    */
  var limitMultiFileUploadSize: js.UndefOr[Double] = js.native
  /**
    * Multipart file uploads add a number of bytes to each uploaded file,
    * therefore the following option adds an overhead for each file used
    * in the limitMultiFileUploadSize configuration:
    */
  var limitMultiFileUploadSizeOverhead: js.UndefOr[Double] = js.native
  /**
    * To limit the number of files uploaded with one XHR request,
    * set the following option to an integer greater than 0:
    */
  var limitMultiFileUploads: js.UndefOr[Double] = js.native
  /**
    * To upload large files in smaller chunks, set the following option
    * to a preferred maximum chunk size. If set to 0, null or undefined,
    * or the browser does not support the required Blob API, files will
    * be uploaded as a whole.
    */
  var maxChunkSize: js.UndefOr[Double] = js.native
  // Validation
  /**
    * The maximum allowed file size in bytes.
    * Type: integer
    * Default: undefined
    * Example: 10000000 // 10 MB
    * Note: This option has only an effect for browsers supporting the File API.
    * @see https://github.com/blueimp/jQuery-File-Upload/wiki/Options#maxfilesize
    */
  var maxFileSize: js.UndefOr[Double] = js.native
  /**
    * Error and info messages:
    */
  var messages: js.UndefOr[js.Any] = js.native
  /**
    * By default, XHR file uploads are sent as multipart/form-data.
    * The iframe transport is always using multipart/form-data.
    * Set to false to enable non-multipart XHR uploads:
    */
  var multipart: js.UndefOr[Boolean] = js.native
  /**
    * The parameter name for the file form data (the request argument name).
    * If undefined or empty, the name property of the file input field is
    * used, or "files[]" if the file input name property is also empty,
    * can be a string or an array of strings:
    */
  var paramName: js.UndefOr[js.Any] = js.native
  var paste: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.native
  /**
    * The paste target element(s), by the default the complete document.
    * Set to null to disable paste support:
    */
  var pasteZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  /**
    * Set the following option to the location of a postMessage window,
    * to enable postMessage transport uploads:
    */
  var postMessage: js.UndefOr[String] = js.native
  // The plugin options are used as settings object for the ajax calls.
  // The following are jQuery ajax settings required for the file uploads:
  var processData: js.UndefOr[Boolean] = js.native
  var progress: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.native
  /**
    * Interval in milliseconds to calculate and trigger progress events:
    */
  var progressInterval: js.UndefOr[Double] = js.native
  var progressall: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject, Unit]
  ] = js.native
  /**
    * By default, failed (abort or error) file uploads are removed from the
    * global progress calculation. Set the following option to false to
    * prevent recalculating the global progress data:
    */
  var recalculateProgress: js.UndefOr[Boolean] = js.native
  /**
    * Set the following option to the location of a redirect url on the
    * origin server, for cross-domain iframe transport uploads:
    */
  var redirect: js.UndefOr[String] = js.native
  /**
    * The parameter name for the redirect url, sent as part of the form
    * data and set to 'redirect' if this option is empty:
    */
  var redirectParamName: js.UndefOr[String] = js.native
  /**
    * By default, the file input field is replaced with a clone after
    * each input field change event. This is required for iframe transport
    * queues and allows change events to be fired for the same file
    * selection, but can be disabled by setting the following option to false:
    */
  var replaceFileInput: js.UndefOr[Boolean] = js.native
  var send: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.native
  /**
    * Set the following option to true to issue all file upload requests
    * in a sequential order:
    */
  var sequentialUploads: js.UndefOr[Boolean] = js.native
  /**
    * By default, each file of a selection is uploaded using an individual
    * request for XHR type uploads. Set to false to upload file
    * selections in one request each:
    */
  var singleFileUploads: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.native
  var stop: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.native
  // Other callbacks:
  var submit: js.UndefOr[js.Function] = js.native
  var timeout: js.UndefOr[Double] = js.native
  // The HTTP request method must be "POST" or "PUT"
  var `type`: js.UndefOr[String] = js.native
  /**
    * When a non-multipart upload or a chunked multipart upload has been
    * aborted, this option can be used to resume the upload by setting
    * it to the size of the already uploaded bytes. This option is most
    * useful when modifying the options object inside of the "add" or
    * "send" callbacks, as the options are cloned for each file upload.
    */
  var uploadedBytes: js.UndefOr[Double] = js.native
  // Others
  var url: js.UndefOr[String] = js.native
  // Cross-site XMLHttpRequest file uploads
  var xhrFields: js.UndefOr[js.Any] = js.native
}

object JQueryFileInputOptions {
  @scala.inline
  def apply(): JQueryFileInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFileInputOptions]
  }
  @scala.inline
  implicit class JQueryFileInputOptionsOps[Self <: JQueryFileInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd(value: (/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAlways(value: (/* e */ JQueryEventObject, /* data */ JQueryFileInputOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.undefined)
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
    def withBitrateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkalways(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkalways")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChunkalways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkalways")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkdone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkdone")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChunkdone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkdone")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkfail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkfail")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChunkfail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkfail")(js.undefined)
        ret
    }
    @scala.inline
    def withChunksend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChunksend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksend")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withDragover(value: /* e */ JQueryEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withDropZoneElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropZone(value: Element | js.Array[Element] | JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZone")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withFileInputElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileInput(value: Element | js.Array[Element] | JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Any): Self = {
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
    def withForceIframeTransport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIframeTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIframeTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIframeTransport")(js.undefined)
        ret
    }
    @scala.inline
    def withFormData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitConcurrentUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitConcurrentUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitConcurrentUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitConcurrentUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitMultiFileUploadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMultiFileUploadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitMultiFileUploadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMultiFileUploadSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitMultiFileUploadSizeOverhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMultiFileUploadSizeOverhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitMultiFileUploadSizeOverhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMultiFileUploadSizeOverhead")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitMultiFileUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMultiFileUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitMultiFileUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMultiFileUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChunkSize")(js.undefined)
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
    def withMessages(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withParamName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramName")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteZoneElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasteZone(value: Element | js.Array[Element] | JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteZone")(js.undefined)
        ret
    }
    @scala.inline
    def withPostMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressall(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressall")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProgressall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressall")(js.undefined)
        ret
    }
    @scala.inline
    def withRecalculateProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculateProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecalculateProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculateProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectParamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectParamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectParamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectParamName")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceFileInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceFileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceFileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
    @scala.inline
    def withSequentialUploads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequentialUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequentialUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequentialUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleFileUploads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleFileUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleFileUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleFileUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* e */ JQueryEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: /* e */ JQueryEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrFields(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrFields")(js.undefined)
        ret
    }
  }
  
}

