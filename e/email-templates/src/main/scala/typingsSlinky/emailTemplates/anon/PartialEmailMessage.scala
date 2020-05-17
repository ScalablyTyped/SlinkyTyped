package typingsSlinky.emailTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<email-templates.email-templates.EmailMessage> */
@js.native
trait PartialEmailMessage extends js.Object {
  var html: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object PartialEmailMessage {
  @scala.inline
  def apply(): PartialEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEmailMessage]
  }
  @scala.inline
  implicit class PartialEmailMessageOps[Self <: PartialEmailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

