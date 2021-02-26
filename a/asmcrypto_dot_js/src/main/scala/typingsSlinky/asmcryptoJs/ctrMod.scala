package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ctrMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/ctr", "AES_CTR")
  @js.native
  class AES_CTR protected () extends AES {
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
    
    var AES_CTR_set_options: js.Any = js.native
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object AES_CTR {
    
    @JSImport("asmcrypto.js/dist_es8/aes/ctr", "AES_CTR.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/ctr", "AES_CTR.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
}
