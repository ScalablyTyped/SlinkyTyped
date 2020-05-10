package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConfigRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an organization config rule.
    */
  var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.native
}

object PutOrganizationConfigRuleResponse {
  @scala.inline
  def apply(): PutOrganizationConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOrganizationConfigRuleResponse]
  }
  @scala.inline
  implicit class PutOrganizationConfigRuleResponseOps[Self <: PutOrganizationConfigRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfigRuleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationConfigRuleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfigRuleArn")(js.undefined)
        ret
    }
  }
  
}

