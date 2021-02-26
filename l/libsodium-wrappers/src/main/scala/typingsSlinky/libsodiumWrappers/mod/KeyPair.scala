package typingsSlinky.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPair extends StObject {
  
  var keyType: KeyType = js.native
  
  var privateKey: js.typedarray.Uint8Array = js.native
  
  var publicKey: js.typedarray.Uint8Array = js.native
}
object KeyPair {
  
  @scala.inline
  def apply(keyType: KeyType, privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): KeyPair = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
  
  @scala.inline
  implicit class KeyPairMutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyType(value: KeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
