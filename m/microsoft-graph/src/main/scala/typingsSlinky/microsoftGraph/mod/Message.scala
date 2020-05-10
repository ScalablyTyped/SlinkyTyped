package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends OutlookItem {
  // The fileAttachment and itemAttachment attachments for the message.
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  // The Bcc: recipients for the message.
  var bccRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  // The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
  var body: js.UndefOr[ItemBody] = js.native
  // The first 255 characters of the message body. It is in text format.
  var bodyPreview: js.UndefOr[String] = js.native
  // The Cc: recipients for the message.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  // The ID of the conversation the email belongs to.
  var conversationId: js.UndefOr[String] = js.native
  // The collection of open extensions defined for the message. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // The flag value that indicates the status, start date, due date, or completion date for the message.
  var flag: js.UndefOr[FollowupFlag] = js.native
  /**
    * The mailbox owner and sender of the message. The value must correspond to the actual mailbox used. Find out more about
    * setting the from and sender properties of a message.
    */
  var from: js.UndefOr[Recipient] = js.native
  /**
    * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message
    * contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body
    * property to look for a src attribute, such as &amp;lt;IMG src='cid:image001.jpg@01D26CD8.6C05F070'&amp;gt;.
    */
  var hasAttachments: js.UndefOr[Boolean] = js.native
  // The importance of the message: Low, Normal, High.
  var importance: js.UndefOr[Importance] = js.native
  /**
    * The classification of the message for the user, based on inferred relevance or importance, or on an explicit override.
    * The possible values are: focused or other.
    */
  var inferenceClassification: js.UndefOr[InferenceClassificationType] = js.native
  /**
    * A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken
    * by a message from the sender to the recipient. It can also contain custom message headers that hold app data for the
    * message. Returned only on applying a $select query option. Read-only.
    */
  var internetMessageHeaders: js.UndefOr[js.Array[InternetMessageHeader]] = js.native
  // The message ID in the format specified by RFC2822.
  var internetMessageId: js.UndefOr[String] = js.native
  // Indicates whether a read receipt is requested for the message.
  var isDeliveryReceiptRequested: js.UndefOr[Boolean] = js.native
  // Indicates whether the message is a draft. A message is a draft if it hasn't been sent yet.
  var isDraft: js.UndefOr[Boolean] = js.native
  // Indicates whether the message has been read.
  var isRead: js.UndefOr[Boolean] = js.native
  // Indicates whether a read receipt is requested for the message.
  var isReadReceiptRequested: js.UndefOr[Boolean] = js.native
  // The collection of multi-value extended properties defined for the message. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The unique identifier for the message's parent mailFolder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The date and time the message was received.
  var receivedDateTime: js.UndefOr[String] = js.native
  // The email addresses to use when replying.
  var replyTo: js.UndefOr[js.Array[Recipient]] = js.native
  /**
    * The account that is actually used to generate the message. In most cases, this value is the same as the from property.
    * You can set this property to a different value when sending a message from a shared mailbox, or sending a message as a
    * delegate. In any case, the value must correspond to the actual mailbox used. Find out more about setting the from and
    * sender properties of a message.
    */
  var sender: js.UndefOr[Recipient] = js.native
  // The date and time the message was sent.
  var sentDateTime: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the message. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The subject of the message.
  var subject: js.UndefOr[String] = js.native
  // The To: recipients for the message.
  var toRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  /**
    * The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but
    * can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
    */
  var uniqueBody: js.UndefOr[ItemBody] = js.native
  /**
    * The URL to open the message in Outlook Web App.You can append an ispopout argument to the end of the URL to change how
    * the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout
    * window. If ispopout is set to 0, then the browser will show the message in the Outlook Web App review pane.The message
    * will open in the browser if you are logged in to your mailbox via Outlook Web App. You will be prompted to login if you
    * are not already logged in with the browser.This URL can be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[String] = js.native
}

object Message {
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBccRecipients(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bccRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBccRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bccRecipients")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: ItemBody): Self = {
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
    def withBodyPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withCcRecipients(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccRecipients")(js.undefined)
        ret
    }
    @scala.inline
    def withConversationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationId")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFlag(value: FollowupFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Recipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
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
    def withInferenceClassification(value: InferenceClassificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceClassification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferenceClassification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceClassification")(js.undefined)
        ret
    }
    @scala.inline
    def withInternetMessageHeaders(value: js.Array[InternetMessageHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetMessageHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternetMessageHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetMessageHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withInternetMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternetMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetMessageId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDeliveryReceiptRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeliveryReceiptRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeliveryReceiptRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeliveryReceiptRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraft")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReadReceiptRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadReceiptRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReadReceiptRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadReceiptRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFolderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSender(value: Recipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(js.undefined)
        ret
    }
    @scala.inline
    def withSentDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
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
    def withToRecipients(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRecipients")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueBody(value: ItemBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueBody")(js.undefined)
        ret
    }
    @scala.inline
    def withWebLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLink")(js.undefined)
        ret
    }
  }
  
}

