package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.cryptoMod.HashOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "createHash")
@js.native
object createHash extends js.Object {
  def apply(algorithm: String): typingsSlinky.node.cryptoMod.Hash = js.native
  def apply(algorithm: String, options: HashOptions): typingsSlinky.node.cryptoMod.Hash = js.native
}

