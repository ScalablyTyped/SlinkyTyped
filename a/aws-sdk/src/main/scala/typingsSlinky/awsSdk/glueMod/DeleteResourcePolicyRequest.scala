package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcePolicyRequest extends js.Object {
  /**
    * The hash value returned when this policy was set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.native
}

object DeleteResourcePolicyRequest {
  @scala.inline
  def apply(): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  @scala.inline
  implicit class DeleteResourcePolicyRequestOps[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyHashCondition(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHashCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyHashCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHashCondition")(js.undefined)
        ret
    }
  }
  
}

