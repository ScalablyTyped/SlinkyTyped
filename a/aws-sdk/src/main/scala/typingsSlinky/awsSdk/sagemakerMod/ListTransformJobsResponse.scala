package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTransformJobsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs, use it in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of TransformJobSummary objects.
    */
  var TransformJobSummaries: typingsSlinky.awsSdk.sagemakerMod.TransformJobSummaries = js.native
}
object ListTransformJobsResponse {
  
  @scala.inline
  def apply(TransformJobSummaries: TransformJobSummaries): ListTransformJobsResponse = {
    val __obj = js.Dynamic.literal(TransformJobSummaries = TransformJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTransformJobsResponse]
  }
  
  @scala.inline
  implicit class ListTransformJobsResponseMutableBuilder[Self <: ListTransformJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransformJobSummaries(value: TransformJobSummaries): Self = StObject.set(x, "TransformJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobSummariesVarargs(value: TransformJobSummary*): Self = StObject.set(x, "TransformJobSummaries", js.Array(value :_*))
  }
}
