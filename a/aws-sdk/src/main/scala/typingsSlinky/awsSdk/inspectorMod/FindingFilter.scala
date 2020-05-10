package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingFilter extends js.Object {
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the agentId property of the Finding data type.
    */
  var agentIds: js.UndefOr[AgentIdList] = js.native
  /**
    * For a record to match a filter, the list of values that are specified for this data type property must be contained in the list of values of the attributes property of the Finding data type.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the autoScalingGroup property of the Finding data type.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  /**
    * The time range during which the finding is generated.
    */
  var creationTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the ruleName property of the Finding data type.
    */
  var ruleNames: js.UndefOr[RuleNameList] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the rulesPackageArn property of the Finding data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the severity property of the Finding data type.
    */
  var severities: js.UndefOr[SeverityList] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the userAttributes property of the Finding data type.
    */
  var userAttributes: js.UndefOr[AttributeList] = js.native
}

object FindingFilter {
  @scala.inline
  def apply(): FindingFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingFilter]
  }
  @scala.inline
  implicit class FindingFilterOps[Self <: FindingFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentIds(value: AgentIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: AttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroups(value: AutoScalingGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimeRange(value: TimestampRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleNames(value: RuleNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesPackageArns(value: FilterRulesPackageArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesPackageArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArns")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverities(value: SeverityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severities")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAttributes(value: AttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(js.undefined)
        ret
    }
  }
  
}

