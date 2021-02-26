package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAuditMitigationActionsExecutionsResponse extends StObject {
  
  /**
    * A set of task execution results based on the input parameters. Details include the mitigation action applied, start time, and task status.
    */
  var actionsExecutions: js.UndefOr[AuditMitigationActionExecutionMetadataList] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAuditMitigationActionsExecutionsResponse {
  
  @scala.inline
  def apply(): ListAuditMitigationActionsExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditMitigationActionsExecutionsResponse]
  }
  
  @scala.inline
  implicit class ListAuditMitigationActionsExecutionsResponseMutableBuilder[Self <: ListAuditMitigationActionsExecutionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionsExecutions(value: AuditMitigationActionExecutionMetadataList): Self = StObject.set(x, "actionsExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsExecutionsUndefined: Self = StObject.set(x, "actionsExecutions", js.undefined)
    
    @scala.inline
    def setActionsExecutionsVarargs(value: AuditMitigationActionExecutionMetadata*): Self = StObject.set(x, "actionsExecutions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
