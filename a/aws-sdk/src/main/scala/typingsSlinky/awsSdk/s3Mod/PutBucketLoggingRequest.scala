package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLoggingRequest extends js.Object {
  /**
    * The name of the bucket for which to set the logging parameters.
    */
  var Bucket: BucketName = js.native
  /**
    * Container for logging status information.
    */
  var BucketLoggingStatus: typingsSlinky.awsSdk.s3Mod.BucketLoggingStatus = js.native
  /**
    * The MD5 hash of the PutBucketLogging request body.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
}

object PutBucketLoggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, BucketLoggingStatus: BucketLoggingStatus): PutBucketLoggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingRequest]
  }
  @scala.inline
  implicit class PutBucketLoggingRequestOps[Self <: PutBucketLoggingRequest] (val x: Self) extends AnyVal {
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
    def withBucketLoggingStatus(value: BucketLoggingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketLoggingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentMD5(value: ContentMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(js.undefined)
        ret
    }
  }
  
}

