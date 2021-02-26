package typingsSlinky.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatelessRulesAndCustomActions extends StObject {
  
  /**
    * Defines an array of individual custom action definitions that are available for use by the stateless rules in this StatelessRulesAndCustomActions specification. You name each custom action that you define, and then you can use it by name in your StatelessRule RuleDefinition Actions specification.
    */
  var CustomActions: js.UndefOr[typingsSlinky.awsSdk.networkfirewallMod.CustomActions] = js.native
  
  /**
    * Defines the set of stateless rules for use in a stateless rule group. 
    */
  var StatelessRules: typingsSlinky.awsSdk.networkfirewallMod.StatelessRules = js.native
}
object StatelessRulesAndCustomActions {
  
  @scala.inline
  def apply(StatelessRules: StatelessRules): StatelessRulesAndCustomActions = {
    val __obj = js.Dynamic.literal(StatelessRules = StatelessRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessRulesAndCustomActions]
  }
  
  @scala.inline
  implicit class StatelessRulesAndCustomActionsMutableBuilder[Self <: StatelessRulesAndCustomActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomActions(value: CustomActions): Self = StObject.set(x, "CustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomActionsUndefined: Self = StObject.set(x, "CustomActions", js.undefined)
    
    @scala.inline
    def setCustomActionsVarargs(value: CustomAction*): Self = StObject.set(x, "CustomActions", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRules(value: StatelessRules): Self = StObject.set(x, "StatelessRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessRulesVarargs(value: StatelessRule*): Self = StObject.set(x, "StatelessRules", js.Array(value :_*))
  }
}
