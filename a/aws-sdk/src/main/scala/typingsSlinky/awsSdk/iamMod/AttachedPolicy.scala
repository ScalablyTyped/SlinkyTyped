package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedPolicy extends js.Object {
  var PolicyArn: js.UndefOr[arnType] = js.native
  /**
    * The friendly name of the attached policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.native
}

object AttachedPolicy {
  @scala.inline
  def apply(): AttachedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPolicy]
  }
  @scala.inline
  implicit class AttachedPolicyOps[Self <: AttachedPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyArn(value: arnType): Self = {
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
    @scala.inline
    def withPolicyName(value: policyNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(js.undefined)
        ret
    }
  }
  
}

