package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Decoder")
@js.native
object Decoder extends js.Object {
  
  def correctErrors(codewordBytes: js.Array[Double], numDataCodewords: Double): Unit = js.native
  
  def decode(bits: typingsSlinky.jsqrcode.BitMatrix): typingsSlinky.jsqrcode.QRCodeDataBlockReader = js.native
  
  var rsDecoder: typingsSlinky.jsqrcode.ReedSolomonDecoder = js.native
}
