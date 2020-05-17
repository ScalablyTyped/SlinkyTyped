package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_CMAC")
@js.native
class AES_CMAC protected ()
  extends typingsSlinky.asmcryptoJs.cmacMod.AES_CMAC {
  def this(key: js.typedarray.Uint8Array) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_CMAC")
@js.native
object AES_CMAC extends js.Object {
  def bytes(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}

