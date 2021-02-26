package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComputeEnvironmentsRequest extends StObject {
  
  /**
    * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
    */
  var computeEnvironments: js.UndefOr[StringList] = js.native
  
  /**
    * The maximum number of cluster results returned by DescribeComputeEnvironments in paginated output. When this parameter is used, DescribeComputeEnvironments only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeComputeEnvironments request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeComputeEnvironments returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The nextToken value returned from a previous paginated DescribeComputeEnvironments request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeComputeEnvironmentsRequest {
  
  @scala.inline
  def apply(): DescribeComputeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeEnvironmentsRequest]
  }
  
  @scala.inline
  implicit class DescribeComputeEnvironmentsRequestMutableBuilder[Self <: DescribeComputeEnvironmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironments(value: StringList): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentsUndefined: Self = StObject.set(x, "computeEnvironments", js.undefined)
    
    @scala.inline
    def setComputeEnvironmentsVarargs(value: String*): Self = StObject.set(x, "computeEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
