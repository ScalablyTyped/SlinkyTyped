package typingsSlinky.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Destination extends StObject {
  
  /**
    * The name of an S3 bucket within which harvested content will be exported
    */
  var BucketName: string = js.native
  
  /**
    * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
    */
  var ManifestKey: string = js.native
  
  /**
    * The IAM role used to write to the specified S3 bucket
    */
  var RoleArn: string = js.native
}
object S3Destination {
  
  @scala.inline
  def apply(BucketName: string, ManifestKey: string, RoleArn: string): S3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ManifestKey = ManifestKey.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
  
  @scala.inline
  implicit class S3DestinationMutableBuilder[Self <: S3Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: string): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestKey(value: string): Self = StObject.set(x, "ManifestKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
