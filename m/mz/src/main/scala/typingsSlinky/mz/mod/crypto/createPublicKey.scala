package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.PublicKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.createPublicKey")
@js.native
object createPublicKey extends js.Object {
  
  def apply(key: String): typingsSlinky.node.cryptoMod.KeyObject = js.native
  def apply(key: Buffer): typingsSlinky.node.cryptoMod.KeyObject = js.native
  def apply(key: typingsSlinky.node.cryptoMod.KeyObject): typingsSlinky.node.cryptoMod.KeyObject = js.native
  def apply(key: PublicKeyInput): typingsSlinky.node.cryptoMod.KeyObject = js.native
}
