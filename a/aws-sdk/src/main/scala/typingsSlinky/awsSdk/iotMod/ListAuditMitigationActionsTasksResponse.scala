package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAuditMitigationActionsTasksResponse extends StObject {
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The collection of audit mitigation tasks that matched the filter criteria.
    */
  var tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList] = js.native
}
object ListAuditMitigationActionsTasksResponse {
  
  @scala.inline
  def apply(): ListAuditMitigationActionsTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditMitigationActionsTasksResponse]
  }
  
  @scala.inline
  implicit class ListAuditMitigationActionsTasksResponseMutableBuilder[Self <: ListAuditMitigationActionsTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTasks(value: AuditMitigationActionsTaskMetadataList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: AuditMitigationActionsTaskMetadata*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
