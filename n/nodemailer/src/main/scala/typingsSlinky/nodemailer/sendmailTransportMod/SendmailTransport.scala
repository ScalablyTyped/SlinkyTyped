package typingsSlinky.nodemailer.sendmailTransportMod

import typingsSlinky.nodemailer.mod.Transport
import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import typingsSlinky.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendmailTransport extends Transport {
  var args: js.Array[String] | `false` = js.native
  var logger: Logger = js.native
  @JSName("mailer")
  var mailer_SendmailTransport: typingsSlinky.nodemailer.mailerMod.^ = js.native
  var options: Options = js.native
  var path: String = js.native
  var winbreak: Boolean = js.native
}

object SendmailTransport {
  @scala.inline
  def apply(
    args: js.Array[String] | `false`,
    logger: Logger,
    mailer: typingsSlinky.nodemailer.mailerMod.^,
    name: String,
    options: Options,
    path: String,
    send: (typingsSlinky.nodemailer.mailMessageMod.^, js.Function2[
      /* err */ js.Error | Null, 
      /* info */ typingsSlinky.nodemailer.mod.SentMessageInfo, 
      Unit
    ]) => Unit,
    version: String,
    winbreak: Boolean
  ): SendmailTransport = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendmailTransport]
  }
  @scala.inline
  implicit class SendmailTransportOps[Self <: SendmailTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailer(value: typingsSlinky.nodemailer.mailerMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWinbreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winbreak")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

