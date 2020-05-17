package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesAsmMod.AESAsm
import typingsSlinky.asmcryptoJs.aesAsmMod.AESMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/aes/aes", JSImport.Namespace)
@js.native
object aesMod extends js.Object {
  @js.native
  abstract class AES protected () extends js.Object {
    protected def this(
      key: js.typedarray.Uint8Array,
      iv: js.UndefOr[js.typedarray.Uint8Array],
      padding: js.UndefOr[Boolean],
      mode: AESMode
    ) = this()
    val asm: AESAsm = js.native
    val heap: js.typedarray.Uint8Array = js.native
    var len: Double = js.native
    val mode: js.Any = js.native
    var padding: Boolean = js.native
    var pos: Double = js.native
    def AES_Decrypt_finish(): js.typedarray.Uint8Array = js.native
    def AES_Decrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def AES_Encrypt_finish(): js.typedarray.Uint8Array = js.native
    def AES_Encrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
}

