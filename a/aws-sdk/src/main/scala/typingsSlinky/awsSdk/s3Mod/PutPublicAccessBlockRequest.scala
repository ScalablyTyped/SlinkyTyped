package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPublicAccessBlockRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to set.
    */
  var Bucket: BucketName = js.native
  /**
    * The MD5 hash of the PutPublicAccessBlock request body. 
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" in the Amazon Simple Storage Service Developer Guide.
    */
  var PublicAccessBlockConfiguration: typingsSlinky.awsSdk.s3Mod.PublicAccessBlockConfiguration = js.native
}

object PutPublicAccessBlockRequest {
  @scala.inline
  def apply(Bucket: BucketName, PublicAccessBlockConfiguration: PublicAccessBlockConfiguration): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], PublicAccessBlockConfiguration = PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
  @scala.inline
  implicit class PutPublicAccessBlockRequestOps[Self <: PutPublicAccessBlockRequest] (val x: Self) extends AnyVal {
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
    def withPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicAccessBlockConfiguration")(value.asInstanceOf[js.Any])
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

