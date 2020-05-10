package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPolicyResponse extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy that was created.
    */
  var Policy: js.UndefOr[typingsSlinky.awsSdk.fmsMod.Policy] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy that was created.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.native
}

object PutPolicyResponse {
  @scala.inline
  def apply(): PutPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPolicyResponse]
  }
  @scala.inline
  implicit class PutPolicyResponseOps[Self <: PutPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(js.undefined)
        ret
    }
  }
  
}

