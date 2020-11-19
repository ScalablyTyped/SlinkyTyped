package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "AES_OFB")
@js.native
class AES_OFB protected ()
  extends typingsSlinky.asmcryptoJs.ofbMod.AES_OFB {
  def this(key: js.typedarray.Uint8Array) = this()
  def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
}
/* static members */
@JSImport("asmcrypto.js", "AES_OFB")
@js.native
object AES_OFB extends js.Object {
  
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
