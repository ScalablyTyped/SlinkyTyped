package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientDsnFields extends StObject {
  
  /**
    * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message to the recipient address. This is required by RFC 3464.
    */
  var Action: DsnAction = js.native
  
  /**
    * An extended explanation of what went wrong; this is usually an SMTP response. See RFC 3463 for the correct formatting of this parameter.
    */
  var DiagnosticCode: js.UndefOr[typingsSlinky.awsSdk.sesMod.DiagnosticCode] = js.native
  
  /**
    * Additional X-headers to include in the DSN.
    */
  var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.native
  
  /**
    * The email address that the message was ultimately delivered to. This corresponds to the Final-Recipient in the DSN. If not specified, FinalRecipient will be set to the Recipient specified in the BouncedRecipientInfo structure. Either FinalRecipient or the recipient in BouncedRecipientInfo must be a recipient of the original bounced message.  Do not prepend the FinalRecipient email address with rfc 822;, as described in RFC 3798. 
    */
  var FinalRecipient: js.UndefOr[Address] = js.native
  
  /**
    * The time the final delivery attempt was made, in RFC 822 date-time format.
    */
  var LastAttemptDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). This parameter typically applies only to propagating synchronous bounces.
    */
  var RemoteMta: js.UndefOr[typingsSlinky.awsSdk.sesMod.RemoteMta] = js.native
  
  /**
    * The status code that indicates what went wrong. This is required by RFC 3464.
    */
  var Status: DsnStatus = js.native
}
object RecipientDsnFields {
  
  @scala.inline
  def apply(Action: DsnAction, Status: DsnStatus): RecipientDsnFields = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientDsnFields]
  }
  
  @scala.inline
  implicit class RecipientDsnFieldsMutableBuilder[Self <: RecipientDsnFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: DsnAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticCode(value: DiagnosticCode): Self = StObject.set(x, "DiagnosticCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticCodeUndefined: Self = StObject.set(x, "DiagnosticCode", js.undefined)
    
    @scala.inline
    def setExtensionFields(value: ExtensionFieldList): Self = StObject.set(x, "ExtensionFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionFieldsUndefined: Self = StObject.set(x, "ExtensionFields", js.undefined)
    
    @scala.inline
    def setExtensionFieldsVarargs(value: ExtensionField*): Self = StObject.set(x, "ExtensionFields", js.Array(value :_*))
    
    @scala.inline
    def setFinalRecipient(value: Address): Self = StObject.set(x, "FinalRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalRecipientUndefined: Self = StObject.set(x, "FinalRecipient", js.undefined)
    
    @scala.inline
    def setLastAttemptDate(value: js.Date): Self = StObject.set(x, "LastAttemptDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAttemptDateUndefined: Self = StObject.set(x, "LastAttemptDate", js.undefined)
    
    @scala.inline
    def setRemoteMta(value: RemoteMta): Self = StObject.set(x, "RemoteMta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteMtaUndefined: Self = StObject.set(x, "RemoteMta", js.undefined)
    
    @scala.inline
    def setStatus(value: DsnStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
