package typingsSlinky.mz.mod.crypto

import typingsSlinky.mz.mzStrings.ed25519
import typingsSlinky.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.generateKeyPairSync")
@js.native
object generateKeyPairSync_ed25519 extends js.Object {
  
  def apply(`type`: ed25519): KeyPairKeyObjectResult = js.native
  def apply(`type`: ed25519, options: ED25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}
