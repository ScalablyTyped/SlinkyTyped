package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditData extends js.Object {
  /** Policy delta between the original policy and the newly set policy. */
  var policyDelta: js.UndefOr[PolicyDelta] = js.native
}

object AuditData {
  @scala.inline
  def apply(): AuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditData]
  }
  @scala.inline
  implicit class AuditDataOps[Self <: AuditData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyDelta(value: PolicyDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDelta")(js.undefined)
        ret
    }
  }
  
}

