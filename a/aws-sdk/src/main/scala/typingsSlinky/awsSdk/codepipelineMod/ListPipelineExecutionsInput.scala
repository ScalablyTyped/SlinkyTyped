package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPipelineExecutionsInput extends StObject {
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline execution start times. Default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token that was returned from the previous ListPipelineExecutions call, which can be used to return the next set of pipeline executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The name of the pipeline for which you want to get execution summary information.
    */
  var pipelineName: PipelineName = js.native
}
object ListPipelineExecutionsInput {
  
  @scala.inline
  def apply(pipelineName: PipelineName): ListPipelineExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelineExecutionsInput]
  }
  
  @scala.inline
  implicit class ListPipelineExecutionsInputMutableBuilder[Self <: ListPipelineExecutionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
