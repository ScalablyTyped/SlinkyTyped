package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3OutputLocation extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  
  /**
    * The S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
}
object S3OutputLocation {
  
  @scala.inline
  def apply(): S3OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputLocation]
  }
  
  @scala.inline
  implicit class S3OutputLocationMutableBuilder[Self <: S3OutputLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputS3BucketName(value: S3BucketName): Self = StObject.set(x, "OutputS3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3BucketNameUndefined: Self = StObject.set(x, "OutputS3BucketName", js.undefined)
    
    @scala.inline
    def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "OutputS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setOutputS3Region(value: S3Region): Self = StObject.set(x, "OutputS3Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3RegionUndefined: Self = StObject.set(x, "OutputS3Region", js.undefined)
  }
}
