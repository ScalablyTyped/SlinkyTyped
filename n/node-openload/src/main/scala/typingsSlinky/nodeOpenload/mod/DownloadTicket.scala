package typingsSlinky.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadTicket extends js.Object {
  var captcha_h: Double = js.native
  var captcha_url: String = js.native
  var captcha_w: Double = js.native
  var ticket: String = js.native
  var valid_until: String = js.native
  var wait_time: Double = js.native
}

object DownloadTicket {
  @scala.inline
  def apply(
    captcha_h: Double,
    captcha_url: String,
    captcha_w: Double,
    ticket: String,
    valid_until: String,
    wait_time: Double
  ): DownloadTicket = {
    val __obj = js.Dynamic.literal(captcha_h = captcha_h.asInstanceOf[js.Any], captcha_url = captcha_url.asInstanceOf[js.Any], captcha_w = captcha_w.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any], wait_time = wait_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadTicket]
  }
  @scala.inline
  implicit class DownloadTicketOps[Self <: DownloadTicket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptcha_h(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captcha_h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptcha_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captcha_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptcha_w(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captcha_w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid_until(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWait_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

