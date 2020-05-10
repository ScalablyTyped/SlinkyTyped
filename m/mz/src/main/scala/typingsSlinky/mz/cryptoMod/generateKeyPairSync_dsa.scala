package typingsSlinky.mz.cryptoMod

import typingsSlinky.mz.mzStrings.dsa
import typingsSlinky.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync_dsa extends js.Object {
  def apply(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}

