package typingsSlinky.rmcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFixX extends js.Object {
  var fixX: Boolean = js.native
  var fixY: Boolean = js.native
}

object AnonFixX {
  @scala.inline
  def apply(fixX: Boolean, fixY: Boolean): AnonFixX = {
    val __obj = js.Dynamic.literal(fixX = fixX.asInstanceOf[js.Any], fixY = fixY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFixX]
  }
  @scala.inline
  implicit class AnonFixXOps[Self <: AnonFixX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

