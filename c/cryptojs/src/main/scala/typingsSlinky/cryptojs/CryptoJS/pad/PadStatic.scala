package typingsSlinky.cryptojs.CryptoJS.pad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PadStatic extends js.Object {
  var AnsiX923: typingsSlinky.cryptojs.CryptoJS.pad.AnsiX923 = js.native
  var Iso10126: typingsSlinky.cryptojs.CryptoJS.pad.Iso10126 = js.native
  var Iso97971: typingsSlinky.cryptojs.CryptoJS.pad.Iso97971 = js.native
  var NoPadding: typingsSlinky.cryptojs.CryptoJS.pad.NoPadding = js.native
  var Pkcs7: typingsSlinky.cryptojs.CryptoJS.pad.Pkcs7 = js.native
  var ZeroPadding: typingsSlinky.cryptojs.CryptoJS.pad.ZeroPadding = js.native
}

object PadStatic {
  @scala.inline
  def apply(
    AnsiX923: AnsiX923,
    Iso10126: Iso10126,
    Iso97971: Iso97971,
    NoPadding: NoPadding,
    Pkcs7: Pkcs7,
    ZeroPadding: ZeroPadding
  ): PadStatic = {
    val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923.asInstanceOf[js.Any], Iso10126 = Iso10126.asInstanceOf[js.Any], Iso97971 = Iso97971.asInstanceOf[js.Any], NoPadding = NoPadding.asInstanceOf[js.Any], Pkcs7 = Pkcs7.asInstanceOf[js.Any], ZeroPadding = ZeroPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadStatic]
  }
  @scala.inline
  implicit class PadStaticOps[Self <: PadStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsiX923(value: AnsiX923): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnsiX923")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso10126(value: Iso10126): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iso10126")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso97971(value: Iso97971): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iso97971")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoPadding(value: NoPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPkcs7(value: Pkcs7): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroPadding(value: ZeroPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZeroPadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

