package typingsSlinky.mailgunJs.mod.messages

import typingsSlinky.mailgunJs.mailgunJsStrings.False
import typingsSlinky.mailgunJs.mailgunJsStrings.True
import typingsSlinky.mailgunJs.mailgunJsStrings.false_
import typingsSlinky.mailgunJs.mailgunJsStrings.htmlonly
import typingsSlinky.mailgunJs.mailgunJsStrings.no
import typingsSlinky.mailgunJs.mailgunJsStrings.true_
import typingsSlinky.mailgunJs.mailgunJsStrings.yes
import typingsSlinky.mailgunJs.mod.AttachmentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendData extends js.Object {
  var `amp-html`: js.UndefOr[String] = js.native
  var attachment: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.native
  var bcc: js.UndefOr[String | js.Array[String]] = js.native
  var cc: js.UndefOr[String | js.Array[String]] = js.native
  var from: js.UndefOr[String] = js.native
  @JSName("h:Importance")
  var hColonImportance: js.UndefOr[String] = js.native
  @JSName("h:In-Reply-To")
  var `hColonIn-Reply-To`: js.UndefOr[String] = js.native
  @JSName("h:References")
  var hColonReferences: js.UndefOr[String] = js.native
  // Standard email headers
  @JSName("h:Reply-To")
  var `hColonReply-To`: js.UndefOr[String] = js.native
  var html: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.native
  @JSName("o:deliverytime")
  var oColondeliverytime: js.UndefOr[String] = js.native
  @JSName("o:dkim")
  var oColondkim: js.UndefOr[yes | no | Boolean] = js.native
  @JSName("o:require-tls")
  var `oColonrequire-tls`: js.UndefOr[yes | no | True | False] = js.native
  @JSName("o:skip-verification")
  var `oColonskip-verification`: js.UndefOr[yes | no | True | False] = js.native
  @JSName("o:tag")
  var oColontag: js.UndefOr[String | js.Array[String]] = js.native
  // Mailgun options
  @JSName("o:testmode")
  var oColontestmode: js.UndefOr[yes | no | true_ | false_ | True | False] = js.native
  @JSName("o:tracking")
  var oColontracking: js.UndefOr[yes | no | Boolean] = js.native
  @JSName("o:tracking-clicks")
  var `oColontracking-clicks`: js.UndefOr[yes | no | htmlonly | Boolean] = js.native
  @JSName("o:tracking-opens")
  var `oColontracking-opens`: js.UndefOr[yes | no | Boolean] = js.native
  var subject: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var to: String | js.Array[String] = js.native
}

object SendData {
  @scala.inline
  def apply(to: String | js.Array[String]): SendData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendData]
  }
  @scala.inline
  implicit class SendDataOps[Self <: SendData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTo(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAmp-html`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp-html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAmp-html`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp-html")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachment(value: AttachmentData | js.Array[AttachmentData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(js.undefined)
        ret
    }
    @scala.inline
    def withBcc(value: String | js.Array[String]): Self = {
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
    def withCc(value: String | js.Array[String]): Self = {
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
    def withFrom(value: String): Self = {
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
    def withHColonImportance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:Importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHColonImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:Importance")(js.undefined)
        ret
    }
    @scala.inline
    def `withHColonIn-Reply-To`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:In-Reply-To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHColonIn-Reply-To`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:In-Reply-To")(js.undefined)
        ret
    }
    @scala.inline
    def withHColonReferences(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:References")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHColonReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:References")(js.undefined)
        ret
    }
    @scala.inline
    def `withHColonReply-To`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:Reply-To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHColonReply-To`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h:Reply-To")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
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
    def withInline(value: AttachmentData | js.Array[AttachmentData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withOColondeliverytime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:deliverytime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOColondeliverytime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:deliverytime")(js.undefined)
        ret
    }
    @scala.inline
    def withOColondkim(value: yes | no | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:dkim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOColondkim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:dkim")(js.undefined)
        ret
    }
    @scala.inline
    def `withOColonrequire-tls`(value: yes | no | True | False): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:require-tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOColonrequire-tls`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:require-tls")(js.undefined)
        ret
    }
    @scala.inline
    def `withOColonskip-verification`(value: yes | no | True | False): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:skip-verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOColonskip-verification`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:skip-verification")(js.undefined)
        ret
    }
    @scala.inline
    def withOColontag(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOColontag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tag")(js.undefined)
        ret
    }
    @scala.inline
    def withOColontestmode(value: yes | no | true_ | false_ | True | False): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:testmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOColontestmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:testmode")(js.undefined)
        ret
    }
    @scala.inline
    def withOColontracking(value: yes | no | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOColontracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tracking")(js.undefined)
        ret
    }
    @scala.inline
    def `withOColontracking-clicks`(value: yes | no | htmlonly | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tracking-clicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOColontracking-clicks`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tracking-clicks")(js.undefined)
        ret
    }
    @scala.inline
    def `withOColontracking-opens`(value: yes | no | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tracking-opens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOColontracking-opens`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o:tracking-opens")(js.undefined)
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
  }
  
}

