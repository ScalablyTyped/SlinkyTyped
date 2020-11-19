package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Hmac")
@js.native
class Hmac protected () extends Transform {
  
  def digest(): Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): String = js.native
  
  def update(data: String, input_encoding: Utf8AsciiLatin1Encoding): Hmac = js.native
  def update(data: BinaryLike): Hmac = js.native
}
