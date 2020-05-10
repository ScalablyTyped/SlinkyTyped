package typingsSlinky.materialIconButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonARIAPRESSED extends js.Object {
  var ARIA_PRESSED: String = js.native
  var CHANGE_EVENT: String = js.native
}

object AnonARIAPRESSED {
  @scala.inline
  def apply(ARIA_PRESSED: String, CHANGE_EVENT: String): AnonARIAPRESSED = {
    val __obj = js.Dynamic.literal(ARIA_PRESSED = ARIA_PRESSED.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonARIAPRESSED]
  }
  @scala.inline
  implicit class AnonARIAPRESSEDOps[Self <: AnonARIAPRESSED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARIA_PRESSED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_PRESSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHANGE_EVENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

