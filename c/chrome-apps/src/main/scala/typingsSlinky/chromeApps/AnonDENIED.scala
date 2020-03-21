package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.denied
import typingsSlinky.chromeApps.chromeAppsStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDENIED extends js.Object {
  var DENIED: denied
  var GRANTED: granted
}

object AnonDENIED {
  @scala.inline
  def apply(DENIED: denied, GRANTED: granted): AnonDENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDENIED]
  }
}

