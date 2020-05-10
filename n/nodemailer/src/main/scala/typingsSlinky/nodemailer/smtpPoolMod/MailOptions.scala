package typingsSlinky.nodemailer.smtpPoolMod

import typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationType
import typingsSlinky.nodemailer.smtpConnectionMod.DSNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailOptions
  extends typingsSlinky.nodemailer.mailerMod.Options {
  var auth: js.UndefOr[AuthenticationType] = js.native
  var dsn: js.UndefOr[DSNOptions] = js.native
}

object MailOptions {
  @scala.inline
  def apply(): MailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailOptions]
  }
  @scala.inline
  implicit class MailOptionsOps[Self <: MailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: AuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withDsn(value: DSNOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsn")(js.undefined)
        ret
    }
  }
  
}

