package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.AeadAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptResult extends StObject {
  
  var sessionKey: AeadAlgorithm = js.native
}
object EncryptResult {
  
  @scala.inline
  def apply(sessionKey: AeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResult]
  }
  
  @scala.inline
  implicit class EncryptResultMutableBuilder[Self <: EncryptResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
  }
}
