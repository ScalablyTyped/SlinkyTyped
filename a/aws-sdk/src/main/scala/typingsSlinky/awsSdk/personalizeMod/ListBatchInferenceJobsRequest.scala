package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBatchInferenceJobsRequest extends StObject {
  
  /**
    * The maximum number of batch inference job results to return in each page. The default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the solution version from which the batch inference jobs were created.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}
object ListBatchInferenceJobsRequest {
  
  @scala.inline
  def apply(): ListBatchInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchInferenceJobsRequest]
  }
  
  @scala.inline
  implicit class ListBatchInferenceJobsRequestMutableBuilder[Self <: ListBatchInferenceJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}
