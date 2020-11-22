package typingsSlinky.pulumiAws.groupPolicyAttachmentMod

import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.iamMod.Group
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupPolicyAttachmentArgs extends js.Object {
  
  /**
    * The group the policy should be applied to
    */
  val group: Input[String | Group] = js.native
  
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN] = js.native
}
object GroupPolicyAttachmentArgs {
  
  @scala.inline
  implicit class GroupPolicyAttachmentArgsOps[Self <: GroupPolicyAttachmentArgs] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: Input[String | Group]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArn(value: Input[ARN]): Self = this.set("policyArn", value.asInstanceOf[js.Any])
  }
}
