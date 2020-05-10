package typingsSlinky.cryptojs.CryptoJS.enc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncStatic extends js.Object {
  var Base64: ICoder = js.native
  var Hex: ICoder = js.native
  var Latin1: ICoder = js.native
  var Utf16: ICoder = js.native
  var Utf16BE: ICoder = js.native
  var Utf16LE: ICoder = js.native
  var Utf8: ICoder = js.native
}

object EncStatic {
  @scala.inline
  def apply(
    Base64: ICoder,
    Hex: ICoder,
    Latin1: ICoder,
    Utf16: ICoder,
    Utf16BE: ICoder,
    Utf16LE: ICoder,
    Utf8: ICoder
  ): EncStatic = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16BE = Utf16BE.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncStatic]
  }
  @scala.inline
  implicit class EncStaticOps[Self <: EncStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64(value: ICoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: ICoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatin1(value: ICoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latin1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf16(value: ICoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utf16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf16BE(value: ICoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utf16BE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf16LE(value: ICoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utf16LE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf8(value: ICoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utf8")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

