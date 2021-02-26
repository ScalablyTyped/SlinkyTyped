package typingsSlinky.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Location extends StObject {
  
  /**
    * The Amazon S3 object key where the source code files provided with the project request are stored.
    */
  var bucketKey: js.UndefOr[BucketKey] = js.native
  
  /**
    * The Amazon S3 bucket name where the source code files provided with the project request are stored.
    */
  var bucketName: js.UndefOr[BucketName] = js.native
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
    def setBucketKey(value: BucketKey): Self = StObject.set(x, "bucketKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketKeyUndefined: Self = StObject.set(x, "bucketKey", js.undefined)
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
  }
}
