package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketWebsiteRequest extends StObject {
  
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864. For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * Container for the request.
    */
  var WebsiteConfiguration: typingsSlinky.awsSdk.s3Mod.WebsiteConfiguration = js.native
}
object PutBucketWebsiteRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, WebsiteConfiguration: WebsiteConfiguration): PutBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteRequest]
  }
  
  @scala.inline
  implicit class PutBucketWebsiteRequestMutableBuilder[Self <: PutBucketWebsiteRequest] (val x: Self) extends AnyVal {
    
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
    def setWebsiteConfiguration(value: WebsiteConfiguration): Self = StObject.set(x, "WebsiteConfiguration", value.asInstanceOf[js.Any])
  }
}
