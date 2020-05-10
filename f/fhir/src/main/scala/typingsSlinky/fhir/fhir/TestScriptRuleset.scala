package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Assert ruleset used within the test script
  */
@js.native
trait TestScriptRuleset extends BackboneElement {
  /**
    * Assert ruleset resource reference
    */
  var resource: Reference = js.native
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.Array[TestScriptRulesetRule] = js.native
}

object TestScriptRuleset {
  @scala.inline
  def apply(resource: Reference, rule: js.Array[TestScriptRulesetRule]): TestScriptRuleset = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRuleset]
  }
  @scala.inline
  implicit class TestScriptRulesetOps[Self <: TestScriptRuleset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: js.Array[TestScriptRulesetRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

