package typingsSlinky.openpgp.mod.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto.gcm")
@js.native
object gcm extends js.Object {
  /**
    * Class to en/decrypt using GCM mode.
    * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
    * @param key The encryption key
    */
  def GCM(cipher: String, key: js.typedarray.Uint8Array): Unit = js.native
}

