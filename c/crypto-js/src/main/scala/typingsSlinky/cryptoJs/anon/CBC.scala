package typingsSlinky.cryptoJs.anon

import typingsSlinky.cryptoJs.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBC extends js.Object {
  var CBC: Mode = js.native
  var CFB: Mode = js.native
  var CTR: Mode = js.native
  var CTRGladman: Mode = js.native
  var ECB: Mode = js.native
  var OFB: Mode = js.native
}

object CBC {
  @scala.inline
  def apply(CBC: Mode, CFB: Mode, CTR: Mode, CTRGladman: Mode, ECB: Mode, OFB: Mode): CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
    __obj.asInstanceOf[CBC]
  }
  @scala.inline
  implicit class CBCOps[Self <: CBC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCBC(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CBC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCFB(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CFB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCTR(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCTRGladman(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CTRGladman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withECB(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFB(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

