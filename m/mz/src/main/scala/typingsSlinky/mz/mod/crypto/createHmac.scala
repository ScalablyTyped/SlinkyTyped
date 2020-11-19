package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.createHmac")
@js.native
object createHmac extends js.Object {
  
  def apply(algorithm: String, key: BinaryLike): typingsSlinky.node.cryptoMod.Hmac = js.native
  def apply(algorithm: String, key: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Hmac = js.native
  def apply(algorithm: String, key: typingsSlinky.node.cryptoMod.KeyObject): typingsSlinky.node.cryptoMod.Hmac = js.native
  def apply(algorithm: String, key: typingsSlinky.node.cryptoMod.KeyObject, options: TransformOptions): typingsSlinky.node.cryptoMod.Hmac = js.native
}
