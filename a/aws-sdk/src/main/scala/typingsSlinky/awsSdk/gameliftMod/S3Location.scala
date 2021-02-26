package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Location extends StObject {
  
  /**
    * An S3 bucket identifier. This is the name of the S3 bucket.  GameLift currently does not support uploading from S3 buckets with names that contain a dot (.). 
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the zip file that contains the build files or script files. 
    */
  var Key: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this information when retrieving files from an S3 bucket that you own. Use this parameter to specify a specific version of the file. If not set, the latest version of the file is retrieved. 
    */
  var ObjectVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access the S3 bucket.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.native
}
object S3Location {
  
  @scala.inline
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit class S3LocationMutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: NonEmptyString): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setKey(value: NonEmptyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: NonEmptyString): Self = StObject.set(x, "ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "ObjectVersion", js.undefined)
    
    @scala.inline
    def setRoleArn(value: NonEmptyString): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
