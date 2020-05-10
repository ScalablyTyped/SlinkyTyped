package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPpDisp extends js.Object {
  var Cancel: Boolean = js.native
  var ppDisp: js.Any = js.native
}

object AnonPpDisp {
  @scala.inline
  def apply(Cancel: Boolean, ppDisp: js.Any): AnonPpDisp = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPpDisp]
  }
  @scala.inline
  implicit class AnonPpDispOps[Self <: AnonPpDisp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPpDisp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppDisp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

