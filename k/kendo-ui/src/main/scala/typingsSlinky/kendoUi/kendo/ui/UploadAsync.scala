package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadAsync extends js.Object {
  var autoRetryAfter: js.UndefOr[Double] = js.native
  var autoUpload: js.UndefOr[Boolean] = js.native
  var batch: js.UndefOr[Boolean] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var concurrent: js.UndefOr[Boolean] = js.native
  var maxAutoRetries: js.UndefOr[Double] = js.native
  var removeField: js.UndefOr[String] = js.native
  var removeUrl: js.UndefOr[String] = js.native
  var removeVerb: js.UndefOr[String] = js.native
  var saveField: js.UndefOr[String] = js.native
  var saveUrl: js.UndefOr[String] = js.native
  var useArrayBuffer: js.UndefOr[Boolean] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object UploadAsync {
  @scala.inline
  def apply(): UploadAsync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAsync]
  }
  @scala.inline
  implicit class UploadAsyncOps[Self <: UploadAsync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRetryAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetryAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRetryAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetryAfter")(js.undefined)
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
    def withBatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
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
    def withConcurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAutoRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAutoRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeField")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeVerb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeVerb")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveField")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUseArrayBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useArrayBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseArrayBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useArrayBuffer")(js.undefined)
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

