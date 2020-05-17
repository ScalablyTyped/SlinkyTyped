package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalStrength extends js.Object {
  var SignalStrength: js.UndefOr[integer] = js.native
}

object SignalStrength {
  @scala.inline
  def apply(): SignalStrength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalStrength]
  }
  @scala.inline
  implicit class SignalStrengthOps[Self <: SignalStrength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignalStrength(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(js.undefined)
        ret
    }
  }
  
}

