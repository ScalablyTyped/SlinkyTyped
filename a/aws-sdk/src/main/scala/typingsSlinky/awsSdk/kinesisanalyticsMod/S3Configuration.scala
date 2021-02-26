package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Configuration extends StObject {
  
  /**
    * ARN of the S3 bucket that contains the data.
    */
  var BucketARN: typingsSlinky.awsSdk.kinesisanalyticsMod.BucketARN = js.native
  
  /**
    * The name of the object that contains the data.
    */
  var FileKey: typingsSlinky.awsSdk.kinesisanalyticsMod.FileKey = js.native
  
  /**
    * IAM ARN of the role used to access the data.
    */
  var RoleARN: typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}
object S3Configuration {
  
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, RoleARN: RoleARN): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Configuration]
  }
  
  @scala.inline
  implicit class S3ConfigurationMutableBuilder[Self <: S3Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
