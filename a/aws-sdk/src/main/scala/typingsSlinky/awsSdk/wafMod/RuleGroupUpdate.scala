package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupUpdate extends StObject {
  
  /**
    * Specify INSERT to add an ActivatedRule to a RuleGroup. Use DELETE to remove an ActivatedRule from a RuleGroup.
    */
  var Action: ChangeAction = js.native
  
  /**
    * The ActivatedRule object specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
    */
  var ActivatedRule: typingsSlinky.awsSdk.wafMod.ActivatedRule = js.native
}
object RuleGroupUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, ActivatedRule: ActivatedRule): RuleGroupUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActivatedRule = ActivatedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupUpdate]
  }
  
  @scala.inline
  implicit class RuleGroupUpdateMutableBuilder[Self <: RuleGroupUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedRule(value: ActivatedRule): Self = StObject.set(x, "ActivatedRule", value.asInstanceOf[js.Any])
  }
}
