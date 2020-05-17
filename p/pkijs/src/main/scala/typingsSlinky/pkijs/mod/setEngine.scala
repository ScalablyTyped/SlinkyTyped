package typingsSlinky.pkijs.mod

import org.scalajs.dom.crypto.Crypto
import org.scalajs.dom.crypto.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "setEngine")
@js.native
object setEngine extends js.Object {
  def apply(name: String, crypto: Crypto, subtle: SubtleCrypto): Unit = js.native
}

