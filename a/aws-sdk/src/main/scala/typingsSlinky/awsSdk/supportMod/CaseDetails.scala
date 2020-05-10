package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseDetails extends js.Object {
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
  /**
    * The category of problem for the AWS Support case.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.native
  /**
    * The email addresses that receive copies of communication about the case.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.native
  /**
    * The ID displayed for the case in the AWS Support Center. This is a numeric string.
    */
  var displayId: js.UndefOr[DisplayId] = js.native
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to the communications. Also includes a nextToken that you can use to retrieve earlier communications.
    */
  var recentCommunications: js.UndefOr[RecentCaseCommunications] = js.native
  /**
    * The code for the AWS service. You can get a list of codes and the corresponding service names by calling DescribeServices.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.native
  /**
    * The code for the severity level returned by the call to DescribeSeverityLevels.
    */
  var severityCode: js.UndefOr[SeverityCode] = js.native
  /**
    * The status of the case. Valid values: resolved | pending-customer-action | opened | unassigned | work-in-progress.
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The subject line for the case in the AWS Support Center.
    */
  var subject: js.UndefOr[Subject] = js.native
  /**
    * The email address of the account that submitted the case.
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.native
  /**
    * The time that the case was case created in the AWS Support Center.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.native
}

object CaseDetails {
  @scala.inline
  def apply(): CaseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseDetails]
  }
  @scala.inline
  implicit class CaseDetailsOps[Self <: CaseDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDisplayId(value: DisplayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayId")(js.undefined)
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
    def withRecentCommunications(value: RecentCaseCommunications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentCommunications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentCommunications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentCommunications")(js.undefined)
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
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Subject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
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

