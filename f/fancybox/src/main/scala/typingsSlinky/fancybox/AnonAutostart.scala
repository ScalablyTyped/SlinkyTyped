package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutostart extends js.Object {
  var autostart: Boolean = js.native
}

object AnonAutostart {
  @scala.inline
  def apply(autostart: Boolean): AnonAutostart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutostart]
  }
  @scala.inline
  implicit class AnonAutostartOps[Self <: AnonAutostart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutostart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

