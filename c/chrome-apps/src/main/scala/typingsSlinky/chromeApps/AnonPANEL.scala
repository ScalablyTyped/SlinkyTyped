package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.panel
import typingsSlinky.chromeApps.chromeAppsStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPANEL extends js.Object {
  var PANEL: panel = js.native
  var SHELL: shell = js.native
}

object AnonPANEL {
  @scala.inline
  def apply(PANEL: panel, SHELL: shell): AnonPANEL = {
    val __obj = js.Dynamic.literal(PANEL = PANEL.asInstanceOf[js.Any], SHELL = SHELL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPANEL]
  }
  @scala.inline
  implicit class AnonPANELOps[Self <: AnonPANEL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPANEL(value: panel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PANEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHELL(value: shell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHELL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

