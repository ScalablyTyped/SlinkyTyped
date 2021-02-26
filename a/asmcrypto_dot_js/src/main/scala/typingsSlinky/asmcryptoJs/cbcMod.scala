package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cbcMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC")
  @js.native
  class AES_CBC protected () extends AES {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array, padding: Boolean) = this()
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object AES_CBC {
    
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: js.UndefOr[scala.Nothing],
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.decrypt")
    @js.native
    def decrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: Boolean,
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: js.UndefOr[scala.Nothing],
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js/dist_es8/aes/cbc", "AES_CBC.encrypt")
    @js.native
    def encrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: Boolean,
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
  }
}
