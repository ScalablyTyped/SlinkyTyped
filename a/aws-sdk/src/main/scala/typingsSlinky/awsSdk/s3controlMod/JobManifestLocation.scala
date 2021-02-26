package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobManifestLocation extends StObject {
  
  /**
    * The ETag for the specified manifest object.
    */
  var ETag: NonEmptyMaxLength1024String = js.native
  
  /**
    * The Amazon Resource Name (ARN) for a manifest object.
    */
  var ObjectArn: S3KeyArnString = js.native
  
  /**
    * The optional version ID to identify a specific version of the manifest object.
    */
  var ObjectVersionId: js.UndefOr[S3ObjectVersionId] = js.native
}
object JobManifestLocation {
  
  @scala.inline
  def apply(ETag: NonEmptyMaxLength1024String, ObjectArn: S3KeyArnString): JobManifestLocation = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], ObjectArn = ObjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestLocation]
  }
  
  @scala.inline
  implicit class JobManifestLocationMutableBuilder[Self <: JobManifestLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectArn(value: S3KeyArnString): Self = StObject.set(x, "ObjectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionId(value: S3ObjectVersionId): Self = StObject.set(x, "ObjectVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionIdUndefined: Self = StObject.set(x, "ObjectVersionId", js.undefined)
  }
}
