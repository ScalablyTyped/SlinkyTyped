package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  message :openpgp.openpgp.message.Message,   signature :openpgp.openpgp.signature.Signature} */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: typingsSlinky.openpgp.mod.message.Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: typingsSlinky.openpgp.mod.signature.Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
}
