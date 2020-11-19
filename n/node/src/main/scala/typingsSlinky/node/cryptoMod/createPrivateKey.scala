package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  
  def apply(key: String): KeyObject = js.native
  def apply(key: Buffer): KeyObject = js.native
  def apply(key: PrivateKeyInput): KeyObject = js.native
}
