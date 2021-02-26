package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePublishingDestinationRequest extends StObject {
  
  /**
    * The ID of the publishing destination to update.
    */
  var DestinationId: String = js.native
  
  /**
    * A DestinationProperties object that includes the DestinationArn and KmsKeyArn of the publishing destination.
    */
  var DestinationProperties: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DestinationProperties] = js.native
  
  /**
    * The ID of the detector associated with the publishing destinations to update.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
}
object UpdatePublishingDestinationRequest {
  
  @scala.inline
  def apply(DestinationId: String, DetectorId: DetectorId): UpdatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublishingDestinationRequest]
  }
  
  @scala.inline
  implicit class UpdatePublishingDestinationRequestMutableBuilder[Self <: UpdatePublishingDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationProperties(value: DestinationProperties): Self = StObject.set(x, "DestinationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPropertiesUndefined: Self = StObject.set(x, "DestinationProperties", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
