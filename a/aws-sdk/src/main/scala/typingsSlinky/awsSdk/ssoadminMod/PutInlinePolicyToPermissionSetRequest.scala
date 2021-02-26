package typingsSlinky.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInlinePolicyToPermissionSetRequest extends StObject {
  
  /**
    * The IAM inline policy to attach to a PermissionSet.
    */
  var InlinePolicy: PermissionSetPolicyDocument = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typingsSlinky.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The ARN of the permission set.
    */
  var PermissionSetArn: typingsSlinky.awsSdk.ssoadminMod.PermissionSetArn = js.native
}
object PutInlinePolicyToPermissionSetRequest {
  
  @scala.inline
  def apply(
    InlinePolicy: PermissionSetPolicyDocument,
    InstanceArn: InstanceArn,
    PermissionSetArn: PermissionSetArn
  ): PutInlinePolicyToPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InlinePolicy = InlinePolicy.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInlinePolicyToPermissionSetRequest]
  }
  
  @scala.inline
  implicit class PutInlinePolicyToPermissionSetRequestMutableBuilder[Self <: PutInlinePolicyToPermissionSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlinePolicy(value: PermissionSetPolicyDocument): Self = StObject.set(x, "InlinePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
