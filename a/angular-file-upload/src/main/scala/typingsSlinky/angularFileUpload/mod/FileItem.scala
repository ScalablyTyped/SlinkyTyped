package typingsSlinky.angularFileUpload.mod

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.raw.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileItem extends js.Object {
  /**
    * Name of the field which will contain the file, default is file
    */
  var alias: String = js.native
  // **Properties**
  var file: FileLikeObject = js.native
  /**
    * Data to be sent along with this file
    */
  var formData: js.Array[FormData] = js.native
  /**
    * Headers to be sent along with this file. HTML5 browsers only.
    */
  var headers: Headers = js.native
  /**
    * A sequence number upload. Read only.
    */
  var index: Double = js.native
  /**
    * true if uploading was canceled. Read only.
    */
  var isCancel: Boolean = js.native
  /**
    * true if occurred error while file uploading. Read only.
    */
  var isError: Boolean = js.native
  /**
    * File is ready to upload. Read only.
    */
  var isReady: Boolean = js.native
  /**
    * true if the file was uploaded successfully. Read only.
    */
  var isSuccess: Boolean = js.native
  /**
    * true if the file was uploaded. Read only.
    */
  var isUploaded: Boolean = js.native
  /**
    * true if the file is being uploaded. Read only.
    */
  var isUploading: Boolean = js.native
  /**
    * It's a request method. By default POST. HTML5 browsers only.
    */
  var method: String = js.native
  /**
    * File upload progress percentage. Read only.
    */
  var progress: Double = js.native
  /**
    * Remove this file from the queue after uploading
    */
  var removeAfterUpload: Boolean = js.native
  /**
    * Reference to the parent Uploader object for this file. Read only.
    */
  var uploader: FileUploader = js.native
  /**
    * Path on the server in which this file will be uploaded
    */
  var url: String = js.native
  /**
    * enable CORS. HTML5 browsers only.
    */
  var withCredentials: Boolean = js.native
  // **Methods**
  /**
    * Cancels uploading of this file
    */
  def cancel(): Unit = js.native
  // **Callbacks**
  /**
    *  Fires before uploading an item.
    */
  def onBeforeUpload(): Unit = js.native
  /**
    * On cancel uploading
    */
  def onCancel(response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * On file upload complete (independently of the sucess of the operation)
    */
  def onComplete(response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * On upload error
    */
  def onError(response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * On file upload progress.
    */
  def onProgress(progress: Double): Unit = js.native
  /**
    * On file successfully uploaded
    */
  def onSuccess(response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * Remove this file from the queue
    */
  def remove(): Unit = js.native
  /**
    * Upload this file
    */
  def upload(): Unit = js.native
}

object FileItem {
  @scala.inline
  def apply(
    alias: String,
    cancel: () => Unit,
    file: FileLikeObject,
    formData: js.Array[FormData],
    headers: Headers,
    index: Double,
    isCancel: Boolean,
    isError: Boolean,
    isReady: Boolean,
    isSuccess: Boolean,
    isUploaded: Boolean,
    isUploading: Boolean,
    method: String,
    onBeforeUpload: () => Unit,
    onCancel: (Response, Double, Headers) => Unit,
    onComplete: (Response, Double, Headers) => Unit,
    onError: (Response, Double, Headers) => Unit,
    onProgress: Double => Unit,
    onSuccess: (Response, Double, Headers) => Unit,
    progress: Double,
    remove: () => Unit,
    removeAfterUpload: Boolean,
    upload: () => Unit,
    uploader: FileUploader,
    url: String,
    withCredentials: Boolean
  ): FileItem = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), file = file.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isCancel = isCancel.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any], isUploaded = isUploaded.asInstanceOf[js.Any], isUploading = isUploading.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onBeforeUpload = js.Any.fromFunction0(onBeforeUpload), onCancel = js.Any.fromFunction3(onCancel), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onProgress = js.Any.fromFunction1(onProgress), onSuccess = js.Any.fromFunction3(onSuccess), progress = progress.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removeAfterUpload = removeAfterUpload.asInstanceOf[js.Any], upload = js.Any.fromFunction0(upload), uploader = uploader.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileItem]
  }
  @scala.inline
  implicit class FileItemOps[Self <: FileItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFile(value: FileLikeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormData(value: js.Array[FormData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUploaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUploading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUploading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBeforeUpload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCancel(value: (Response, Double, Headers) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnComplete(value: (Response, Double, Headers) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnError(value: (Response, Double, Headers) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnProgress(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSuccess(value: (Response, Double, Headers) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAfterUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAfterUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUploader(value: FileUploader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

