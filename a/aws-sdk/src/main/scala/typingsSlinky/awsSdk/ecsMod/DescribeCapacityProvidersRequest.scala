package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCapacityProvidersRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of one or more capacity providers. Up to 100 capacity providers can be described in an action.
    */
  var capacityProviders: js.UndefOr[StringList] = js.native
  
  /**
    * Specifies whether or not you want to see the resource tags for the capacity provider. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[CapacityProviderFieldList] = js.native
  
  /**
    * The maximum number of account setting results returned by DescribeCapacityProviders in paginated output. When this parameter is used, DescribeCapacityProviders only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeCapacityProviders request with the returned nextToken value. This value can be between 1 and 10. If this parameter is not used, then DescribeCapacityProviders returns up to 10 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The nextToken value returned from a previous paginated DescribeCapacityProviders request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeCapacityProvidersRequest {
  
  @scala.inline
  def apply(): DescribeCapacityProvidersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityProvidersRequest]
  }
  
  @scala.inline
  implicit class DescribeCapacityProvidersRequestMutableBuilder[Self <: DescribeCapacityProvidersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviders(value: StringList): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProvidersUndefined: Self = StObject.set(x, "capacityProviders", js.undefined)
    
    @scala.inline
    def setCapacityProvidersVarargs(value: String*): Self = StObject.set(x, "capacityProviders", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: CapacityProviderFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: CapacityProviderField*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
