package typingsSlinky.pkijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "kdf")
@js.native
object kdf extends js.Object {
  /**
    * ANS X9.63 Key Derivation Function
    *
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} keydatalen Length (!!! in BITS !!!) of used kew derivation function
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  def apply(
    hashFunction: String,
    Zbuffer: js.typedarray.ArrayBuffer,
    keydatalen: Double,
    SharedInfo: js.typedarray.ArrayBuffer
  ): js.Thenable[js.typedarray.ArrayBuffer] = js.native
}

