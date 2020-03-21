package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.connected_
import typingsSlinky.chromeApps.chromeAppsStrings.disconnected_
import typingsSlinky.chromeApps.chromeAppsStrings.error
import typingsSlinky.chromeApps.chromeAppsStrings.linkChanged
import typingsSlinky.chromeApps.chromeAppsStrings.linkDown
import typingsSlinky.chromeApps.chromeAppsStrings.linkUp
import typingsSlinky.chromeApps.chromeAppsStrings.resume
import typingsSlinky.chromeApps.chromeAppsStrings.suspend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDISCONNECTED extends js.Object {
  var CONNECTED: connected_
  var DISCONNECTED: disconnected_
  var ERROR: error
  var LINK_CHANGED: linkChanged
  var LINK_DOWN: linkDown
  var LINK_UP: linkUp
  var RESUME: resume
  var SUSPEND: suspend
}

object AnonDISCONNECTED {
  @scala.inline
  def apply(
    CONNECTED: connected_,
    DISCONNECTED: disconnected_,
    ERROR: error,
    LINK_CHANGED: linkChanged,
    LINK_DOWN: linkDown,
    LINK_UP: linkUp,
    RESUME: resume,
    SUSPEND: suspend
  ): AnonDISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], LINK_CHANGED = LINK_CHANGED.asInstanceOf[js.Any], LINK_DOWN = LINK_DOWN.asInstanceOf[js.Any], LINK_UP = LINK_UP.asInstanceOf[js.Any], RESUME = RESUME.asInstanceOf[js.Any], SUSPEND = SUSPEND.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDISCONNECTED]
  }
}

