package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Communication extends js.Object {
  /**
    * Information about the attachments to the case communication.
    */
  var attachmentSet: js.UndefOr[AttachmentSet] = js.native
  /**
    * The text of the communication between the customer and AWS Support.
    */
  var body: js.UndefOr[CommunicationBody] = js.native
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
  /**
    * The identity of the account that submitted, or responded to, the support case. Customer entries include the role or IAM user as well as the email address. For example, "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "Amazon Web Services," and do not show an email address. 
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.native
  /**
    * The time the communication was created.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.native
}

object Communication {
  @scala.inline
  def apply(): Communication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Communication]
  }
  @scala.inline
  implicit class CommunicationOps[Self <: Communication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentSet(value: AttachmentSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentSet")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: CommunicationBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
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
    def withSubmittedBy(value: SubmittedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCreated(value: TimeCreated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(js.undefined)
        ret
    }
  }
  
}

