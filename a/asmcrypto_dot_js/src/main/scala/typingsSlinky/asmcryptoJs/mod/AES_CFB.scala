package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_CFB")
@js.native
class AES_CFB protected ()
  extends typingsSlinky.asmcryptoJs.cfbMod.AES_CFB {
  def this(key: js.typedarray.Uint8Array) = this()
  def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_CFB")
@js.native
object AES_CFB extends js.Object {
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}

