package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketLifecycleRequest extends StObject {
  
  /**
    * 
    */
  var Bucket: BucketName = js.native
  
  /**
    *  For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * 
    */
  var LifecycleConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.LifecycleConfiguration] = js.native
}
object PutBucketLifecycleRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): PutBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleRequest]
  }
  
  @scala.inline
  implicit class PutBucketLifecycleRequestMutableBuilder[Self <: PutBucketLifecycleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setLifecycleConfiguration(value: LifecycleConfiguration): Self = StObject.set(x, "LifecycleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfigurationUndefined: Self = StObject.set(x, "LifecycleConfiguration", js.undefined)
  }
}
