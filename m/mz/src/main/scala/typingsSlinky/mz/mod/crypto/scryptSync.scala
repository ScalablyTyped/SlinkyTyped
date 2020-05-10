package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.ScryptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "crypto.scryptSync")
@js.native
object scryptSync extends js.Object {
  def apply(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = js.native
  def apply(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = js.native
}

