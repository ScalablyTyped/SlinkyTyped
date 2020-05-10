package typingsSlinky.pulumiAws.iotPolicyAttachmentMod

import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.iotMod.Policy
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentArgs extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: Input[String | Policy] = js.native
  /**
    * The identity to which the policy is attached.
    */
  val target: Input[ARN] = js.native
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(policy: Input[String | Policy], target: Input[ARN]): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
  @scala.inline
  implicit class PolicyAttachmentArgsOps[Self <: PolicyAttachmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: Input[String | Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

