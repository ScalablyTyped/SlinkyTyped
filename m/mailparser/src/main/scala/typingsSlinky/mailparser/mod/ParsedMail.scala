package typingsSlinky.mailparser.mod

import typingsSlinky.mailparser.mailparserBooleans.`false`
import typingsSlinky.mailparser.mailparserStrings.high
import typingsSlinky.mailparser.mailparserStrings.low
import typingsSlinky.mailparser.mailparserStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parsed mail object.
  */
@js.native
trait ParsedMail extends js.Object {
  /**
  	 * An array of attachments.
  	 */
  var attachments: js.Array[Attachment] = js.native
  /**
  	 * An address object for the `Bcc:` header (usually not present).
  	 */
  var bcc: js.UndefOr[AddressObject] = js.native
  /**
  	 * An address object for the `Cc:` header.
  	 */
  var cc: js.UndefOr[AddressObject] = js.native
  /**
  	 * A Date object for the `Date:` header.
  	 */
  var date: js.UndefOr[js.Date] = js.native
  /**
  	 * An address object for the `From:` header.
  	 */
  var from: js.UndefOr[AddressObject] = js.native
  /**
  	 * An array of raw header lines
  	 */
  var headerLines: HeaderLines = js.native
  /**
  	 * A Map object with lowercase header keys.
  	 *
  	 * - All address headers are converted into address objects.
  	 * - `references` is a string if only a single reference-id exists or an
  	 *    array if multiple ids exist.
  	 * - `date` value is a Date object.
  	 */
  var headers: Headers = js.native
  /**
  	 * The HTML body of the message.
  	 *
  	 * Sets to `false` when there is no HTML body.
  	 *
  	 * If the message included embedded images as cid: urls then these are all
  	 * replaced with base64 formatted data: URIs.
  	 */
  var html: String | `false` = js.native
  /**
  	 * The In-Reply-To value string.
  	 */
  var inReplyTo: js.UndefOr[String] = js.native
  /**
  	 * The Message-ID value string.
  	 */
  var messageId: js.UndefOr[String] = js.native
  /**
  	 * Priority of the e-mail.
  	 */
  var priority: js.UndefOr[normal | low | high] = js.native
  /**
  	 * An array of referenced Message-ID values.
  	 *
  	 * Not set if no reference values present.
  	 */
  var references: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * An address object for the `Reply-To:` header.
  	 */
  var replyTo: js.UndefOr[AddressObject] = js.native
  /**
  	 * The subject line.
  	 */
  var subject: js.UndefOr[String] = js.native
  /**
  	 * The plaintext body of the message.
  	 */
  var text: js.UndefOr[String] = js.native
  /**
  	 * The plaintext body of the message formatted as HTML.
  	 */
  var textAsHtml: js.UndefOr[String] = js.native
  /**
  	 * An address object for the `To:` header.
  	 */
  var to: js.UndefOr[AddressObject] = js.native
}

object ParsedMail {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment],
    headerLines: HeaderLines,
    headers: Headers,
    html: String | `false`
  ): ParsedMail = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedMail]
  }
  @scala.inline
  implicit class ParsedMailOps[Self <: ParsedMail] (val x: Self) extends AnyVal {
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
    def withHeaderLines(value: HeaderLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBcc(value: AddressObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(js.undefined)
        ret
    }
    @scala.inline
    def withCc(value: AddressObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
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
    def withFrom(value: AddressObject): Self = {
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
    def withInReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inReplyTo")(js.undefined)
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
    def withPriority(value: normal | low | high): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: AddressObject): Self = {
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAsHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAsHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAsHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAsHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: AddressObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

