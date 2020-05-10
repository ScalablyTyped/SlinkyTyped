package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCommunicationToCaseRequest extends js.Object {
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
  implicit class AddCommunicationToCaseRequestOps[Self <: AddCommunicationToCaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommunicationBody(value: CommunicationBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communicationBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentSetId(value: AttachmentSetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseId(value: CaseId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseId")(js.undefined)
        ret
    }
    @scala.inline
    def withCcEmailAddresses(value: CcEmailAddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccEmailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccEmailAddresses")(js.undefined)
        ret
    }
  }
  
}

