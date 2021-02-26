package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociatedApprovalRuleTemplatesForRepositoryOutput extends StObject {
  
  /**
    * The names of all approval rule templates associated with the repository.
    */
  var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList] = js.native
  
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAssociatedApprovalRuleTemplatesForRepositoryOutput {
  
  @scala.inline
  def apply(): ListAssociatedApprovalRuleTemplatesForRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedApprovalRuleTemplatesForRepositoryOutput]
  }
  
  @scala.inline
  implicit class ListAssociatedApprovalRuleTemplatesForRepositoryOutputMutableBuilder[Self <: ListAssociatedApprovalRuleTemplatesForRepositoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateNames(value: ApprovalRuleTemplateNameList): Self = StObject.set(x, "approvalRuleTemplateNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleTemplateNamesUndefined: Self = StObject.set(x, "approvalRuleTemplateNames", js.undefined)
    
    @scala.inline
    def setApprovalRuleTemplateNamesVarargs(value: ApprovalRuleTemplateName*): Self = StObject.set(x, "approvalRuleTemplateNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
