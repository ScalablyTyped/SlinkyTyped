package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTransformJobsRequest extends StObject {
  
  /**
    * A filter that returns only transform jobs created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    * A filter that returns only transform jobs created before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  
  /**
    * A filter that returns only transform jobs modified after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    * A filter that returns only transform jobs modified before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  
  /**
    * The maximum number of transform jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * A string in the transform job name. This filter returns only transform jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NameContains] = js.native
  
  /**
    * If the result of the previous ListTransformJobs request was truncated, the response includes a NextToken. To retrieve the next set of transform jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortBy] = js.native
  
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
  
  /**
    * A filter that retrieves only transform jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[TransformJobStatus] = js.native
}
object ListTransformJobsRequest {
  
  @scala.inline
  def apply(): ListTransformJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransformJobsRequest]
  }
  
  @scala.inline
  implicit class ListTransformJobsRequestMutableBuilder[Self <: ListTransformJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: NameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: SortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setStatusEquals(value: TransformJobStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
