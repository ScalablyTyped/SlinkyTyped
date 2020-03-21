package typingsSlinky.qrcode.mod

import typingsSlinky.qrcode.qrcodeStrings.alphanumeric
import typingsSlinky.qrcode.qrcodeStrings.byte
import typingsSlinky.qrcode.qrcodeStrings.kanji
import typingsSlinky.qrcode.qrcodeStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeSegment extends js.Object {
  var data: String
  var mode: alphanumeric | numeric | kanji | byte
}

object QRCodeSegment {
  @scala.inline
  def apply(data: String, mode: alphanumeric | numeric | kanji | byte): QRCodeSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QRCodeSegment]
  }
}

