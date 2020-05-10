package typingsSlinky.nodemailer.jsonTransportMod

import typingsSlinky.nodemailer.mod.Transport
import typingsSlinky.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONTransport extends Transport {
  var logger: Logger = js.native
  @JSName("mailer")
  var mailer_JSONTransport: typingsSlinky.nodemailer.mailerMod.^ = js.native
  var options: Options = js.native
}

object JSONTransport {
  @scala.inline
  def apply(
    logger: Logger,
    mailer: typingsSlinky.nodemailer.mailerMod.^,
    name: String,
    options: Options,
    send: (typingsSlinky.nodemailer.mailMessageMod.^, js.Function2[
      /* err */ js.Error | Null, 
      /* info */ typingsSlinky.nodemailer.mod.SentMessageInfo, 
      Unit
    ]) => Unit,
    version: String
  ): JSONTransport = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONTransport]
  }
  @scala.inline
  implicit class JSONTransportOps[Self <: JSONTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

