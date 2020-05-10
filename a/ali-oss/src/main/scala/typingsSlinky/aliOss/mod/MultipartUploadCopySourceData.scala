package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartUploadCopySourceData extends js.Object {
   // data copy start byte offset, e.g: 0
  var endOffset: Double = js.native
   // the source object name
  var sourceBucketName: String = js.native
  var sourceKey: String = js.native
   // sourceData.  the source bucket name
  var startOffset: Double = js.native
}

object MultipartUploadCopySourceData {
  @scala.inline
  def apply(endOffset: Double, sourceBucketName: String, sourceKey: String, startOffset: Double): MultipartUploadCopySourceData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadCopySourceData]
  }
  @scala.inline
  implicit class MultipartUploadCopySourceDataOps[Self <: MultipartUploadCopySourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

