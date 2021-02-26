package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TestScriptRulesetMutableBuilder[Self <: TestScriptRuleset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: js.Array[TestScriptRulesetRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVarargs(value: TestScriptRulesetRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
  }
}
