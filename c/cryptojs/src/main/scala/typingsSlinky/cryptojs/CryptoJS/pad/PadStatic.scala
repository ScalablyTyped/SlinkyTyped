package typingsSlinky.cryptojs.CryptoJS.pad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadStatic extends js.Object {
  var AnsiX923: typingsSlinky.cryptojs.CryptoJS.pad.AnsiX923
  var Iso10126: typingsSlinky.cryptojs.CryptoJS.pad.Iso10126
  var Iso97971: typingsSlinky.cryptojs.CryptoJS.pad.Iso97971
  var NoPadding: typingsSlinky.cryptojs.CryptoJS.pad.NoPadding
  var Pkcs7: typingsSlinky.cryptojs.CryptoJS.pad.Pkcs7
  var ZeroPadding: typingsSlinky.cryptojs.CryptoJS.pad.ZeroPadding
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
}

