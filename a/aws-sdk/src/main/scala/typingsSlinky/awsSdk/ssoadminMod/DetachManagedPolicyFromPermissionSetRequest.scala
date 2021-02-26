package typingsSlinky.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachManagedPolicyFromPermissionSetRequest extends StObject {
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typingsSlinky.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The IAM managed policy ARN to be attached to a permission set.
    */
  var ManagedPolicyArn: typingsSlinky.awsSdk.ssoadminMod.ManagedPolicyArn = js.native
  
  /**
    * The ARN of the PermissionSet from which the policy should be detached.
    */
  var PermissionSetArn: typingsSlinky.awsSdk.ssoadminMod.PermissionSetArn = js.native
}
object DetachManagedPolicyFromPermissionSetRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn, ManagedPolicyArn: ManagedPolicyArn, PermissionSetArn: PermissionSetArn): DetachManagedPolicyFromPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], ManagedPolicyArn = ManagedPolicyArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachManagedPolicyFromPermissionSetRequest]
  }
  
  @scala.inline
  implicit class DetachManagedPolicyFromPermissionSetRequestMutableBuilder[Self <: DetachManagedPolicyFromPermissionSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPolicyArn(value: ManagedPolicyArn): Self = StObject.set(x, "ManagedPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
