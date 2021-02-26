package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsStatisticsResponse extends StObject {
  
  /**
    * The finding statistics object.
    */
  var FindingStatistics: typingsSlinky.awsSdk.guarddutyMod.FindingStatistics = js.native
}
object GetFindingsStatisticsResponse {
  
  @scala.inline
  def apply(FindingStatistics: FindingStatistics): GetFindingsStatisticsResponse = {
    val __obj = js.Dynamic.literal(FindingStatistics = FindingStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetFindingsStatisticsResponseMutableBuilder[Self <: GetFindingsStatisticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingStatistics(value: FindingStatistics): Self = StObject.set(x, "FindingStatistics", value.asInstanceOf[js.Any])
  }
}
