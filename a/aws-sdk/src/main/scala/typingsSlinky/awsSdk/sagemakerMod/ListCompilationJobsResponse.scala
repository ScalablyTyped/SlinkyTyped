package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCompilationJobsResponse extends StObject {
  
  /**
    * An array of CompilationJobSummary objects, each describing a model compilation job. 
    */
  var CompilationJobSummaries: typingsSlinky.awsSdk.sagemakerMod.CompilationJobSummaries = js.native
  
  /**
    * If the response is truncated, Amazon SageMaker returns this NextToken. To retrieve the next set of model compilation jobs, use this token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListCompilationJobsResponse {
  
  @scala.inline
  def apply(CompilationJobSummaries: CompilationJobSummaries): ListCompilationJobsResponse = {
    val __obj = js.Dynamic.literal(CompilationJobSummaries = CompilationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCompilationJobsResponse]
  }
  
  @scala.inline
  implicit class ListCompilationJobsResponseMutableBuilder[Self <: ListCompilationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilationJobSummaries(value: CompilationJobSummaries): Self = StObject.set(x, "CompilationJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilationJobSummariesVarargs(value: CompilationJobSummary*): Self = StObject.set(x, "CompilationJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
