package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApprovalRuleTemplateContentOutput extends StObject {
  
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}
object UpdateApprovalRuleTemplateContentOutput {
  
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateContentOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateContentOutput]
  }
  
  @scala.inline
  implicit class UpdateApprovalRuleTemplateContentOutputMutableBuilder[Self <: UpdateApprovalRuleTemplateContentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
