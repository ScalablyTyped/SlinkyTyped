package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopFlowRequest extends StObject {
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName = js.native
}
object StopFlowRequest {
  
  @scala.inline
  def apply(flowName: FlowName): StopFlowRequest = {
    val __obj = js.Dynamic.literal(flowName = flowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFlowRequest]
  }
  
  @scala.inline
  implicit class StopFlowRequestMutableBuilder[Self <: StopFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
  }
}
