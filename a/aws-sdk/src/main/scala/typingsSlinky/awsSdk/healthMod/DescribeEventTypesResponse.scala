package typingsSlinky.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventTypesResponse extends StObject {
  
  /**
    * A list of event types that match the filter criteria. Event types have a category (issue, accountNotification, or scheduledChange), a service (for example, EC2, RDS, DATAPIPELINE, BILLING), and a code (in the format AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT).
    */
  var eventTypes: js.UndefOr[EventTypeList_] = js.native
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typingsSlinky.awsSdk.healthMod.nextToken] = js.native
}
object DescribeEventTypesResponse {
  
  @scala.inline
  def apply(): DescribeEventTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTypesResponse]
  }
  
  @scala.inline
  implicit class DescribeEventTypesResponseMutableBuilder[Self <: DescribeEventTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTypes(value: EventTypeList_): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: EventType_ *): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
