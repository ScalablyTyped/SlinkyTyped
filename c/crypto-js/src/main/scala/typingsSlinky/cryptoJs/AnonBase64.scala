package typingsSlinky.cryptoJs

import typingsSlinky.cryptoJs.mod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBase64 extends js.Object {
  var Base64: Encoder = js.native
  var Hex: Encoder = js.native
  var Latin1: Encoder = js.native
  var Utf16: Encoder = js.native
  var Utf16LE: Encoder = js.native
  var Utf8: Encoder = js.native
}

object AnonBase64 {
  @scala.inline
  def apply(Base64: Encoder, Hex: Encoder, Latin1: Encoder, Utf16: Encoder, Utf16LE: Encoder, Utf8: Encoder): AnonBase64 = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase64]
  }
  @scala.inline
  implicit class AnonBase64Ops[Self <: AnonBase64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64(value: Encoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: Encoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatin1(value: Encoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latin1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf16(value: Encoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utf16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf16LE(value: Encoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utf16LE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf8(value: Encoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utf8")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

