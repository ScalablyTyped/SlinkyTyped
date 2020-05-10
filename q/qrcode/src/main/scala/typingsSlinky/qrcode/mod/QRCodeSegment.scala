package typingsSlinky.qrcode.mod

import typingsSlinky.qrcode.qrcodeStrings.alphanumeric
import typingsSlinky.qrcode.qrcodeStrings.byte
import typingsSlinky.qrcode.qrcodeStrings.kanji
import typingsSlinky.qrcode.qrcodeStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeSegment extends js.Object {
  var data: String = js.native
  var mode: alphanumeric | numeric | kanji | byte = js.native
}

object QRCodeSegment {
  @scala.inline
  def apply(data: String, mode: alphanumeric | numeric | kanji | byte): QRCodeSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeSegment]
  }
  @scala.inline
  implicit class QRCodeSegmentOps[Self <: QRCodeSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: alphanumeric | numeric | kanji | byte): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

