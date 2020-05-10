package typingsSlinky.reactNativeMail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttachment extends js.Object {
  var attachment: js.UndefOr[AnonName] = js.native
  var bccRecipients: js.UndefOr[js.Array[String]] = js.native
  var body: String = js.native
  var ccRecipients: js.UndefOr[js.Array[String]] = js.native
  var isHTML: Boolean = js.native
  var recipients: js.UndefOr[js.Array[String]] = js.native
  var subject: String = js.native
}

object AnonAttachment {
  @scala.inline
  def apply(body: String, isHTML: Boolean, subject: String): AnonAttachment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isHTML = isHTML.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachment]
  }
  @scala.inline
  implicit class AnonAttachmentOps[Self <: AnonAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachment(value: AnonName): Self = {
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
    def withBccRecipients(value: js.Array[String]): Self = {
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
    def withCcRecipients(value: js.Array[String]): Self = {
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
    def withRecipients(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
        ret
    }
  }
  
}

