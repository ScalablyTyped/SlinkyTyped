package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.DecryptOptionsformatbinar
import typingsSlinky.openpgp.DecryptOptionsformatutf8
import typingsSlinky.openpgp.DecryptResultdataUint8Arr
import typingsSlinky.openpgp.DecryptResultdatastringRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "decrypt")
@js.native
object decrypt extends js.Object {
  def apply(options: DecryptOptionsformatbinar): js.Promise[DecryptResultdataUint8Arr] = js.native
  def apply(options: DecryptOptionsformatutf8): js.Promise[DecryptResultdatastringRe] = js.native
  def apply(options: DecryptOptions): js.Promise[DecryptResult] = js.native
}

