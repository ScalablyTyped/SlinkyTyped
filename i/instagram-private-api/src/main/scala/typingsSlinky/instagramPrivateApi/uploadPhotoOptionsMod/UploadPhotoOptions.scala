package typingsSlinky.instagramPrivateApi.uploadPhotoOptionsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadPhotoOptions extends js.Object {
  var file: Buffer = js.native
  var isSidecar: js.UndefOr[Boolean] = js.native
  var uploadId: js.UndefOr[String] = js.native
  var waterfallId: js.UndefOr[String] = js.native
}

object UploadPhotoOptions {
  @scala.inline
  def apply(file: Buffer): UploadPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPhotoOptions]
  }
  @scala.inline
  implicit class UploadPhotoOptionsOps[Self <: UploadPhotoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSidecar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSidecar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSidecar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSidecar")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterfallId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterfallId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(js.undefined)
        ret
    }
  }
  
}

