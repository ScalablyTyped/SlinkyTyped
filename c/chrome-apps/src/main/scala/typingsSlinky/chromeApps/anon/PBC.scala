package typingsSlinky.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PBC extends js.Object {
  var PBC: typingsSlinky.chromeApps.chromeAppsStrings.PBC = js.native
  var PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN = js.native
}

object PBC {
  @scala.inline
  def apply(
    PBC: typingsSlinky.chromeApps.chromeAppsStrings.PBC,
    PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN
  ): PBC = {
    val __obj = js.Dynamic.literal(PBC = PBC.asInstanceOf[js.Any], PIN = PIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBC]
  }
  @scala.inline
  implicit class PBCOps[Self <: PBC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPBC(value: typingsSlinky.chromeApps.chromeAppsStrings.PBC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PBC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPIN(value: typingsSlinky.chromeApps.chromeAppsStrings.PIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

