package typingsSlinky.openpgp

import typingsSlinky.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPassphrase extends js.Object {
  var passphrase: String = js.native
  var sign: `true` = js.native
}

object AnonPassphrase {
  @scala.inline
  def apply(passphrase: String, sign: `true`): AnonPassphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassphrase]
  }
  @scala.inline
  implicit class AnonPassphraseOps[Self <: AnonPassphrase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSign(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

