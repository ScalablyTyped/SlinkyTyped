package typingsSlinky.googleCloudTasks.mod

import typingsSlinky.googleCloudTasks.anon.PartialPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIamPolicyRequest extends js.Object {
  var policy: PartialPolicy = js.native
}

object SetIamPolicyRequest {
  @scala.inline
  def apply(policy: PartialPolicy): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
  @scala.inline
  implicit class SetIamPolicyRequestOps[Self <: SetIamPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: PartialPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

