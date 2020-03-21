package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.PIN
import typingsSlinky.chromeApps.chromeAppsStrings.PUK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPIN extends js.Object {
  var PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN
  var PUK: typingsSlinky.chromeApps.chromeAppsStrings.PUK
}

object AnonPIN {
  @scala.inline
  def apply(PIN: PIN, PUK: PUK): AnonPIN = {
    val __obj = js.Dynamic.literal(PIN = PIN.asInstanceOf[js.Any], PUK = PUK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPIN]
  }
}

