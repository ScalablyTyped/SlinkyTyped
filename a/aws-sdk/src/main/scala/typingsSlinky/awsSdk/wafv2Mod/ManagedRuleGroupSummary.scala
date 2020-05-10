package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedRuleGroupSummary extends js.Object {
  /**
    * The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who manages it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.VendorName] = js.native
}

object ManagedRuleGroupSummary {
  @scala.inline
  def apply(): ManagedRuleGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleGroupSummary]
  }
  @scala.inline
  implicit class ManagedRuleGroupSummaryOps[Self <: ManagedRuleGroupSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: EntityDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorName(value: VendorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VendorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VendorName")(js.undefined)
        ret
    }
  }
  
}

