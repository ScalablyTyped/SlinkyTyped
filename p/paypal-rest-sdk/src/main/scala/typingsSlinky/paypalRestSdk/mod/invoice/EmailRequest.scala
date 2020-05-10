package typingsSlinky.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailRequest extends js.Object {
  var cc_emails: js.UndefOr[js.Array[String]] = js.native
  var note: js.UndefOr[String] = js.native
  var send_to_merchant: js.UndefOr[Boolean] = js.native
  var send_to_payer: js.UndefOr[Boolean] = js.native
  var subject: js.UndefOr[String] = js.native
}

object EmailRequest {
  @scala.inline
  def apply(): EmailRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailRequest]
  }
  @scala.inline
  implicit class EmailRequestOps[Self <: EmailRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCc_emails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc_emails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_emails")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_to_merchant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_to_merchant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_to_merchant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_to_merchant")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_to_payer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_to_payer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_to_payer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_to_payer")(js.undefined)
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
  }
  
}

