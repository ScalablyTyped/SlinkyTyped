package typingsSlinky.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCanaryRunsRequest extends StObject {
  
  /**
    * Specify this parameter to limit how many runs are returned each time you use the GetCanaryRuns operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.native
  
  /**
    * The name of the canary that you want to see runs for.
    */
  var Name: CanaryName = js.native
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent GetCanaryRuns operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetCanaryRunsRequest {
  
  @scala.inline
  def apply(Name: CanaryName): GetCanaryRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRunsRequest]
  }
  
  @scala.inline
  implicit class GetCanaryRunsRequestMutableBuilder[Self <: GetCanaryRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
