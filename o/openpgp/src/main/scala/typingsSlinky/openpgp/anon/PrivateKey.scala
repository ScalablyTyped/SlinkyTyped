package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKey extends StObject {
  
  var privateKey: typingsSlinky.openpgp.mod.key.Key = js.native
  
  var privateKeyArmored: String = js.native
  
  var publicKey: typingsSlinky.openpgp.mod.key.Key = js.native
  
  var publicKeyArmored: String = js.native
}
object PrivateKey {
  
  @scala.inline
  def apply(
    privateKey: typingsSlinky.openpgp.mod.key.Key,
    privateKeyArmored: String,
    publicKey: typingsSlinky.openpgp.mod.key.Key,
    publicKeyArmored: String
  ): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyArmored = privateKeyArmored.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], publicKeyArmored = publicKeyArmored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  @scala.inline
  implicit class PrivateKeyMutableBuilder[Self <: PrivateKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: typingsSlinky.openpgp.mod.key.Key): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyArmored(value: String): Self = StObject.set(x, "privateKeyArmored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: typingsSlinky.openpgp.mod.key.Key): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyArmored(value: String): Self = StObject.set(x, "publicKeyArmored", value.asInstanceOf[js.Any])
  }
}
