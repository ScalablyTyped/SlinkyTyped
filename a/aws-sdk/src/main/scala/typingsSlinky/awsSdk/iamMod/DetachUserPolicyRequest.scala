package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachUserPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to detach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
  
  /**
    * The name (friendly name, not ARN) of the IAM user to detach the policy from. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}
object DetachUserPolicyRequest {
  
  @scala.inline
  def apply(PolicyArn: arnType, UserName: userNameType): DetachUserPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachUserPolicyRequest]
  }
  
  @scala.inline
  implicit class DetachUserPolicyRequestMutableBuilder[Self <: DetachUserPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
