package typingsSlinky.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to start.
    */
  var FlowArn: string = js.native
}
object StartFlowRequest {
  
  @scala.inline
  def apply(FlowArn: string): StartFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFlowRequest]
  }
  
  @scala.inline
  implicit class StartFlowRequestMutableBuilder[Self <: StartFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
