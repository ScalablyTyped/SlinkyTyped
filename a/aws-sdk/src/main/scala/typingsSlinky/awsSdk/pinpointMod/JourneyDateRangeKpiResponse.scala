package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneyDateRangeKpiResponse extends StObject {
  
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: string = js.native
  
  /**
    * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var EndTime: js.Date = js.native
  
  /**
    * The unique identifier for the journey that the metric applies to.
    */
  var JourneyId: string = js.native
  
  /**
    * The name of the metric, also referred to as a key performance indicator (KPI), that the data was retrieved for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see the Amazon Pinpoint Developer Guide.
    */
  var KpiName: string = js.native
  
  /**
    * An array of objects that contains the results of the query. Each object contains the value for the metric and metadata about that value.
    */
  var KpiResult: BaseKpiResult = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null for the Journey Engagement Metrics resource because the resource returns all results in a single page.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var StartTime: js.Date = js.native
}
object JourneyDateRangeKpiResponse {
  
  @scala.inline
  def apply(
    ApplicationId: string,
    EndTime: js.Date,
    JourneyId: string,
    KpiName: string,
    KpiResult: BaseKpiResult,
    StartTime: js.Date
  ): JourneyDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], KpiName = KpiName.asInstanceOf[js.Any], KpiResult = KpiResult.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyDateRangeKpiResponse]
  }
  
  @scala.inline
  implicit class JourneyDateRangeKpiResponseMutableBuilder[Self <: JourneyDateRangeKpiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKpiName(value: string): Self = StObject.set(x, "KpiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKpiResult(value: BaseKpiResult): Self = StObject.set(x, "KpiResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
