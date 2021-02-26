package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  data :string | openpgp.openpgp.ReadableStream<std.String>,   message :openpgp.openpgp.message.Message,   signature :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.signature.Signature} */
@js.native
trait EncryptResultdatastringRe extends StObject {
  
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
  implicit class EncryptResultdatastringReMutableBuilder[Self <: EncryptResultdatastringRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ReadableStream[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: typingsSlinky.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String | ReadableStream[String] | typingsSlinky.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
