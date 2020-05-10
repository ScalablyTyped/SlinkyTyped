package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCaseRequest extends js.Object {
  /**
    * The ID of a set of one or more attachments for the case. Create the set by using AddAttachmentsToSet.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * The category of problem for the AWS Support case.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.native
  /**
    * A list of email addresses that AWS Support copies on case correspondence.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.native
  /**
    * The communication body text when you create an AWS Support case by calling CreateCase.
    */
  var communicationBody: CommunicationBody = js.native
  /**
    * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."  Service limit increases are not supported by the Support API; you must submit service limit increase requests in Support Center. 
    */
  var issueType: js.UndefOr[IssueType] = js.native
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The code for the AWS service returned by the call to DescribeServices.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.native
  /**
    * The code for the severity level returned by the call to DescribeSeverityLevels.  The availability of severity levels depends on the support plan for the account. 
    */
  var severityCode: js.UndefOr[SeverityCode] = js.native
  /**
    * The title of the AWS Support case.
    */
  var subject: Subject = js.native
}

object CreateCaseRequest {
  @scala.inline
  def apply(communicationBody: CommunicationBody, subject: Subject): CreateCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseRequest]
  }
  @scala.inline
  implicit class CreateCaseRequestOps[Self <: CreateCaseRequest] (val x: Self) extends AnyVal {
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
    def withSubject(value: Subject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
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
    def withCategoryCode(value: CategoryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryCode")(js.undefined)
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
    @scala.inline
    def withIssueType(value: IssueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueType")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCode(value: ServiceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityCode(value: SeverityCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityCode")(js.undefined)
        ret
    }
  }
  
}

