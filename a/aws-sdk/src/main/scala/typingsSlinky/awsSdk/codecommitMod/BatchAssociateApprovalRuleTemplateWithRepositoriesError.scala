package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateApprovalRuleTemplateWithRepositoriesError extends StObject {
  
  /**
    * An error code that specifies whether the repository name was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  
  /**
    * An error message that provides details about why the repository name was not found or not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The name of the repository where the association was not made.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object BatchAssociateApprovalRuleTemplateWithRepositoriesError {
  
  @scala.inline
  def apply(): BatchAssociateApprovalRuleTemplateWithRepositoriesError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesError]
  }
  
  @scala.inline
  implicit class BatchAssociateApprovalRuleTemplateWithRepositoriesErrorMutableBuilder[Self <: BatchAssociateApprovalRuleTemplateWithRepositoriesError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
