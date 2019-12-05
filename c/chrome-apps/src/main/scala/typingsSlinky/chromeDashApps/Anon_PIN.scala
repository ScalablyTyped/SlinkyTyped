package typingsSlinky.chromeDashApps

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.PIN
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.PUK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PIN extends js.Object {
  var PIN: typingsSlinky.chromeDashApps.chromeDashAppsStrings.PIN
  var PUK: typingsSlinky.chromeDashApps.chromeDashAppsStrings.PUK
}

object Anon_PIN {
  @scala.inline
  def apply(PIN: PIN, PUK: PUK): Anon_PIN = {
    val __obj = js.Dynamic.literal(PIN = PIN.asInstanceOf[js.Any], PUK = PUK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PIN]
  }
}

