package typingsSlinky.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceRulesSourceList extends StObject {
  
  /**
    * String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
    */
  var generatedRulesType: String = js.native
  
  /**
    * Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
    */
  var targetTypes: js.Array[String] = js.native
  
  /**
    * Set of domains that you want to inspect for in your traffic flows.
    */
  var targets: js.Array[String] = js.native
}
object RuleGroupRuleGroupRulesSourceRulesSourceList {
  
  @scala.inline
  def apply(generatedRulesType: String, targetTypes: js.Array[String], targets: js.Array[String]): RuleGroupRuleGroupRulesSourceRulesSourceList = {
    val __obj = js.Dynamic.literal(generatedRulesType = generatedRulesType.asInstanceOf[js.Any], targetTypes = targetTypes.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceRulesSourceList]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceRulesSourceListMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceRulesSourceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneratedRulesType(value: String): Self = StObject.set(x, "generatedRulesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypes(value: js.Array[String]): Self = StObject.set(x, "targetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypesVarargs(value: String*): Self = StObject.set(x, "targetTypes", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
