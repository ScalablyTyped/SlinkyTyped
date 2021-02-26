package typingsSlinky.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddCommunicationToCaseRequest extends StObject {
  
  /**
    * The ID of a set of one or more attachments for the communication to add to the case. Create the set by calling AddAttachmentsToSet 
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
  
  /**
    * The email addresses in the CC line of an email to be added to the support case.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.native
  
  /**
    * The body of an email communication to add to the support case.
    */
  var communicationBody: CommunicationBody = js.native
}
object AddCommunicationToCaseRequest {
  
  @scala.inline
  def apply(communicationBody: CommunicationBody): AddCommunicationToCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCommunicationToCaseRequest]
  }
  
  @scala.inline
  implicit class AddCommunicationToCaseRequestMutableBuilder[Self <: AddCommunicationToCaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentSetId(value: AttachmentSetId): Self = StObject.set(x, "attachmentSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentSetIdUndefined: Self = StObject.set(x, "attachmentSetId", js.undefined)
    
    @scala.inline
    def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
    
    @scala.inline
    def setCcEmailAddresses(value: CcEmailAddressList): Self = StObject.set(x, "ccEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcEmailAddressesUndefined: Self = StObject.set(x, "ccEmailAddresses", js.undefined)
    
    @scala.inline
    def setCcEmailAddressesVarargs(value: CcEmailAddress*): Self = StObject.set(x, "ccEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setCommunicationBody(value: CommunicationBody): Self = StObject.set(x, "communicationBody", value.asInstanceOf[js.Any])
  }
}
