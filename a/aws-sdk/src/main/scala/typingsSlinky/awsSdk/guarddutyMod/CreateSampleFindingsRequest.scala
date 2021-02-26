package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSampleFindingsRequest extends StObject {
  
  /**
    * The ID of the detector to create sample findings for.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The types of sample findings to generate.
    */
  var FindingTypes: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingTypes] = js.native
}
object CreateSampleFindingsRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
  
  @scala.inline
  implicit class CreateSampleFindingsRequestMutableBuilder[Self <: CreateSampleFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingTypes(value: FindingTypes): Self = StObject.set(x, "FindingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingTypesUndefined: Self = StObject.set(x, "FindingTypes", js.undefined)
    
    @scala.inline
    def setFindingTypesVarargs(value: FindingType*): Self = StObject.set(x, "FindingTypes", js.Array(value :_*))
  }
}
