package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementManagedRuleGroupStatement extends StObject {
  
  /**
    * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
    */
  var excludedRules: js.UndefOr[Input[js.Array[Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]]]] = js.native
  
  /**
    * The name of the managed rule group.
    */
  var name: Input[String] = js.native
  
  /**
    * The name of the managed rule group vendor.
    */
  var vendorName: Input[String] = js.native
}
object WebAclRuleStatementManagedRuleGroupStatement {
  
  @scala.inline
  def apply(name: Input[String], vendorName: Input[String]): WebAclRuleStatementManagedRuleGroupStatement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vendorName = vendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementManagedRuleGroupStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementManagedRuleGroupStatementMutableBuilder[Self <: WebAclRuleStatementManagedRuleGroupStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedRules(value: Input[js.Array[Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]]]): Self = StObject.set(x, "excludedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedRulesUndefined: Self = StObject.set(x, "excludedRules", js.undefined)
    
    @scala.inline
    def setExcludedRulesVarargs(value: Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]*): Self = StObject.set(x, "excludedRules", js.Array(value :_*))
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorName(value: Input[String]): Self = StObject.set(x, "vendorName", value.asInstanceOf[js.Any])
  }
}
