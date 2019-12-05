package typingsSlinky.openpgp.openpgpMod

import typingsSlinky.openpgp.Anon_Key_2141684526
import typingsSlinky.openpgp.openpgpMod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encryptKey")
@js.native
object encryptKey extends js.Object {
  def apply(privateKey: Key, passphrase: String): js.Promise[Anon_Key_2141684526] = js.native
  def apply(privateKey: Key, passphrase: js.Array[_]): js.Promise[Anon_Key_2141684526] = js.native
}

