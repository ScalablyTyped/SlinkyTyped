package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBatchInferenceJobsResponse extends StObject {
  
  /**
    * A list containing information on each job that is returned.
    */
  var batchInferenceJobs: js.UndefOr[BatchInferenceJobs] = js.native
  
  /**
    * The token to use to retreive the next page of results. The value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListBatchInferenceJobsResponse {
  
  @scala.inline
  def apply(): ListBatchInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchInferenceJobsResponse]
  }
  
  @scala.inline
  implicit class ListBatchInferenceJobsResponseMutableBuilder[Self <: ListBatchInferenceJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchInferenceJobs(value: BatchInferenceJobs): Self = StObject.set(x, "batchInferenceJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchInferenceJobsUndefined: Self = StObject.set(x, "batchInferenceJobs", js.undefined)
    
    @scala.inline
    def setBatchInferenceJobsVarargs(value: BatchInferenceJobSummary*): Self = StObject.set(x, "batchInferenceJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
