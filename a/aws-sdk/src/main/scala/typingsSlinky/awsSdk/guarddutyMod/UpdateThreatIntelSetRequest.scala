package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThreatIntelSetRequest extends StObject {
  
  /**
    * The updated Boolean value that specifies whether the ThreateIntelSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.native
  
  /**
    * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The updated URI of the file that contains the ThreateIntelSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Location] = js.native
  
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Name] = js.native
  
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var ThreatIntelSetId: String = js.native
}
object UpdateThreatIntelSetRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, ThreatIntelSetId: String): UpdateThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThreatIntelSetRequest]
  }
  
  @scala.inline
  implicit class UpdateThreatIntelSetRequestMutableBuilder[Self <: UpdateThreatIntelSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean): Self = StObject.set(x, "Activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "Activate", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setThreatIntelSetId(value: String): Self = StObject.set(x, "ThreatIntelSetId", value.asInstanceOf[js.Any])
  }
}
