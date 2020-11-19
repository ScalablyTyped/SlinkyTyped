package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/aes/ctr", JSImport.Namespace)
@js.native
object ctrMod extends js.Object {
  
  @js.native
  class AES_CTR protected () extends AES {
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
    
    var AES_CTR_set_options: js.Any = js.native
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  @js.native
  object AES_CTR extends js.Object {
    
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
}
