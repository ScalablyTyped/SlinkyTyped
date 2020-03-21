package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.checkbox
import typingsSlinky.chromeApps.chromeAppsStrings.normal
import typingsSlinky.chromeApps.chromeAppsStrings.radio
import typingsSlinky.chromeApps.chromeAppsStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCHECKBOX extends js.Object {
  var CHECKBOX: checkbox
  var NORMAL: normal
  var RADIO: radio
  var SEPARATOR: separator
}

object AnonCHECKBOX {
  @scala.inline
  def apply(CHECKBOX: checkbox, NORMAL: normal, RADIO: radio, SEPARATOR: separator): AnonCHECKBOX = {
    val __obj = js.Dynamic.literal(CHECKBOX = CHECKBOX.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], RADIO = RADIO.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCHECKBOX]
  }
}

