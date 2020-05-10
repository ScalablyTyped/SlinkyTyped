package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUploadsResult extends js.Object {
  var bucket: String = js.native
  var isTruncated: Boolean = js.native
  var nextKeyMarker: js.Any = js.native
  var nextUploadIdMarker: js.Any = js.native
  var res: NormalSuccessResponse = js.native
  var uploads: js.Array[Upload] = js.native
}

object ListUploadsResult {
  @scala.inline
  def apply(
    bucket: String,
    isTruncated: Boolean,
    nextKeyMarker: js.Any,
    nextUploadIdMarker: js.Any,
    res: NormalSuccessResponse,
    uploads: js.Array[Upload]
  ): ListUploadsResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], nextKeyMarker = nextKeyMarker.asInstanceOf[js.Any], nextUploadIdMarker = nextUploadIdMarker.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUploadsResult]
  }
  @scala.inline
  implicit class ListUploadsResultOps[Self <: ListUploadsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextKeyMarker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextKeyMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextUploadIdMarker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextUploadIdMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploads(value: js.Array[Upload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

