package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  data  :string | openpgp.openpgp.ReadableStream<std.String>,   message  :openpgp.openpgp.message.Message,   signature  :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.signature.Signature} */
@js.native
trait EncryptResultdatastringRe extends js.Object {
  var data: String | ReadableStream[String] = js.native
  var message: typingsSlinky.openpgp.mod.message.Message = js.native
  var sessionKey: AeadAlgorithm = js.native
  var signature: String | ReadableStream[String] | typingsSlinky.openpgp.mod.signature.Signature = js.native
}

object EncryptResultdatastringRe {
  @scala.inline
  def apply(
    data: String | ReadableStream[String],
    message: typingsSlinky.openpgp.mod.message.Message,
    sessionKey: AeadAlgorithm,
    signature: String | ReadableStream[String] | typingsSlinky.openpgp.mod.signature.Signature
  ): EncryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastringRe]
  }
  @scala.inline
  implicit class EncryptResultdatastringReOps[Self <: EncryptResultdatastringRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | ReadableStream[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withSignature(value: String | ReadableStream[String] | typingsSlinky.openpgp.mod.signature.Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

