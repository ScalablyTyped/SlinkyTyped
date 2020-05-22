package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  data  :string | openpgp.openpgp.ReadableStream<std.String>,   message  :openpgp.openpgp.message.Message,   signature  :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.signature.Signature} */
trait EncryptResultdatastringRe extends js.Object {
  var data: String | ReadableStream[String]
  var message: typingsSlinky.openpgp.mod.message.Message
  var sessionKey: AeadAlgorithm
  var signature: String | ReadableStream[String] | typingsSlinky.openpgp.mod.signature.Signature
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
}

