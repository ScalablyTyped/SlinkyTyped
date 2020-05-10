package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsResult extends js.Object {
  var PartNumberMarker: Double = js.native
  var bucket: String = js.native
  var isTruncated: Boolean = js.native
  var maxParts: Double = js.native
  var name: String = js.native
  var nextPartNumberMarker: Double = js.native
  var parts: js.Array[ObjectPart] = js.native
  var res: NormalSuccessResponse = js.native
  var uploadId: String = js.native
}

object ListPartsResult {
  @scala.inline
  def apply(
    PartNumberMarker: Double,
    bucket: String,
    isTruncated: Boolean,
    maxParts: Double,
    name: String,
    nextPartNumberMarker: Double,
    parts: js.Array[ObjectPart],
    res: NormalSuccessResponse,
    uploadId: String
  ): ListPartsResult = {
    val __obj = js.Dynamic.literal(PartNumberMarker = PartNumberMarker.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], maxParts = maxParts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextPartNumberMarker = nextPartNumberMarker.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsResult]
  }
  @scala.inline
  implicit class ListPartsResultOps[Self <: ListPartsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartNumberMarker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartNumberMarker")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withMaxParts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPartNumberMarker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPartNumberMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParts(value: js.Array[ObjectPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

