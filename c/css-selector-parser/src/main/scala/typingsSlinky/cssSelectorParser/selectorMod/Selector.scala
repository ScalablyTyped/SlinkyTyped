package typingsSlinky.cssSelectorParser.selectorMod

import typingsSlinky.cssSelectorParser.cssSelectorParserStrings.ruleSet
import typingsSlinky.cssSelectorParser.cssSelectorParserStrings.selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssSelectorParser.selectorMod.Selectors
  - typingsSlinky.cssSelectorParser.selectorMod.RuleSet
*/
trait Selector extends js.Object
object Selector {
  
  @scala.inline
  def Selectors(selectors: js.Array[RuleSet], `type`: selectors): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  def RuleSet(rule: Rule, `type`: ruleSet): Selector = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}
