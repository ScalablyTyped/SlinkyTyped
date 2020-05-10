package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reference to a TestScript.ruleset
  */
@js.native
trait TestScriptSetupActionAssertRuleset extends BackboneElement {
  /**
    * Contains extended information for property 'rulesetId'.
    */
  var _rulesetId: js.UndefOr[Element] = js.native
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRule]] = js.native
  /**
    * Id of the TestScript.ruleset
    */
  var rulesetId: id = js.native
}

object TestScriptSetupActionAssertRuleset {
  @scala.inline
  def apply(rulesetId: id): TestScriptSetupActionAssertRuleset = {
    val __obj = js.Dynamic.literal(rulesetId = rulesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRuleset]
  }
  @scala.inline
  implicit class TestScriptSetupActionAssertRulesetOps[Self <: TestScriptSetupActionAssertRuleset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRulesetId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rulesetId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rulesetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rulesetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rulesetId")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: js.Array[TestScriptSetupActionAssertRulesetRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

