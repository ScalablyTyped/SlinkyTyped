package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiscoveredResourceCountsRequest extends StObject {
  
  /**
    * The maximum number of ResourceCount objects returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The comma-separated list that specifies the resource types that you want AWS Config to return (for example, "AWS::EC2::Instance", "AWS::IAM::User"). If a value for resourceTypes is not specified, AWS Config returns all resource types that AWS Config is recording in the region for your account.  If the configuration recorder is turned off, AWS Config returns an empty list of ResourceCount objects. If the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource type is not returned in the list of ResourceCount objects. 
    */
  var resourceTypes: js.UndefOr[ResourceTypes] = js.native
}
object GetDiscoveredResourceCountsRequest {
  
  @scala.inline
  def apply(): GetDiscoveredResourceCountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoveredResourceCountsRequest]
  }
  
  @scala.inline
  implicit class GetDiscoveredResourceCountsRequestMutableBuilder[Self <: GetDiscoveredResourceCountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
  }
}
