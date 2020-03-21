package typingsSlinky.pkijs.mod

import org.scalajs.dom.crypto.SubtleCrypto
import typingsSlinky.std.Crypto_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "setEngine")
@js.native
object setEngine extends js.Object {
  def apply(name: String, crypto: Crypto_, subtle: SubtleCrypto): Unit = js.native
}

