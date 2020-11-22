package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketOwnershipControlsRequest extends js.Object {
  
  /**
    * The name of the Amazon S3 bucket whose OwnershipControls you want to set.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The MD5 hash of the OwnershipControls request body.  For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The OwnershipControls (BucketOwnerPreferred or ObjectWriter) that you want to apply to this Amazon S3 bucket.
    */
  var OwnershipControls: typingsSlinky.awsSdk.s3Mod.OwnershipControls = js.native
}
object PutBucketOwnershipControlsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, OwnershipControls: OwnershipControls): PutBucketOwnershipControlsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], OwnershipControls = OwnershipControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketOwnershipControlsRequest]
  }
  
  @scala.inline
  implicit class PutBucketOwnershipControlsRequestOps[Self <: PutBucketOwnershipControlsRequest] (val x: Self) extends AnyVal {
    
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
    def setOwnershipControls(value: OwnershipControls): Self = this.set("OwnershipControls", value.asInstanceOf[js.Any])
    
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
