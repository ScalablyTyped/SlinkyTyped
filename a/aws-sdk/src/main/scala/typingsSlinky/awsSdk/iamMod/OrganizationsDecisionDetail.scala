package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationsDecisionDetail extends js.Object {
  /**
    * Specifies whether the simulated operation is allowed by the Organizations service control policies that impact the simulated user's account.
    */
  var AllowedByOrganizations: js.UndefOr[booleanType] = js.native
}

object OrganizationsDecisionDetail {
  @scala.inline
  def apply(): OrganizationsDecisionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationsDecisionDetail]
  }
  @scala.inline
  implicit class OrganizationsDecisionDetailOps[Self <: OrganizationsDecisionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedByOrganizations(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedByOrganizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedByOrganizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedByOrganizations")(js.undefined)
        ret
    }
  }
  
}

