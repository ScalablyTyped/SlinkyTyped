package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateMultipartUploadOutput extends js.Object {
  /**
    * The relative URI path of the multipart upload ID Amazon S3 Glacier created.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The ID of the multipart upload. This value is also included as part of the location.
    */
  var uploadId: js.UndefOr[String] = js.native
}

object InitiateMultipartUploadOutput {
  @scala.inline
  def apply(): InitiateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateMultipartUploadOutput]
  }
  @scala.inline
  implicit class InitiateMultipartUploadOutputOps[Self <: InitiateMultipartUploadOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
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
  }
  
}

