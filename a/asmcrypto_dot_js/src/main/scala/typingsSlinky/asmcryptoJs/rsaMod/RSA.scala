package typingsSlinky.asmcryptoJs.rsaMod

import typingsSlinky.asmcryptoJs.bignumMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/rsa/rsa", "RSA")
@js.native
class RSA protected () extends js.Object {
  def this(key: js.Array[js.typedarray.Uint8Array]) = this()
  val key: typingsSlinky.asmcryptoJs.rsaMod.key = js.native
  var result: js.typedarray.Uint8Array = js.native
  def decrypt(msg: BigNumber): this.type = js.native
  def encrypt(msg: BigNumber): this.type = js.native
}

