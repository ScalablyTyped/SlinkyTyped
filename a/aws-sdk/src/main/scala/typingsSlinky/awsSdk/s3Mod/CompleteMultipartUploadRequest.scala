package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMultipartUploadRequest extends js.Object {
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: BucketName = js.native
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  /**
    * The container for the multipart upload request information.
    */
  var MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.native
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * ID for the initiated multipart upload.
    */
  var UploadId: MultipartUploadId = js.native
}

object CompleteMultipartUploadRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, UploadId: MultipartUploadId): CompleteMultipartUploadRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadRequest]
  }
  @scala.inline
  implicit class CompleteMultipartUploadRequestOps[Self <: CompleteMultipartUploadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: ObjectKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadId(value: MultipartUploadId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultipartUpload(value: CompletedMultipartUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultipartUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipartUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultipartUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayer(value: RequestPayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestPayer")(js.undefined)
        ret
    }
  }
  
}

