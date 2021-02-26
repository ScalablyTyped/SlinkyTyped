package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsStatisticsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * Represents the criteria that is used for querying findings.
    */
  var FindingCriteria: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingCriteria] = js.native
  
  /**
    * The types of finding statistics to retrieve.
    */
  var FindingStatisticTypes: typingsSlinky.awsSdk.guarddutyMod.FindingStatisticTypes = js.native
}
object GetFindingsStatisticsRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FindingStatisticTypes: FindingStatisticTypes): GetFindingsStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingStatisticTypes = FindingStatisticTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsRequest]
  }
  
  @scala.inline
  implicit class GetFindingsStatisticsRequestMutableBuilder[Self <: GetFindingsStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "FindingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteriaUndefined: Self = StObject.set(x, "FindingCriteria", js.undefined)
    
    @scala.inline
    def setFindingStatisticTypes(value: FindingStatisticTypes): Self = StObject.set(x, "FindingStatisticTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingStatisticTypesVarargs(value: FindingStatisticType*): Self = StObject.set(x, "FindingStatisticTypes", js.Array(value :_*))
  }
}
