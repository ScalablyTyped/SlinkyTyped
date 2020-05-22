package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message  :openpgp.openpgp.message.Message,   signature  :openpgp.openpgp.signature.Signature} */
trait EncryptResultmessageMessaMessage extends js.Object {
  var message: typingsSlinky.openpgp.mod.message.Message
  var sessionKey: AeadAlgorithm
  var signature: typingsSlinky.openpgp.mod.signature.Signature
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
}

