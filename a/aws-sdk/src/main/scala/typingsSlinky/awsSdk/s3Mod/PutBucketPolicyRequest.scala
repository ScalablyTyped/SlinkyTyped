package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketPolicyRequest extends js.Object {
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName = js.native
  /**
    * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.
    */
  var ConfirmRemoveSelfBucketAccess: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ConfirmRemoveSelfBucketAccess] = js.native
  /**
    * The MD5 hash of the request body.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: typingsSlinky.awsSdk.s3Mod.Policy = js.native
}

object PutBucketPolicyRequest {
  @scala.inline
  def apply(Bucket: BucketName, Policy: Policy): PutBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyRequest]
  }
  @scala.inline
  implicit class PutBucketPolicyRequestOps[Self <: PutBucketPolicyRequest] (val x: Self) extends AnyVal {
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
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmRemoveSelfBucketAccess(value: ConfirmRemoveSelfBucketAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfirmRemoveSelfBucketAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmRemoveSelfBucketAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfirmRemoveSelfBucketAccess")(js.undefined)
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

