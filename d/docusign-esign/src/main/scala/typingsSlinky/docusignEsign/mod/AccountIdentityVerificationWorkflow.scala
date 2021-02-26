package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdentityVerificationWorkflow extends StObject {
  
  /**
    * Text describing the purpose of the Identity Verification workflow.
    */
  var defaultDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the Identity Verification workflow.
    */
  var defaultName: js.UndefOr[String] = js.native
  
  var inputOptions: js.UndefOr[js.Array[AccountIdentityInputOption]] = js.native
  
  /**
    * The signature provider associated with the Identity Verification workflow.
    */
  var signatureProvider: js.UndefOr[AccountSignatureProvider] = js.native
  
  /**
    * Workflow unique ID</br>This is the ID you must specify when setting ID Verification in an envelope using the `identityVerification`
    * [core recipient parameter](https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipients#core-recipient-parameters)
    */
  var workflowId: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var workflowResourceKey: js.UndefOr[String] = js.native
}
object AccountIdentityVerificationWorkflow {
  
  @scala.inline
  def apply(): AccountIdentityVerificationWorkflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityVerificationWorkflow]
  }
  
  @scala.inline
  implicit class AccountIdentityVerificationWorkflowMutableBuilder[Self <: AccountIdentityVerificationWorkflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDescription(value: String): Self = StObject.set(x, "defaultDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDescriptionUndefined: Self = StObject.set(x, "defaultDescription", js.undefined)
    
    @scala.inline
    def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
    
    @scala.inline
    def setInputOptions(value: js.Array[AccountIdentityInputOption]): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    @scala.inline
    def setInputOptionsVarargs(value: AccountIdentityInputOption*): Self = StObject.set(x, "inputOptions", js.Array(value :_*))
    
    @scala.inline
    def setSignatureProvider(value: AccountSignatureProvider): Self = StObject.set(x, "signatureProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProviderUndefined: Self = StObject.set(x, "signatureProvider", js.undefined)
    
    @scala.inline
    def setWorkflowId(value: String): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
    
    @scala.inline
    def setWorkflowResourceKey(value: String): Self = StObject.set(x, "workflowResourceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowResourceKeyUndefined: Self = StObject.set(x, "workflowResourceKey", js.undefined)
  }
}
