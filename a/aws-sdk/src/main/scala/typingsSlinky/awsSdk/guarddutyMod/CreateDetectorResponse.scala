package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorResponse extends StObject {
  
  /**
    * The unique ID of the created detector.
    */
  var DetectorId: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DetectorId] = js.native
}
object CreateDetectorResponse {
  
  @scala.inline
  def apply(): CreateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorResponse]
  }
  
  @scala.inline
  implicit class CreateDetectorResponseMutableBuilder[Self <: CreateDetectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorIdUndefined: Self = StObject.set(x, "DetectorId", js.undefined)
  }
}
