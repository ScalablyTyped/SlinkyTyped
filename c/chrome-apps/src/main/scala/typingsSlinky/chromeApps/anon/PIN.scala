package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.PUK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PIN extends js.Object {
  var PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN = js.native
  var PUK: typingsSlinky.chromeApps.chromeAppsStrings.PUK = js.native
}

object PIN {
  @scala.inline
  def apply(PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN, PUK: PUK): PIN = {
    val __obj = js.Dynamic.literal(PIN = PIN.asInstanceOf[js.Any], PUK = PUK.asInstanceOf[js.Any])
    __obj.asInstanceOf[PIN]
  }
  @scala.inline
  implicit class PINOps[Self <: PIN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPIN(value: typingsSlinky.chromeApps.chromeAppsStrings.PIN): Self = {
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

