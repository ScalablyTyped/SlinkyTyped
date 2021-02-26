package typingsSlinky.pulumiAws.inputMod.networkfirewall

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination extends StObject {
  
  /**
    * An IP address or a block of IP addresses in CIDR notation. AWS Network Firewall supports all address ranges for IPv4.
    */
  var addressDefinition: js.UndefOr[Input[String]] = js.native
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination {
  
  @scala.inline
  def apply(): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressDefinition(value: Input[String]): Self = StObject.set(x, "addressDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressDefinitionUndefined: Self = StObject.set(x, "addressDefinition", js.undefined)
  }
}
