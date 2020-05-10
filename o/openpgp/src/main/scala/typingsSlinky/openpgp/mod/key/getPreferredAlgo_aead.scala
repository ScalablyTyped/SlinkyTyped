package typingsSlinky.openpgp.mod.key

import typingsSlinky.openpgp.mod.enums.symmetric
import typingsSlinky.openpgp.openpgpStrings.aead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.getPreferredAlgo")
@js.native
object getPreferredAlgo_aead extends js.Object {
  def apply(`type`: aead, keys: js.Array[_], date: js.Date, userIds: js.Array[_]): js.Promise[symmetric] = js.native
}

