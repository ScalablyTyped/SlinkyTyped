package typingsSlinky.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLifecyclePolicyRequest extends StObject {
  
  /**
    * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
    */
  var Description: PolicyDescription = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: typingsSlinky.awsSdk.dlmMod.ExecutionRoleArn = js.native
  
  /**
    * The configuration details of the lifecycle policy.
    */
  var PolicyDetails: typingsSlinky.awsSdk.dlmMod.PolicyDetails = js.native
  
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: SettablePolicyStateValues = js.native
  
  /**
    * The tags to apply to the lifecycle policy during creation.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateLifecyclePolicyRequest {
  
  @scala.inline
  def apply(
    Description: PolicyDescription,
    ExecutionRoleArn: ExecutionRoleArn,
    PolicyDetails: PolicyDetails,
    State: SettablePolicyStateValues
  ): CreateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], PolicyDetails = PolicyDetails.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLifecyclePolicyRequest]
  }
  
  @scala.inline
  implicit class CreateLifecyclePolicyRequestMutableBuilder[Self <: CreateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = StObject.set(x, "PolicyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
