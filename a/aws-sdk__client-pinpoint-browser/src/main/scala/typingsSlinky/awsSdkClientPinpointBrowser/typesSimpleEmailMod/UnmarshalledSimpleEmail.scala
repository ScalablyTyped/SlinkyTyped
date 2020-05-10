package typingsSlinky.awsSdkClientPinpointBrowser.typesSimpleEmailMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSimpleEmailPartMod.UnmarshalledSimpleEmailPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSimpleEmail extends SimpleEmail {
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  @JSName("HtmlPart")
  var HtmlPart_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.native
  /**
    * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
    */
  @JSName("Subject")
  var Subject_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.native
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  @JSName("TextPart")
  var TextPart_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.native
}

object UnmarshalledSimpleEmail {
  @scala.inline
  def apply(): UnmarshalledSimpleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSimpleEmail]
  }
  @scala.inline
  implicit class UnmarshalledSimpleEmailOps[Self <: UnmarshalledSimpleEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlPart(value: UnmarshalledSimpleEmailPart): Self = {
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
    def withSubject(value: UnmarshalledSimpleEmailPart): Self = {
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
    def withTextPart(value: UnmarshalledSimpleEmailPart): Self = {
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

