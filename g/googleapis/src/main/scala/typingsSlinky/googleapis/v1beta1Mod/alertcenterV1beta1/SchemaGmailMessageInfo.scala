package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a message in phishing spike alert.
  */
@js.native
trait SchemaGmailMessageInfo extends js.Object {
  /**
    * The `SHA256` hash of email&#39;s attachment and all MIME parts.
    */
  var attachmentsSha256Hash: js.UndefOr[js.Array[String]] = js.native
  /**
    * The date the malicious email was sent.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * The hash of the message body text.
    */
  var md5HashMessageBody: js.UndefOr[String] = js.native
  /**
    * The MD5 Hash of email&#39;s subject (only available for reported emails).
    */
  var md5HashSubject: js.UndefOr[String] = js.native
  /**
    * The snippet of the message body text (only available for reported
    * emails).
    */
  var messageBodySnippet: js.UndefOr[String] = js.native
  /**
    * The message ID.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The recipient of this email.
    */
  var recipient: js.UndefOr[String] = js.native
  /**
    * The email subject text (only available for reported emails).
    */
  var subjectText: js.UndefOr[String] = js.native
}

object SchemaGmailMessageInfo {
  @scala.inline
  def apply(): SchemaGmailMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailMessageInfo]
  }
  @scala.inline
  implicit class SchemaGmailMessageInfoOps[Self <: SchemaGmailMessageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentsSha256Hash(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentsSha256Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentsSha256Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentsSha256Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5HashMessageBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5HashMessageBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5HashMessageBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5HashMessageBody")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5HashSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5HashSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5HashSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5HashSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageBodySnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBodySnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBodySnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBodySnippet")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectText")(js.undefined)
        ret
    }
  }
  
}

