package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBucketMetricsConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket containing the metrics configuration to delete.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId = js.native
}
object DeleteBucketMetricsConfigurationRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId): DeleteBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketMetricsConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteBucketMetricsConfigurationRequestMutableBuilder[Self <: DeleteBucketMetricsConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setId(value: MetricsId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
