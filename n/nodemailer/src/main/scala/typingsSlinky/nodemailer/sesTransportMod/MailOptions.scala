package typingsSlinky.nodemailer.sesTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailOptions
  extends typingsSlinky.nodemailer.mailerMod.Options {
  /** list of keys that SendRawEmail method can take */
  var ses: js.UndefOr[MailSesOptions] = js.native
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
    def withSes(value: MailSesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ses")(js.undefined)
        ret
    }
  }
  
}

