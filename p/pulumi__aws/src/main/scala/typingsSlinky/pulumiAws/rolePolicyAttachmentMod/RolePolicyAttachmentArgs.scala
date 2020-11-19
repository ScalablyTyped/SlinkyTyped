package typingsSlinky.pulumiAws.rolePolicyAttachmentMod

import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.iamMod.Role
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolePolicyAttachmentArgs extends js.Object {
  
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN] = js.native
  
  /**
    * The role the policy should be applied to
    */
  val role: Input[String | Role] = js.native
}
object RolePolicyAttachmentArgs {
  
  @scala.inline
  def apply(policyArn: Input[ARN], role: Input[String | Role]): RolePolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyAttachmentArgs]
  }
  
  @scala.inline
  implicit class RolePolicyAttachmentArgsOps[Self <: RolePolicyAttachmentArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyArn(value: Input[ARN]): Self = this.set("policyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Input[String | Role]): Self = this.set("role", value.asInstanceOf[js.Any])
  }
}
