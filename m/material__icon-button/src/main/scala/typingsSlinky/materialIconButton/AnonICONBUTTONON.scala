package typingsSlinky.materialIconButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonICONBUTTONON extends js.Object {
  var ICON_BUTTON_ON: String = js.native
  var ROOT: String = js.native
}

object AnonICONBUTTONON {
  @scala.inline
  def apply(ICON_BUTTON_ON: String, ROOT: String): AnonICONBUTTONON = {
    val __obj = js.Dynamic.literal(ICON_BUTTON_ON = ICON_BUTTON_ON.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonICONBUTTONON]
  }
  @scala.inline
  implicit class AnonICONBUTTONONOps[Self <: AnonICONBUTTONON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withICON_BUTTON_ON(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICON_BUTTON_ON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

