package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceConfigHistoryRequest extends StObject {
  
  /**
    * The chronological order for configuration items listed. By default, the results are listed in reverse chronological order.
    */
  var chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.native
  
  /**
    * The time stamp that indicates an earlier time. If not specified, the action returns paginated results that contain configuration items that start when the first configuration item was recorded.
    */
  var earlierTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The time stamp that indicates a later time. If not specified, current time is taken.
    */
  var laterTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The maximum number of configuration items returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: ResourceId = js.native
  
  /**
    * The resource type.
    */
  var resourceType: ResourceType = js.native
}
object GetResourceConfigHistoryRequest {
  
  @scala.inline
  def apply(resourceId: ResourceId, resourceType: ResourceType): GetResourceConfigHistoryRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceConfigHistoryRequest]
  }
  
  @scala.inline
  implicit class GetResourceConfigHistoryRequestMutableBuilder[Self <: GetResourceConfigHistoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChronologicalOrder(value: ChronologicalOrder): Self = StObject.set(x, "chronologicalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChronologicalOrderUndefined: Self = StObject.set(x, "chronologicalOrder", js.undefined)
    
    @scala.inline
    def setEarlierTime(value: js.Date): Self = StObject.set(x, "earlierTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlierTimeUndefined: Self = StObject.set(x, "earlierTime", js.undefined)
    
    @scala.inline
    def setLaterTime(value: js.Date): Self = StObject.set(x, "laterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaterTimeUndefined: Self = StObject.set(x, "laterTime", js.undefined)
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
