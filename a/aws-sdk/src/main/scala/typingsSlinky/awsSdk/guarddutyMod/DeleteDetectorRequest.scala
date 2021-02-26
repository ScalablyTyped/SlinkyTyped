package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDetectorRequest extends StObject {
  
  /**
    * The unique ID of the detector that you want to delete.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
}
object DeleteDetectorRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): DeleteDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorRequest]
  }
  
  @scala.inline
  implicit class DeleteDetectorRequestMutableBuilder[Self <: DeleteDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
