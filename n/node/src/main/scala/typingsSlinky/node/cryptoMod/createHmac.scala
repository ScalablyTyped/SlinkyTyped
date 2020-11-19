package typingsSlinky.node.cryptoMod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "createHmac")
@js.native
object createHmac extends js.Object {
  
  def apply(algorithm: String, key: BinaryLike): Hmac = js.native
  def apply(algorithm: String, key: BinaryLike, options: TransformOptions): Hmac = js.native
  def apply(algorithm: String, key: KeyObject): Hmac = js.native
  def apply(algorithm: String, key: KeyObject, options: TransformOptions): Hmac = js.native
}
