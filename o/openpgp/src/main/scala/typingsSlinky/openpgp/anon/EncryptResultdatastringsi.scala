package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  data :string,   signature :string} */
@js.native
trait EncryptResultdatastringsi extends StObject {
  
  var data: String = js.native
  
  var sessionKey: AeadAlgorithm = js.native
  
  var signature: String = js.native
}
object EncryptResultdatastringsi {
  
  @scala.inline
  def apply(data: String, sessionKey: AeadAlgorithm, signature: String): EncryptResultdatastringsi = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastringsi]
  }
  
  @scala.inline
  implicit class EncryptResultdatastringsiMutableBuilder[Self <: EncryptResultdatastringsi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
