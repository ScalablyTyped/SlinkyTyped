package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightImpactGraphRequest extends StObject {
  
  /**
    * The estimated end time of the insight, in Unix time seconds. The EndTime is exclusive of the value provided. The time range between the start time and end time can't be more than six hours. 
    */
  var EndTime: js.Date = js.native
  
  /**
    * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
    */
  var InsightId: typingsSlinky.awsSdk.xrayMod.InsightId = js.native
  
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of results. 
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The estimated start time of the insight, in Unix time seconds. The StartTime is inclusive of the value provided and can't be more than 30 days old.
    */
  var StartTime: js.Date = js.native
}
object GetInsightImpactGraphRequest {
  
  @scala.inline
  def apply(EndTime: js.Date, InsightId: InsightId, StartTime: js.Date): GetInsightImpactGraphRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], InsightId = InsightId.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightImpactGraphRequest]
  }
  
  @scala.inline
  implicit class GetInsightImpactGraphRequestMutableBuilder[Self <: GetInsightImpactGraphRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
