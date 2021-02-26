package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecbMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/ecb", "AES_ECB")
  @js.native
  class AES_ECB protected () extends AES {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, padding: Boolean) = this()
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object AES_ECB {
    
    @JSImport("asmcrypto.js/dist_es8/aes/ecb", "AES_ECB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/ecb", "AES_ECB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/ecb", "AES_ECB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/ecb", "AES_ECB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
  }
}
