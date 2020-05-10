package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEmail extends js.Object {
  /**
    * The body of the email message, in HTML format. We recommend using HTML format for email clients that render HTML content. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[SimpleEmailPart] = js.native
  /**
    * The subject line, or title, of the email.
    */
  var Subject: js.UndefOr[SimpleEmailPart] = js.native
  /**
    * The body of the email message, in plain text format. We recommend using plain text format for email clients that don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[SimpleEmailPart] = js.native
}

object SimpleEmail {
  @scala.inline
  def apply(): SimpleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleEmail]
  }
  @scala.inline
  implicit class SimpleEmailOps[Self <: SimpleEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlPart(value: SimpleEmailPart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlPart")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: SimpleEmailPart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPart(value: SimpleEmailPart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPart")(js.undefined)
        ret
    }
  }
  
}

