package typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsS3Data extends StObject {
  
  /**
    * Required. Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For
    * information on our data retention policy for user credentials, see [User credentials](data-retention#user-credentials).
    */
  var awsAccessKey: js.UndefOr[AwsAccessKey] = js.native
  
  /** Required. S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)). */
  var bucketName: js.UndefOr[String] = js.native
}
object AwsS3Data {
  
  @scala.inline
  def apply(): AwsS3Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3Data]
  }
  
  @scala.inline
  implicit class AwsS3DataMutableBuilder[Self <: AwsS3Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccessKey(value: AwsAccessKey): Self = StObject.set(x, "awsAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccessKeyUndefined: Self = StObject.set(x, "awsAccessKey", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
  }
}
