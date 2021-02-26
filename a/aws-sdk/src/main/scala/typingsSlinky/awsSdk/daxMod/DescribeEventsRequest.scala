package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventsRequest extends StObject {
  
  /**
    * The number of minutes' worth of events to retrieve.
    */
  var Duration: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the event source for which events will be returned. If not specified, then all sources are included in the response.
    */
  var SourceName: js.UndefOr[String] = js.native
  
  /**
    * The event source to retrieve events for. If no value is specified, all events are returned.
    */
  var SourceType: js.UndefOr[typingsSlinky.awsSdk.daxMod.SourceType] = js.native
  
  /**
    * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}
object DescribeEventsRequest {
  
  @scala.inline
  def apply(): DescribeEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsRequest]
  }
  
  @scala.inline
  implicit class DescribeEventsRequestMutableBuilder[Self <: DescribeEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: IntegerOptional): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
