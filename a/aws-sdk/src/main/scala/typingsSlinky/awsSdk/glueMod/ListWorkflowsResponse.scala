package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkflowsResponse extends StObject {
  
  /**
    * A continuation token, if not all workflow names have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * List of names of workflows in the account.
    */
  var Workflows: js.UndefOr[WorkflowNames] = js.native
}
object ListWorkflowsResponse {
  
  @scala.inline
  def apply(): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  
  @scala.inline
  implicit class ListWorkflowsResponseMutableBuilder[Self <: ListWorkflowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWorkflows(value: WorkflowNames): Self = StObject.set(x, "Workflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowsUndefined: Self = StObject.set(x, "Workflows", js.undefined)
    
    @scala.inline
    def setWorkflowsVarargs(value: NameString*): Self = StObject.set(x, "Workflows", js.Array(value :_*))
  }
}
