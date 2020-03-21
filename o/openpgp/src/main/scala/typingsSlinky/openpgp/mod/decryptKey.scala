package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.AnonKeyKey
import typingsSlinky.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "decryptKey")
@js.native
object decryptKey extends js.Object {
  def apply(privateKey: Key, passphrase: String): js.Promise[AnonKeyKey] = js.native
  def apply(privateKey: Key, passphrase: js.Array[_]): js.Promise[AnonKeyKey] = js.native
}

