package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.message.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message  :openpgp.openpgp.message.Message} */
@js.native
trait EncryptResultmessageMessa extends js.Object {
  var message: Message = js.native
  var sessionKey: AnonAeadAlgorithm = js.native
}

object EncryptResultmessageMessa {
  @scala.inline
  def apply(message: Message, sessionKey: AnonAeadAlgorithm): EncryptResultmessageMessa = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultmessageMessa]
  }
  @scala.inline
  implicit class EncryptResultmessageMessaOps[Self <: EncryptResultmessageMessa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionKey(value: AnonAeadAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

