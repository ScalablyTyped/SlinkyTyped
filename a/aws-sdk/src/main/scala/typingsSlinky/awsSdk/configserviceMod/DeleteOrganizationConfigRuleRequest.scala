package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOrganizationConfigRuleRequest extends js.Object {
  /**
    * The name of organization config rule that you want to delete.
    */
  var OrganizationConfigRuleName: typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
}

object DeleteOrganizationConfigRuleRequest {
  @scala.inline
  def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): DeleteOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrganizationConfigRuleRequest]
  }
  @scala.inline
  implicit class DeleteOrganizationConfigRuleRequestOps[Self <: DeleteOrganizationConfigRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

