package typingsSlinky.cryptojs.CryptoJS.mode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModeStatic extends js.Object {
  var CBC: typingsSlinky.cryptojs.CryptoJS.mode.CBC = js.native
  var CFB: typingsSlinky.cryptojs.CryptoJS.mode.CFB = js.native
  var CTR: typingsSlinky.cryptojs.CryptoJS.mode.CTR = js.native
  var CTRGladman: typingsSlinky.cryptojs.CryptoJS.mode.CTRGladman = js.native
  var ECB: typingsSlinky.cryptojs.CryptoJS.mode.ECB = js.native
  var OFB: typingsSlinky.cryptojs.CryptoJS.mode.OFB = js.native
}

object ModeStatic {
  @scala.inline
  def apply(CBC: CBC, CFB: CFB, CTR: CTR, CTRGladman: CTRGladman, ECB: ECB, OFB: OFB): ModeStatic = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeStatic]
  }
  @scala.inline
  implicit class ModeStaticOps[Self <: ModeStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCBC(value: CBC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CBC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCFB(value: CFB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CFB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCTR(value: CTR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCTRGladman(value: CTRGladman): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTRGladman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withECB(value: ECB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFB(value: OFB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

