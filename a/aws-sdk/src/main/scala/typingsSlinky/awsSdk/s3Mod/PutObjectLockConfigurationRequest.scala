package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutObjectLockConfigurationRequest extends StObject {
  
  /**
    * The bucket whose Object Lock configuration you want to create or replace.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The MD5 hash for the request body. For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The Object Lock configuration that you want to apply to the specified bucket.
    */
  var ObjectLockConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ObjectLockConfiguration] = js.native
  
  var RequestPayer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestPayer] = js.native
  
  /**
    * A token to allow Object Lock to be enabled for an existing bucket.
    */
  var Token: js.UndefOr[ObjectLockToken] = js.native
}
object PutObjectLockConfigurationRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): PutObjectLockConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLockConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutObjectLockConfigurationRequestMutableBuilder[Self <: PutObjectLockConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setObjectLockConfiguration(value: ObjectLockConfiguration): Self = StObject.set(x, "ObjectLockConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockConfigurationUndefined: Self = StObject.set(x, "ObjectLockConfiguration", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    @scala.inline
    def setToken(value: ObjectLockToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
