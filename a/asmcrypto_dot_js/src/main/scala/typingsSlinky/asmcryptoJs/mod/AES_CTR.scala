package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_CTR")
@js.native
class AES_CTR protected ()
  extends typingsSlinky.asmcryptoJs.ctrMod.AES_CTR {
  def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_CTR")
@js.native
object AES_CTR extends js.Object {
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}

