package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.KeyKey
import typingsSlinky.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "decryptKey")
@js.native
object decryptKey extends js.Object {
  def apply(privateKey: Key, passphrase: String): js.Promise[KeyKey] = js.native
  def apply(privateKey: Key, passphrase: js.Array[_]): js.Promise[KeyKey] = js.native
}

