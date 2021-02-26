package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowRunPropertiesResponse extends StObject {
  
  /**
    * The workflow run properties which were set during the specified run.
    */
  var RunProperties: js.UndefOr[WorkflowRunProperties] = js.native
}
object GetWorkflowRunPropertiesResponse {
  
  @scala.inline
  def apply(): GetWorkflowRunPropertiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunPropertiesResponse]
  }
  
  @scala.inline
  implicit class GetWorkflowRunPropertiesResponseMutableBuilder[Self <: GetWorkflowRunPropertiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "RunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunPropertiesUndefined: Self = StObject.set(x, "RunProperties", js.undefined)
  }
}
