package typingsSlinky.nodemailer.mod

import typingsSlinky.nodemailer.mailerMod.^
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  var mailer: js.UndefOr[^] = js.native
  var name: String = js.native
  var verify: js.UndefOr[
    (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]]
  ] = js.native
  var version: String = js.native
  def send(
    mail: typingsSlinky.nodemailer.mailMessageMod.^,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
}

object Transport {
  @scala.inline
  def apply(
    name: String,
    send: (typingsSlinky.nodemailer.mailMessageMod.^, js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]) => Unit,
    version: String
  ): Transport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend(
      value: (typingsSlinky.nodemailer.mailMessageMod.^, js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withMailer(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailer")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify(
      value: (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
  }
  
}

