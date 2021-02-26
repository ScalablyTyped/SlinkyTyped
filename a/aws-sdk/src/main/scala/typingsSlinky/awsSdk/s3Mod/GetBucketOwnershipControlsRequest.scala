package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketOwnershipControlsRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket whose OwnershipControls you want to retrieve. 
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
}
object GetBucketOwnershipControlsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): GetBucketOwnershipControlsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketOwnershipControlsRequest]
  }
  
  @scala.inline
  implicit class GetBucketOwnershipControlsRequestMutableBuilder[Self <: GetBucketOwnershipControlsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
  }
}
