package typingsSlinky.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportTasksRequest extends StObject {
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
    */
  var statusCode: js.UndefOr[ExportTaskStatusCode] = js.native
  
  /**
    * The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.native
}
object DescribeExportTasksRequest {
  
  @scala.inline
  def apply(): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
  
  @scala.inline
  implicit class DescribeExportTasksRequestMutableBuilder[Self <: DescribeExportTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStatusCode(value: ExportTaskStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setTaskId(value: ExportTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
