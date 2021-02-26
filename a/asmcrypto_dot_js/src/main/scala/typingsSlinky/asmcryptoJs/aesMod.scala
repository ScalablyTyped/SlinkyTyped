package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesAsmMod.AESAsm
import typingsSlinky.asmcryptoJs.aesAsmMod.AESMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aesMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/aes", "AES")
  @js.native
  abstract class AES protected () extends StObject {
    protected def this(
      key: js.typedarray.Uint8Array,
      iv: js.UndefOr[scala.Nothing],
      padding: js.UndefOr[scala.Nothing],
      mode: AESMode
    ) = this()
    protected def this(key: js.typedarray.Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean, mode: AESMode) = this()
    protected def this(
      key: js.typedarray.Uint8Array,
      iv: js.typedarray.Uint8Array,
      padding: js.UndefOr[scala.Nothing],
      mode: AESMode
    ) = this()
    protected def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array, padding: Boolean, mode: AESMode) = this()
    
    def AES_Decrypt_finish(): js.typedarray.Uint8Array = js.native
    
    def AES_Decrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def AES_Encrypt_finish(): js.typedarray.Uint8Array = js.native
    
    def AES_Encrypt_process(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    val asm: AESAsm = js.native
    
    val heap: js.typedarray.Uint8Array = js.native
    
    var len: Double = js.native
    
    val mode: js.Any = js.native
    
    var padding: Boolean = js.native
    
    var pos: Double = js.native
  }
}
