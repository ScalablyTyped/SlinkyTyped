package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pbkdf2")
@js.native
object pbkdf2 extends js.Object {
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, _]
  ): Unit = js.native
}

