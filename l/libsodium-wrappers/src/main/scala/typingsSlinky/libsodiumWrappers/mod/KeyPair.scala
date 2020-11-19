package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPair extends js.Object {
  
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
  implicit class KeyPairOps[Self <: KeyPair] (val x: Self) extends AnyVal {
    
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
    def setKeyType(value: KeyType): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: js.typedarray.Uint8Array): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: js.typedarray.Uint8Array): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
}
