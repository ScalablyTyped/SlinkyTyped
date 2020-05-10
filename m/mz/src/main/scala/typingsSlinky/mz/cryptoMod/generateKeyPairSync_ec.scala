package typingsSlinky.mz.cryptoMod

import typingsSlinky.mz.mzStrings.ec
import typingsSlinky.node.cryptoMod.ECKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync_ec extends js.Object {
  def apply(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}

