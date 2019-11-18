package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pbkdf2Sync")
@js.native
object pbkdf2Sync extends js.Object {
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: java.lang.String
  ): Buffer = js.native
}

