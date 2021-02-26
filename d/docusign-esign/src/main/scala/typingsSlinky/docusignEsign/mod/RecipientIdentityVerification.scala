package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientIdentityVerification extends StObject {
  
  var inputOptions: js.UndefOr[js.Array[RecipientIdentityInputOption]] = js.native
  
  /**
    * ID of the Identity Verification worklow used to verify recipients' identity. </br> This ID must match one of the [workflowId]
    * (https://developers.docusign.com/esign-rest-api/reference/Accounts/IdentityVerifications/list#accountIdentityVerificationWorkflow) available to your account.
    */
  var workflowId: js.UndefOr[String] = js.native
}
object RecipientIdentityVerification {
  
  @scala.inline
  def apply(): RecipientIdentityVerification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityVerification]
  }
  
  @scala.inline
  implicit class RecipientIdentityVerificationMutableBuilder[Self <: RecipientIdentityVerification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputOptions(value: js.Array[RecipientIdentityInputOption]): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    @scala.inline
    def setInputOptionsVarargs(value: RecipientIdentityInputOption*): Self = StObject.set(x, "inputOptions", js.Array(value :_*))
    
    @scala.inline
    def setWorkflowId(value: String): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
  }
}
