package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The referenced rule within the ruleset
  */
@js.native
trait TestScriptSetupActionAssertRulesetRule extends BackboneElement {
  /**
    * Contains extended information for property 'ruleId'.
    */
  var _ruleId: js.UndefOr[Element] = js.native
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRuleParam]] = js.native
  /**
    * Id of referenced rule within the ruleset
    */
  var ruleId: id = js.native
}

object TestScriptSetupActionAssertRulesetRule {
  @scala.inline
  def apply(ruleId: id): TestScriptSetupActionAssertRulesetRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRulesetRule]
  }
  @scala.inline
  implicit class TestScriptSetupActionAssertRulesetRuleOps[Self <: TestScriptSetupActionAssertRulesetRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ruleId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ruleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ruleId")(js.undefined)
        ret
    }
    @scala.inline
    def withParam(value: js.Array[TestScriptSetupActionAssertRulesetRuleParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
  }
  
}

