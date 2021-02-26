package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketTaggingRequest extends StObject {
  
  /**
    * The AWS account ID of the Outposts bucket.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the bucket. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;. For example, to access the bucket reports through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports. The value must be URL encoded. 
    */
  var Bucket: BucketName = js.native
  
  /**
    * 
    */
  var Tagging: typingsSlinky.awsSdk.s3controlMod.Tagging = js.native
}
object PutBucketTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, Bucket: BucketName, Tagging: Tagging): PutBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketTaggingRequest]
  }
  
  @scala.inline
  implicit class PutBucketTaggingRequestMutableBuilder[Self <: PutBucketTaggingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagging(value: Tagging): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
  }
}
