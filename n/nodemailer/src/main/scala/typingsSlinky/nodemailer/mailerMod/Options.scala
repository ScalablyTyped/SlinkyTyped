package typingsSlinky.nodemailer.mailerMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.nodemailer.nodemailerStrings.high
import typingsSlinky.nodemailer.nodemailerStrings.low
import typingsSlinky.nodemailer.nodemailerStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** An array of alternative text contents (in addition to text and html parts) */
  var alternatives: js.UndefOr[js.Array[Attachment]] = js.native
  /** AMP4EMAIL specific HTML version of the message, same usage as with text and html. Make sure it is a full and valid AMP4EMAIL document, otherwise the displaying email client falls back to html and ignores the amp part */
  var amp: js.UndefOr[String | Buffer | Readable | AmpAttachment] = js.native
  /** An array of attachment objects */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Bcc: field */
  var bcc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the Cc: field */
  var cc: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
  /** optional Date value, current UTC string will be used if not set */
  var date: js.UndefOr[js.Date | String] = js.native
  /** if set to true then fails with an error when a node tries to load content from a file */
  var disableFileAccess: js.UndefOr[Boolean] = js.native
  /** if set to true then fails with an error when a node tries to load content from URL */
  var disableUrlAccess: js.UndefOr[Boolean] = js.native
  /** is an object with DKIM options */
  var dkim: js.UndefOr[typingsSlinky.nodemailer.dkimMod.Options] = js.native
  /** optional transfer encoding for the textual parts */
  var encoding: js.UndefOr[String] = js.native
  /** optional SMTP envelope, if auto generated envelope is not suitable */
  var envelope: js.UndefOr[Envelope | typingsSlinky.nodemailer.mimeNodeMod.Envelope] = js.native
  /** The e-mail address of the sender. All e-mail addresses can be plain 'sender@server.com' or formatted 'Sender Name <sender@server.com>' */
  var from: js.UndefOr[String | Address] = js.native
  /** An object or array of additional header fields */
  var headers: js.UndefOr[Headers] = js.native
  /** The HTML version of the message */
  var html: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  /** iCalendar event, same usage as with text and html. Event method attribute defaults to ‘PUBLISH’ or define it yourself: {method: 'REQUEST', content: iCalString}. This value is added as an additional alternative to html or text. Only utf-8 content is allowed */
  var icalEvent: js.UndefOr[String | Buffer | Readable | IcalAttachment] = js.native
  /** The message-id this message is replying */
  var inReplyTo: js.UndefOr[String | Address] = js.native
  /** An object where key names are converted into list headers. List key help becomes List-Help header etc. */
  var list: js.UndefOr[ListHeaders] = js.native
  /** optional Message-Id value, random value will be generated if not set */
  var messageId: js.UndefOr[String] = js.native
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
  var priority: js.UndefOr[high | normal | low] = js.native
  /** if set then overwrites entire message output with this value. The value is not parsed, so you should still set address headers or the envelope value for the message to work */
  var raw: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  /** Message-id list (an array or space separated string) */
  var references: js.UndefOr[String | js.Array[String]] = js.native
  /** An e-mail address that will appear on the Reply-To: field */
  var replyTo: js.UndefOr[String | Address] = js.native
  /** An e-mail address that will appear on the Sender: field */
  var sender: js.UndefOr[String | Address] = js.native
  /** The subject of the e-mail */
  var subject: js.UndefOr[String] = js.native
  /** The plaintext version of the message */
  var text: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
  /** set explicitly which encoding to use for text parts (quoted-printable or base64). If not set then encoding is detected from text content (mostly ascii means quoted-printable, otherwise base64) */
  var textEncoding: js.UndefOr[TextEncoding] = js.native
  /** Comma separated list or an array of recipients e-mail addresses that will appear on the To: field */
  var to: js.UndefOr[String | Address | (js.Array[String | Address])] = js.native
  /** Apple Watch specific HTML version of the message, same usage as with text and html */
  var watchHtml: js.UndefOr[String | Buffer | Readable | AttachmentLike] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternatives(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withAmp(value: String | Buffer | Readable | AmpAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp")(js.undefined)
        ret
    }
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
    def withBcc(value: String | Address | (js.Array[String | Address])): Self = {
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
    def withCc(value: String | Address | (js.Array[String | Address])): Self = {
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
    def withDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date | String): Self = {
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
    def withDisableFileAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFileAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFileAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFileAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableUrlAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableUrlAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableUrlAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableUrlAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withDkim(value: typingsSlinky.nodemailer.dkimMod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvelope(value: Envelope | typingsSlinky.nodemailer.mimeNodeMod.Envelope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvelope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String | Address): Self = {
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
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String | Buffer | Readable | AttachmentLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withIcalEvent(value: String | Buffer | Readable | IcalAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcalEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icalEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withInReplyTo(value: String | Address): Self = {
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
    def withList(value: ListHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
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
    def withNormalizeHeaderKey(value: /* key */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalizeHeaderKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeHeaderKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: high | normal | low): Self = {
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
    def withRaw(value: String | Buffer | Readable | AttachmentLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: String | js.Array[String]): Self = {
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
    def withReplyTo(value: String | Address): Self = {
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
    def withSender(value: String | Address): Self = {
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
    def withText(value: String | Buffer | Readable | AttachmentLike): Self = {
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
    def withTextEncoding(value: TextEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String | Address | (js.Array[String | Address])): Self = {
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
    @scala.inline
    def withWatchHtml(value: String | Buffer | Readable | AttachmentLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchHtml")(js.undefined)
        ret
    }
  }
  
}

