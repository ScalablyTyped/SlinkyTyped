package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopConfig extends StObject {
  
  /**
    * Sets attributes of the input data.
    */
  var DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition. You can create a flow definition by using the Amazon Sagemaker CreateFlowDefinition Operation. 
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.rekognitionMod.FlowDefinitionArn = js.native
  
  /**
    * The name of the human review used for this image. This should be kept unique within a region.
    */
  var HumanLoopName: typingsSlinky.awsSdk.rekognitionMod.HumanLoopName = js.native
}
object HumanLoopConfig {
  
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn, HumanLoopName: HumanLoopName): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
  
  @scala.inline
  implicit class HumanLoopConfigMutableBuilder[Self <: HumanLoopConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAttributes(value: HumanLoopDataAttributes): Self = StObject.set(x, "DataAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAttributesUndefined: Self = StObject.set(x, "DataAttributes", js.undefined)
    
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
  }
}
