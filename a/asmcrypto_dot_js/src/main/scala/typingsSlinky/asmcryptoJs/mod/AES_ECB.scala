package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_ECB")
@js.native
class AES_ECB protected ()
  extends typingsSlinky.asmcryptoJs.ecbMod.AES_ECB {
  def this(key: js.typedarray.Uint8Array) = this()
  def this(key: js.typedarray.Uint8Array, padding: Boolean) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_ECB")
@js.native
object AES_ECB extends js.Object {
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
}

