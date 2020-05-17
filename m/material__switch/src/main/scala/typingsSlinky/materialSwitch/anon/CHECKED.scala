package typingsSlinky.materialSwitch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CHECKED extends js.Object {
  var CHECKED: String = js.native
  var DISABLED: String = js.native
}

object CHECKED {
  @scala.inline
  def apply(CHECKED: String, DISABLED: String): CHECKED = {
    val __obj = js.Dynamic.literal(CHECKED = CHECKED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHECKED]
  }
  @scala.inline
  implicit class CHECKEDOps[Self <: CHECKED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHECKED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHECKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISABLED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

