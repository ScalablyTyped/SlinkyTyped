package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketRequestPaymentRequest extends StObject {
  
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  
  /**
    * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864. For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * Container for Payer.
    */
  var RequestPaymentConfiguration: typingsSlinky.awsSdk.s3Mod.RequestPaymentConfiguration = js.native
}
object PutBucketRequestPaymentRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, RequestPaymentConfiguration: RequestPaymentConfiguration): PutBucketRequestPaymentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketRequestPaymentRequest]
  }
  
  @scala.inline
  implicit class PutBucketRequestPaymentRequestMutableBuilder[Self <: PutBucketRequestPaymentRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestPaymentConfiguration(value: RequestPaymentConfiguration): Self = StObject.set(x, "RequestPaymentConfiguration", value.asInstanceOf[js.Any])
  }
}
