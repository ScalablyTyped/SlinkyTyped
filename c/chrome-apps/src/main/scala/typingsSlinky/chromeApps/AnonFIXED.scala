package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.fixed
import typingsSlinky.chromeApps.chromeAppsStrings.removable
import typingsSlinky.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFIXED extends js.Object {
  var FIXED: fixed
  var REMOVABLE: removable
  var UNKNOWN: unknown_
}

object AnonFIXED {
  @scala.inline
  def apply(FIXED: fixed, REMOVABLE: removable, UNKNOWN: unknown_): AnonFIXED = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], REMOVABLE = REMOVABLE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFIXED]
  }
}

