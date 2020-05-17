package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Decoder")
@js.native
object Decoder extends js.Object {
  var rsDecoder: typingsSlinky.jsqrcode.ReedSolomonDecoder = js.native
  def correctErrors(codewordBytes: js.Array[Double], numDataCodewords: Double): Unit = js.native
  def decode(bits: typingsSlinky.jsqrcode.BitMatrix): typingsSlinky.jsqrcode.QRCodeDataBlockReader = js.native
}

