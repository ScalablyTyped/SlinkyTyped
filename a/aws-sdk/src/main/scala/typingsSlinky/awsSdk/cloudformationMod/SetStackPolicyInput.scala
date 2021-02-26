package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetStackPolicyInput extends StObject {
  
  /**
    * The name or unique stack ID that you want to associate a policy with.
    */
  var StackName: typingsSlinky.awsSdk.cloudformationMod.StackName = js.native
  
  /**
    * Structure containing the stack policy body. For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyBody: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackPolicyBody] = js.native
  
  /**
    * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in an S3 bucket in the same Region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyURL: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackPolicyURL] = js.native
}
object SetStackPolicyInput {
  
  @scala.inline
  def apply(StackName: StackName): SetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStackPolicyInput]
  }
  
  @scala.inline
  implicit class SetStackPolicyInputMutableBuilder[Self <: SetStackPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPolicyBody(value: StackPolicyBody): Self = StObject.set(x, "StackPolicyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPolicyBodyUndefined: Self = StObject.set(x, "StackPolicyBody", js.undefined)
    
    @scala.inline
    def setStackPolicyURL(value: StackPolicyURL): Self = StObject.set(x, "StackPolicyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPolicyURLUndefined: Self = StObject.set(x, "StackPolicyURL", js.undefined)
  }
}
