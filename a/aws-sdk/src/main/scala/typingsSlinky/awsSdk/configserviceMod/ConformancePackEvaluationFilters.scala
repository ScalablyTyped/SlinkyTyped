package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackEvaluationFilters extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  /**
    * Filters the results by AWS Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.native
  /**
    * Filters the results by resource IDs.  This is valid only when you provide resource type. If there is no resource type, you will see an error. 
    */
  var ResourceIds: js.UndefOr[ConformancePackComplianceResourceIds] = js.native
  /**
    * Filters the results by the resource type (for example, "AWS::EC2::Instance"). 
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object ConformancePackEvaluationFilters {
  @scala.inline
  def apply(): ConformancePackEvaluationFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackEvaluationFilters]
  }
  @scala.inline
  implicit class ConformancePackEvaluationFiltersOps[Self <: ConformancePackEvaluationFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceType(value: ConformancePackComplianceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleNames(value: ConformancePackConfigRuleNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIds(value: ConformancePackComplianceResourceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

