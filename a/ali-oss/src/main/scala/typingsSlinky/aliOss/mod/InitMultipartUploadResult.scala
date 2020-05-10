package typingsSlinky.aliOss.mod

import typingsSlinky.aliOss.AnonHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitMultipartUploadResult extends js.Object {
  var bucket: String = js.native
   // bucket name
  var name: String = js.native
  var res: AnonHeaders = js.native
   // object name store on OSS
  var uploadId: String = js.native
}

object InitMultipartUploadResult {
  @scala.inline
  def apply(bucket: String, name: String, res: AnonHeaders, uploadId: String): InitMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitMultipartUploadResult]
  }
  @scala.inline
  implicit class InitMultipartUploadResultOps[Self <: InitMultipartUploadResult] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: AnonHeaders): Self = {
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

