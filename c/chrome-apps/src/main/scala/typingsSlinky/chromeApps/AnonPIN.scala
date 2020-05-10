package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.PIN
import typingsSlinky.chromeApps.chromeAppsStrings.PUK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPIN extends js.Object {
  var PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN = js.native
  var PUK: typingsSlinky.chromeApps.chromeAppsStrings.PUK = js.native
}

object AnonPIN {
  @scala.inline
  def apply(PIN: PIN, PUK: PUK): AnonPIN = {
    val __obj = js.Dynamic.literal(PIN = PIN.asInstanceOf[js.Any], PUK = PUK.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPIN]
  }
  @scala.inline
  implicit class AnonPINOps[Self <: AnonPIN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPIN(value: PIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPUK(value: PUK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PUK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

