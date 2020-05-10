package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.denied_
import typingsSlinky.chromeApps.chromeAppsStrings.granted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDENIED extends js.Object {
  var DENIED: denied_ = js.native
  var GRANTED: granted_ = js.native
}

object AnonDENIED {
  @scala.inline
  def apply(DENIED: denied_, GRANTED: granted_): AnonDENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDENIED]
  }
  @scala.inline
  implicit class AnonDENIEDOps[Self <: AnonDENIED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDENIED(value: denied_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DENIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRANTED(value: granted_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRANTED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

