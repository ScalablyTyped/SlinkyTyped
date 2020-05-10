package typingsSlinky.nodemailer.mod

import typingsSlinky.nodemailer.AnonHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestAccount extends js.Object {
  var imap: AnonHost = js.native
  var pass: String = js.native
  var pop3: AnonHost = js.native
  var smtp: AnonHost = js.native
  var user: String = js.native
  var web: String = js.native
}

object TestAccount {
  @scala.inline
  def apply(imap: AnonHost, pass: String, pop3: AnonHost, smtp: AnonHost, user: String, web: String): TestAccount = {
    val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAccount]
  }
  @scala.inline
  implicit class TestAccountOps[Self <: TestAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImap(value: AnonHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPop3(value: AnonHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmtp(value: AnonHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

