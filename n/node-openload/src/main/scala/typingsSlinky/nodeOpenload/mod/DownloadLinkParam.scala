package typingsSlinky.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadLinkParam extends js.Object {
  var captcha_response: String = js.native
  var file: String = js.native
  var ticket: String = js.native
}

object DownloadLinkParam {
  @scala.inline
  def apply(captcha_response: String, file: String, ticket: String): DownloadLinkParam = {
    val __obj = js.Dynamic.literal(captcha_response = captcha_response.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadLinkParam]
  }
  @scala.inline
  implicit class DownloadLinkParamOps[Self <: DownloadLinkParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptcha_response(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captcha_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

