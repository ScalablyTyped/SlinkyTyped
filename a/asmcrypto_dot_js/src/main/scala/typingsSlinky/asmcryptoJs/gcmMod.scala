package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/aes/gcm", JSImport.Namespace)
@js.native
object gcmMod extends js.Object {
  
  @js.native
  class AES_GCM protected () extends AES {
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, adata: js.typedarray.Uint8Array) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagSize: Double
    ) = this()
    
    def AES_GCM_Decrypt_finish(): js.typedarray.Uint8Array = js.native
    
    def AES_GCM_Decrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def AES_GCM_Encrypt_finish(): js.typedarray.Uint8Array = js.native
    
    def AES_GCM_Encrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    var AES_GCM_decrypt: js.Any = js.native
    
    var AES_GCM_encrypt: js.Any = js.native
    
    def _gcm_mac_process(data: js.typedarray.Uint8Array): Unit = js.native
    
    val adata: js.Any = js.native
    
    var counter: js.Any = js.native
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    val gamma0: js.Any = js.native
    
    val tagSize: js.Any = js.native
  }
  /* static members */
  @js.native
  object AES_GCM extends js.Object {
    
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
  }
}
