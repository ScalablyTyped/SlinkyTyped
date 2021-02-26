package typingsSlinky.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHumanLoopResponse extends StObject {
  
  /**
    * The creation time when Amazon Augmented AI created the human loop.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * A failure code that identifies the type of failure.
    */
  var FailureCode: js.UndefOr[String] = js.native
  
  /**
    * The reason why a human loop failed. The failure reason is returned when the status of the human loop is Failed.
    */
  var FailureReason: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopArn = js.native
  
  /**
    * The name of the human loop. The name must be lowercase, unique within the Region in your account, and can have up to 63 characters. Valid characters: a-z, 0-9, and - (hyphen).
    */
  var HumanLoopName: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
  
  /**
    * An object that contains information about the output of the human loop.
    */
  var HumanLoopOutput: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopOutput] = js.native
  
  /**
    * The status of the human loop. 
    */
  var HumanLoopStatus: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopStatus = js.native
}
object DescribeHumanLoopResponse {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    FlowDefinitionArn: FlowDefinitionArn,
    HumanLoopArn: HumanLoopArn,
    HumanLoopName: HumanLoopName,
    HumanLoopStatus: HumanLoopStatus
  ): DescribeHumanLoopResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopArn = HumanLoopArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any], HumanLoopStatus = HumanLoopStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanLoopResponse]
  }
  
  @scala.inline
  implicit class DescribeHumanLoopResponseMutableBuilder[Self <: DescribeHumanLoopResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCode(value: String): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopArn(value: HumanLoopArn): Self = StObject.set(x, "HumanLoopArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopOutput(value: HumanLoopOutput): Self = StObject.set(x, "HumanLoopOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopOutputUndefined: Self = StObject.set(x, "HumanLoopOutput", js.undefined)
    
    @scala.inline
    def setHumanLoopStatus(value: HumanLoopStatus): Self = StObject.set(x, "HumanLoopStatus", value.asInstanceOf[js.Any])
  }
}
