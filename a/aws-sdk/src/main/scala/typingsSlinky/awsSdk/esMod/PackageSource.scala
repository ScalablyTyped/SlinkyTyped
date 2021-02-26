package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageSource extends StObject {
  
  /**
    * Name of the bucket containing the package.
    */
  var S3BucketName: js.UndefOr[typingsSlinky.awsSdk.esMod.S3BucketName] = js.native
  
  /**
    * Key (file name) of the package.
    */
  var S3Key: js.UndefOr[typingsSlinky.awsSdk.esMod.S3Key] = js.native
}
object PackageSource {
  
  @scala.inline
  def apply(): PackageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageSource]
  }
  
  @scala.inline
  implicit class PackageSourceMutableBuilder[Self <: PackageSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
