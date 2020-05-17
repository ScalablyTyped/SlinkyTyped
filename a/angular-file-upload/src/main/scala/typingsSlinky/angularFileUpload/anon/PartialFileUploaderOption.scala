package typingsSlinky.angularFileUpload.anon

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.raw.FormData
import typingsSlinky.angularFileUpload.mod.FileItem
import typingsSlinky.angularFileUpload.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<angular-file-upload.angular-file-upload.FileUploaderOptions> */
@js.native
trait PartialFileUploaderOption extends js.Object {
  var alias: js.UndefOr[String] = js.native
  var autoUpload: js.UndefOr[Boolean] = js.native
  var disableMultipart: js.UndefOr[Boolean] = js.native
  var filters: js.UndefOr[js.Array[Filter]] = js.native
  var formData: js.UndefOr[js.Array[FormData]] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var method: js.UndefOr[String] = js.native
  var queue: js.UndefOr[js.Array[FileItem]] = js.native
  var queueLimit: js.UndefOr[Double] = js.native
  var removeAfterUpload: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object PartialFileUploaderOption {
  @scala.inline
  def apply(): PartialFileUploaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFileUploaderOption]
  }
  @scala.inline
  implicit class PartialFileUploaderOptionOps[Self <: PartialFileUploaderOption] (val x: Self) extends AnyVal {
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
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
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
    def withDisableMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMultipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMultipart")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withFormData(value: js.Array[FormData]): Self = {
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
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: js.Array[FileItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAfterUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAfterUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAfterUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAfterUpload")(js.undefined)
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
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

