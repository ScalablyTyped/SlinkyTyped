package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The MD5 hash of the request body. For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmRemoveSelfBucketAccess(value: ConfirmRemoveSelfBucketAccess): Self = this.set("ConfirmRemoveSelfBucketAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmRemoveSelfBucketAccess: Self = this.set("ConfirmRemoveSelfBucketAccess", js.undefined)
    
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = this.set("ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedBucketOwner: Self = this.set("ExpectedBucketOwner", js.undefined)
  }
}
