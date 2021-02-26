package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ofbMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB")
  @js.native
  class AES_OFB protected () extends AES {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object AES_OFB {
    
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/ofb", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
}
