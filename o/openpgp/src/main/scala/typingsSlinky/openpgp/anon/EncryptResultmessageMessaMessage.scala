package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message  :openpgp.openpgp.message.Message,   signature  :openpgp.openpgp.signature.Signature} */
@js.native
trait EncryptResultmessageMessaMessage extends js.Object {
  var message: typingsSlinky.openpgp.mod.message.Message = js.native
  var sessionKey: AeadAlgorithm = js.native
  var signature: typingsSlinky.openpgp.mod.signature.Signature = js.native
}

object EncryptResultmessageMessaMessage {
  @scala.inline
  def apply(
    message: typingsSlinky.openpgp.mod.message.Message,
    sessionKey: AeadAlgorithm,
    signature: typingsSlinky.openpgp.mod.signature.Signature
  ): EncryptResultmessageMessaMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultmessageMessaMessage]
  }
  @scala.inline
  implicit class EncryptResultmessageMessaMessageOps[Self <: EncryptResultmessageMessaMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: typingsSlinky.openpgp.mod.message.Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionKey(value: AeadAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: typingsSlinky.openpgp.mod.signature.Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

