package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTypeSummary extends js.Object {
  /**
    * The status of the policy type as it relates to the associated root. You can attach a policy of the specified type to a root or to an OU or account in that root. To do so, the policy must be available in the organization and enabled for that root.
    */
  var Status: js.UndefOr[PolicyTypeStatus] = js.native
  /**
    * The name of the policy type.
    */
  var Type: js.UndefOr[PolicyType] = js.native
}

object PolicyTypeSummary {
  @scala.inline
  def apply(): PolicyTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTypeSummary]
  }
  @scala.inline
  implicit class PolicyTypeSummaryOps[Self <: PolicyTypeSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: PolicyTypeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

