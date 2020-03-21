package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.panel
import typingsSlinky.chromeApps.chromeAppsStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPANEL extends js.Object {
  var PANEL: panel
  var SHELL: shell
}

object AnonPANEL {
  @scala.inline
  def apply(PANEL: panel, SHELL: shell): AnonPANEL = {
    val __obj = js.Dynamic.literal(PANEL = PANEL.asInstanceOf[js.Any], SHELL = SHELL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPANEL]
  }
}

