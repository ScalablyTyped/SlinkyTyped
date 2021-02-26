package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundTruthManifest extends StObject {
  
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.S3Object] = js.native
}
object GroundTruthManifest {
  
  @scala.inline
  def apply(): GroundTruthManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundTruthManifest]
  }
  
  @scala.inline
  implicit class GroundTruthManifestMutableBuilder[Self <: GroundTruthManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
