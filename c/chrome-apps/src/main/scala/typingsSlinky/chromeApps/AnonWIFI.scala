package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.WiFi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWIFI extends js.Object {
  var WI_FI: WiFi = js.native
}

object AnonWIFI {
  @scala.inline
  def apply(WI_FI: WiFi): AnonWIFI = {
    val __obj = js.Dynamic.literal(WI_FI = WI_FI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWIFI]
  }
  @scala.inline
  implicit class AnonWIFIOps[Self <: AnonWIFI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWI_FI(value: WiFi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WI_FI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

