package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.PrivateKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  
  def apply(key: String): typingsSlinky.node.cryptoMod.KeyObject = js.native
  def apply(key: Buffer): typingsSlinky.node.cryptoMod.KeyObject = js.native
  def apply(key: PrivateKeyInput): typingsSlinky.node.cryptoMod.KeyObject = js.native
}
