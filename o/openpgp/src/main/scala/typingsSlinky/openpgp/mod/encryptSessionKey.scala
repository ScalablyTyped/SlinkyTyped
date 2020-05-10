package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.mod.key.Key
import typingsSlinky.openpgp.mod.message.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encryptSessionKey")
@js.native
object encryptSessionKey extends js.Object {
  def apply(
    data: js.typedarray.Uint8Array,
    algorithm: String,
    aeadAlgorithm: js.UndefOr[String],
    publicKeys: js.UndefOr[js.Array[Key] | Key],
    passwords: js.UndefOr[js.Array[String] | String],
    wildcard: js.UndefOr[Boolean],
    date: js.UndefOr[js.Date],
    toUserIds: js.UndefOr[js.Array[_]]
  ): js.Promise[Message] = js.native
}

