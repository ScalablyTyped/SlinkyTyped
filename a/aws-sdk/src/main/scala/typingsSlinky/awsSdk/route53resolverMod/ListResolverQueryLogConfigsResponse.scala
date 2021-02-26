package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverQueryLogConfigsResponse extends StObject {
  
  /**
    * If there are more than MaxResults query logging configurations, you can submit another ListResolverQueryLogConfigs request to get the next group of configurations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.NextToken] = js.native
  
  /**
    * A list that contains one ResolverQueryLogConfig element for each query logging configuration that matches the values that you specified for Filter.
    */
  var ResolverQueryLogConfigs: js.UndefOr[ResolverQueryLogConfigList] = js.native
  
  /**
    * The total number of query logging configurations that were created by the current account in the specified Region. This count can differ from the number of query logging configurations that are returned in a ListResolverQueryLogConfigs response, depending on the values that you specify in the request.
    */
  var TotalCount: js.UndefOr[Count] = js.native
  
  /**
    * The total number of query logging configurations that were created by the current account in the specified Region and that match the filters that were specified in the ListResolverQueryLogConfigs request. For the total number of query logging configurations that were created by the current account in the specified Region, see TotalCount.
    */
  var TotalFilteredCount: js.UndefOr[Count] = js.native
}
object ListResolverQueryLogConfigsResponse {
  
  @scala.inline
  def apply(): ListResolverQueryLogConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverQueryLogConfigsResponse]
  }
  
  @scala.inline
  implicit class ListResolverQueryLogConfigsResponseMutableBuilder[Self <: ListResolverQueryLogConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResolverQueryLogConfigs(value: ResolverQueryLogConfigList): Self = StObject.set(x, "ResolverQueryLogConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigsUndefined: Self = StObject.set(x, "ResolverQueryLogConfigs", js.undefined)
    
    @scala.inline
    def setResolverQueryLogConfigsVarargs(value: ResolverQueryLogConfig*): Self = StObject.set(x, "ResolverQueryLogConfigs", js.Array(value :_*))
    
    @scala.inline
    def setTotalCount(value: Count): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
    
    @scala.inline
    def setTotalFilteredCount(value: Count): Self = StObject.set(x, "TotalFilteredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFilteredCountUndefined: Self = StObject.set(x, "TotalFilteredCount", js.undefined)
  }
}
