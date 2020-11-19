package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesMod.AES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/aes/ccm", JSImport.Namespace)
@js.native
object ccmMod extends js.Object {
  
  @js.native
  class AES_CCM protected () extends AES {
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: Double,
      dataLength: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagSize: Double,
      dataLength: Double
    ) = this()
    
    def AES_CCM_Decrypt_finish(): js.typedarray.Uint8Array = js.native
    
    def AES_CCM_Decrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def AES_CCM_Encrypt_finish(): js.typedarray.Uint8Array = js.native
    
    def AES_CCM_Encrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def AES_CCM_calculate_iv(): Unit = js.native
    
    var AES_CTR_set_options: js.Any = js.native
    
    def _cbc_mac_process(data: js.typedarray.Uint8Array): Unit = js.native
    
    val adata: js.Any = js.native
    
    var counter: js.Any = js.native
    
    var dataLength: js.Any = js.native
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    val lengthSize: js.Any = js.native
    
    var nonce: js.Any = js.native
    
    val tagSize: js.Any = js.native
  }
  /* static members */
  @js.native
  object AES_CCM extends js.Object {
    
    def decrypt(cipher: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def decrypt(
      cipher: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    def decrypt(
      cipher: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def decrypt(
      cipher: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    
    def encrypt(clear: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encrypt(
      clear: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    def encrypt(
      clear: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    def encrypt(
      clear: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
  }
}
