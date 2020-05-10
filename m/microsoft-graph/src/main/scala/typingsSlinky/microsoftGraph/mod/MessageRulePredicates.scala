package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRulePredicates extends js.Object {
  /**
    * Represents the strings that should appear in the body of an incoming message in order for the condition or exception to
    * apply.
    */
  var bodyContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the strings that should appear in the body or subject of an incoming message in order for the condition or
    * exception to apply.
    */
  var bodyOrSubjectContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the categories that an incoming message should be labeled with in order for the condition or exception to
    * apply.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  // Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
  var fromAddresses: js.UndefOr[js.Array[Recipient]] = js.native
  // Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  /**
    * Represents the strings that appear in the headers of an incoming message in order for the condition or exception to
    * apply.
    */
  var headerContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal,
    * high.
    */
  var importance: js.UndefOr[Importance] = js.native
  // Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
  var isApprovalRequest: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
  var isAutomaticForward: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
  var isAutomaticReply: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
  var isEncrypted: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
  var isMeetingRequest: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
  var isMeetingResponse: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
  var isNonDeliveryReport: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or
    * exception to apply.
    */
  var isPermissionControlled: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
  var isReadReceipt: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
  var isSigned: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
  var isVoicemail: js.UndefOr[Boolean] = js.native
  /**
    * Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to
    * apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply,
    * replyToAll, review.
    */
  var messageActionFlag: js.UndefOr[MessageActionFlag] = js.native
  /**
    * Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or
    * exception to apply.
    */
  var notSentToMe: js.UndefOr[Boolean] = js.native
  /**
    * Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in
    * order for the condition or exception to apply.
    */
  var recipientContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the strings that appear in the from property of an incoming message in order for the condition or exception
    * to apply.
    */
  var senderContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to
    * apply. The possible values are: normal, personal, private, confidential.
    */
  var sensitivity: js.UndefOr[Sensitivity] = js.native
  /**
    * Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentCcMe: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition
    * or exception to apply.
    */
  var sentOnlyToMe: js.UndefOr[Boolean] = js.native
  /**
    * Represents the email addresses that an incoming message must have been sent to in order for the condition or exception
    * to apply.
    */
  var sentToAddresses: js.UndefOr[js.Array[Recipient]] = js.native
  /**
    * Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentToMe: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming
    * message in order for the condition or exception to apply.
    */
  var sentToOrCcMe: js.UndefOr[Boolean] = js.native
  /**
    * Represents the strings that appear in the subject of an incoming message in order for the condition or exception to
    * apply.
    */
  var subjectContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the
    * condition or exception to apply.
    */
  var withinSizeRange: js.UndefOr[SizeRange] = js.native
}

object MessageRulePredicates {
  @scala.inline
  def apply(): MessageRulePredicates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRulePredicates]
  }
  @scala.inline
  implicit class MessageRulePredicatesOps[Self <: MessageRulePredicates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyContains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContains")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyOrSubjectContains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyOrSubjectContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyOrSubjectContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyOrSubjectContains")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withFromAddresses(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderContains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContains")(js.undefined)
        ret
    }
    @scala.inline
    def withImportance(value: Importance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(js.undefined)
        ret
    }
    @scala.inline
    def withIsApprovalRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isApprovalRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsApprovalRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isApprovalRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAutomaticForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutomaticForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAutomaticForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutomaticForward")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAutomaticReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutomaticReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAutomaticReply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutomaticReply")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMeetingRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeetingRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMeetingRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeetingRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMeetingResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeetingResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMeetingResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeetingResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNonDeliveryReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNonDeliveryReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNonDeliveryReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNonDeliveryReport")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPermissionControlled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPermissionControlled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPermissionControlled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPermissionControlled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReadReceipt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadReceipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReadReceipt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadReceipt")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSigned")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVoicemail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVoicemail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVoicemail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVoicemail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageActionFlag(value: MessageActionFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageActionFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageActionFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageActionFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withNotSentToMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSentToMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotSentToMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSentToMe")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientContains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientContains")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderContains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderContains")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitivity(value: Sensitivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withSentCcMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentCcMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentCcMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentCcMe")(js.undefined)
        ret
    }
    @scala.inline
    def withSentOnlyToMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentOnlyToMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentOnlyToMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentOnlyToMe")(js.undefined)
        ret
    }
    @scala.inline
    def withSentToAddresses(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentToAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentToAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentToAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSentToMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentToMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentToMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentToMe")(js.undefined)
        ret
    }
    @scala.inline
    def withSentToOrCcMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentToOrCcMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentToOrCcMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentToOrCcMe")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectContains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectContains")(js.undefined)
        ret
    }
    @scala.inline
    def withWithinSizeRange(value: SizeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSizeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithinSizeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSizeRange")(js.undefined)
        ret
    }
  }
  
}

