package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/aes/ofb", JSImport.Namespace)
@js.native
object ofbMod extends js.Object {
  @js.native
  class AES_OFB protected () extends AES {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  /* static members */
  @js.native
  object AES_OFB extends js.Object {
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
}

