package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Evaluation extends StObject {
  
  /**
    * The names of the approval rules that have not had their conditions met.
    */
  var approvalRulesNotSatisfied: js.UndefOr[ApprovalRulesNotSatisfiedList] = js.native
  
  /**
    * The names of the approval rules that have had their conditions met.
    */
  var approvalRulesSatisfied: js.UndefOr[ApprovalRulesSatisfiedList] = js.native
  
  /**
    * Whether the state of the pull request is approved.
    */
  var approved: js.UndefOr[Approved] = js.native
  
  /**
    * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
    */
  var overridden: js.UndefOr[Overridden] = js.native
}
object Evaluation {
  
  @scala.inline
  def apply(): Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evaluation]
  }
  
  @scala.inline
  implicit class EvaluationMutableBuilder[Self <: Evaluation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRulesNotSatisfied(value: ApprovalRulesNotSatisfiedList): Self = StObject.set(x, "approvalRulesNotSatisfied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRulesNotSatisfiedUndefined: Self = StObject.set(x, "approvalRulesNotSatisfied", js.undefined)
    
    @scala.inline
    def setApprovalRulesNotSatisfiedVarargs(value: ApprovalRuleName*): Self = StObject.set(x, "approvalRulesNotSatisfied", js.Array(value :_*))
    
    @scala.inline
    def setApprovalRulesSatisfied(value: ApprovalRulesSatisfiedList): Self = StObject.set(x, "approvalRulesSatisfied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRulesSatisfiedUndefined: Self = StObject.set(x, "approvalRulesSatisfied", js.undefined)
    
    @scala.inline
    def setApprovalRulesSatisfiedVarargs(value: ApprovalRuleName*): Self = StObject.set(x, "approvalRulesSatisfied", js.Array(value :_*))
    
    @scala.inline
    def setApproved(value: Approved): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    @scala.inline
    def setOverridden(value: Overridden): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverriddenUndefined: Self = StObject.set(x, "overridden", js.undefined)
  }
}
