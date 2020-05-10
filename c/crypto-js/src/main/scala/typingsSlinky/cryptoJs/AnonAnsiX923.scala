package typingsSlinky.cryptoJs

import typingsSlinky.cryptoJs.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnsiX923 extends js.Object {
  var AnsiX923: Padding = js.native
  var Iso10126: Padding = js.native
  var Iso97971: Padding = js.native
  var NoPadding: Padding = js.native
  var Pkcs7: Padding = js.native
  var ZeroPadding: Padding = js.native
}

object AnonAnsiX923 {
  @scala.inline
  def apply(
    AnsiX923: Padding,
    Iso10126: Padding,
    Iso97971: Padding,
    NoPadding: Padding,
    Pkcs7: Padding,
    ZeroPadding: Padding
  ): AnonAnsiX923 = {
    val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923.asInstanceOf[js.Any], Iso10126 = Iso10126.asInstanceOf[js.Any], Iso97971 = Iso97971.asInstanceOf[js.Any], NoPadding = NoPadding.asInstanceOf[js.Any], Pkcs7 = Pkcs7.asInstanceOf[js.Any], ZeroPadding = ZeroPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnsiX923]
  }
  @scala.inline
  implicit class AnonAnsiX923Ops[Self <: AnonAnsiX923] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsiX923(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnsiX923")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso10126(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iso10126")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso97971(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iso97971")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPkcs7(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pkcs7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZeroPadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

