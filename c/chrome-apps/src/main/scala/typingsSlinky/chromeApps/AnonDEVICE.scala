package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.device_
import typingsSlinky.chromeApps.chromeAppsStrings.endpoint
import typingsSlinky.chromeApps.chromeAppsStrings.interface
import typingsSlinky.chromeApps.chromeAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDEVICE extends js.Object {
  var DEVICE: device_
  var ENDPOINT: endpoint
  var INTERFACE: interface
  var OTHER: other_
}

object AnonDEVICE {
  @scala.inline
  def apply(DEVICE: device_, ENDPOINT: endpoint, INTERFACE: interface, OTHER: other_): AnonDEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE.asInstanceOf[js.Any], ENDPOINT = ENDPOINT.asInstanceOf[js.Any], INTERFACE = INTERFACE.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDEVICE]
  }
}

