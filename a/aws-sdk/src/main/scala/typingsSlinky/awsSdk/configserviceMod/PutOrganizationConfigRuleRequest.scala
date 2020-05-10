package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConfigRuleRequest extends js.Object {
  /**
    * A comma-separated list of accounts that you want to exclude from an organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  /**
    * The name that you assign to an organization config rule.
    */
  var OrganizationConfigRuleName: typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationCustomRuleMetadata] = js.native
  /**
    * An OrganizationManagedRuleMetadata object. 
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationManagedRuleMetadata] = js.native
}

object PutOrganizationConfigRuleRequest {
  @scala.inline
  def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): PutOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConfigRuleRequest]
  }
  @scala.inline
  implicit class PutOrganizationConfigRuleRequestOps[Self <: PutOrganizationConfigRuleRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withExcludedAccounts(value: ExcludedAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationCustomRuleMetadata(value: OrganizationCustomRuleMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationCustomRuleMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationCustomRuleMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationCustomRuleMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationManagedRuleMetadata(value: OrganizationManagedRuleMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationManagedRuleMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationManagedRuleMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationManagedRuleMetadata")(js.undefined)
        ret
    }
  }
  
}

