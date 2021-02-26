package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachGroupPolicyRequest extends StObject {
  
  /**
    * The name (friendly name, not ARN) of the IAM group to detach the policy from. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to detach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
}
object DetachGroupPolicyRequest {
  
  @scala.inline
  def apply(GroupName: groupNameType, PolicyArn: arnType): DetachGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachGroupPolicyRequest]
  }
  
  @scala.inline
  implicit class DetachGroupPolicyRequestMutableBuilder[Self <: DetachGroupPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
  }
}
