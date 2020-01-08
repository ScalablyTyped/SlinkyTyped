package typingsSlinky.nodemailer.nodemailerMod

import typingsSlinky.nodemailer.libMailerMod.^
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mailer: js.UndefOr[^] = js.undefined
  var name: String
  var verify: js.UndefOr[
    (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]]
  ] = js.undefined
  var version: String
  def send(
    mail: typingsSlinky.nodemailer.libMailerMailDashMessageMod.^,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit
}

object Transport {
  @scala.inline
  def apply(
    name: String,
    send: (typingsSlinky.nodemailer.libMailerMailDashMessageMod.^, js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]) => Unit,
    version: String,
    close: () => Unit = null,
    mailer: ^ = null,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): Transport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), version = version.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (mailer != null) __obj.updateDynamic("mailer")(mailer.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
}

