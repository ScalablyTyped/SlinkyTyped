package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLabelingJobsResponse extends StObject {
  
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobSummaryList] = js.native
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListLabelingJobsResponse {
  
  @scala.inline
  def apply(): ListLabelingJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelingJobsResponse]
  }
  
  @scala.inline
  implicit class ListLabelingJobsResponseMutableBuilder[Self <: ListLabelingJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelingJobSummaryList(value: LabelingJobSummaryList): Self = StObject.set(x, "LabelingJobSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobSummaryListUndefined: Self = StObject.set(x, "LabelingJobSummaryList", js.undefined)
    
    @scala.inline
    def setLabelingJobSummaryListVarargs(value: LabelingJobSummary*): Self = StObject.set(x, "LabelingJobSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
