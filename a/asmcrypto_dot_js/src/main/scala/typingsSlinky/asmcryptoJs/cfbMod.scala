package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cfbMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/cfb", "AES_CFB")
  @js.native
  class AES_CFB protected () extends AES {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object AES_CFB {
    
    @JSImport("asmcrypto.js/dist_es8/aes/cfb", "AES_CFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cfb", "AES_CFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/cfb", "AES_CFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cfb", "AES_CFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
}
