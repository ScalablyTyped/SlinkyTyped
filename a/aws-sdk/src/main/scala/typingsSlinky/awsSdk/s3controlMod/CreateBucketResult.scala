package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the bucket. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;. For example, to access the bucket reports through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports. The value must be URL encoded. 
    */
  var BucketArn: js.UndefOr[S3RegionalBucketArn] = js.native
  
  /**
    * The location of the bucket.
    */
  var Location: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.Location] = js.native
}
object CreateBucketResult {
  
  @scala.inline
  def apply(): CreateBucketResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketResult]
  }
  
  @scala.inline
  implicit class CreateBucketResultMutableBuilder[Self <: CreateBucketResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketArn(value: S3RegionalBucketArn): Self = StObject.set(x, "BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketArnUndefined: Self = StObject.set(x, "BucketArn", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
