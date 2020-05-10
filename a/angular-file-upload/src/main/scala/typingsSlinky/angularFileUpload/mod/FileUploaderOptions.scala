package typingsSlinky.angularFileUpload.mod

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.raw.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploaderOptions extends js.Object {
  /**
    * Name of the field which will contain the file, default is file
    * @default file
    */
  var alias: String = js.native
  /**
    * Automatically upload files after adding them to the queue
    * @default false
    */
  var autoUpload: Boolean = js.native
  /**
    * Disable multipart.
    * @default false
    */
  var disableMultipart: Boolean = js.native
  /**
    * Filters to be applied to the files before adding them to the queue. If the filter returns true the file will be added to the queue
    * @default [folderFilter, queueLimitFilter]
    */
  var filters: js.Array[Filter] = js.native
  /**
    * Data to be sent along with the files
    * @default []
    */
  var formData: js.Array[FormData] = js.native
  /**
    * Headers to be sent along with the files. HTML5 browsers only.
    * @default {}
    */
  var headers: Headers = js.native
  /**
    * It's a request method. HTML5 browsers only.
    * @default POST
    */
  var method: String = js.native
  /**
    * Items to be uploaded
    * @default []
    */
  var queue: js.Array[FileItem] = js.native
  /**
    * Maximum count of files.
    * @default Number.MAX_VALUE
    */
  var queueLimit: Double = js.native
  /**
    * Remove files from the queue after uploading
    * @default false
    */
  var removeAfterUpload: Boolean = js.native
  /**
    * Path on the server to upload files
    * @default /
    */
  var url: String = js.native
  /**
    * enable CORS. HTML5 browsers only.
    * @default false
    */
  var withCredentials: Boolean = js.native
}

object FileUploaderOptions {
  @scala.inline
  def apply(
    alias: String,
    autoUpload: Boolean,
    disableMultipart: Boolean,
    filters: js.Array[Filter],
    formData: js.Array[FormData],
    headers: Headers,
    method: String,
    queue: js.Array[FileItem],
    queueLimit: Double,
    removeAfterUpload: Boolean,
    url: String,
    withCredentials: Boolean
  ): FileUploaderOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], autoUpload = autoUpload.asInstanceOf[js.Any], disableMultipart = disableMultipart.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueLimit = queueLimit.asInstanceOf[js.Any], removeAfterUpload = removeAfterUpload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploaderOptions]
  }
  @scala.inline
  implicit class FileUploaderOptionsOps[Self <: FileUploaderOptions] (val x: Self) extends AnyVal {
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
    def withAutoUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMultipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
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
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: js.Array[FileItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveAfterUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAfterUpload")(value.asInstanceOf[js.Any])
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

