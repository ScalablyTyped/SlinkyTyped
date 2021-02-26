package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowDefinitionRequest extends StObject {
  
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionName = js.native
}
object DescribeFlowDefinitionRequest {
  
  @scala.inline
  def apply(FlowDefinitionName: FlowDefinitionName): DescribeFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionRequest]
  }
  
  @scala.inline
  implicit class DescribeFlowDefinitionRequestMutableBuilder[Self <: DescribeFlowDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
  }
}
