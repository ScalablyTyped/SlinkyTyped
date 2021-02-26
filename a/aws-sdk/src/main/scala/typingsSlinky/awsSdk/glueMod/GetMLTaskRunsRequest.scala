package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTaskRunsRequest extends StObject {
  
  /**
    * The filter criteria, in the TaskRunFilterCriteria structure, for the task run.
    */
  var Filter: js.UndefOr[TaskRunFilterCriteria] = js.native
  
  /**
    * The maximum number of results to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A token for pagination of the results. The default is empty.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The sorting criteria, in the TaskRunSortCriteria structure, for the task run.
    */
  var Sort: js.UndefOr[TaskRunSortCriteria] = js.native
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}
object GetMLTaskRunsRequest {
  
  @scala.inline
  def apply(TransformId: HashString): GetMLTaskRunsRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunsRequest]
  }
  
  @scala.inline
  implicit class GetMLTaskRunsRequestMutableBuilder[Self <: GetMLTaskRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: TaskRunFilterCriteria): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSort(value: TaskRunSortCriteria): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
