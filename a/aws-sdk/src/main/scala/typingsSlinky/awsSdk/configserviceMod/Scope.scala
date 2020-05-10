package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  /**
    * The ID of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for ComplianceResourceTypes.
    */
  var ComplianceResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only specify one type if you also specify a resource ID for ComplianceResourceId.
    */
  var ComplianceResourceTypes: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceResourceTypes] = js.native
  /**
    * The tag key that is applied to only those AWS resources that you want to trigger an evaluation for the rule.
    */
  var TagKey: js.UndefOr[StringWithCharLimit128] = js.native
  /**
    * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you specify a value for TagValue, you must also specify a value for TagKey.
    */
  var TagValue: js.UndefOr[StringWithCharLimit256] = js.native
}

object Scope {
  @scala.inline
  def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceResourceId(value: BaseResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceResourceTypes(value: ComplianceResourceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceResourceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withTagKey(value: StringWithCharLimit128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTagValue(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagValue")(js.undefined)
        ret
    }
  }
  
}

