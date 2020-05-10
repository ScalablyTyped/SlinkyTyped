package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyResponse extends js.Object {
  /**
    * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or updates this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.native
}

object PutResourcePolicyResponse {
  @scala.inline
  def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  @scala.inline
  implicit class PutResourcePolicyResponseOps[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyHash(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyHash")(js.undefined)
        ret
    }
  }
  
}

