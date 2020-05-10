package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.connected__
import typingsSlinky.chromeApps.chromeAppsStrings.failure_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCONNECTEDFAILURE extends js.Object {
  var CONNECTED: connected__ = js.native
  var FAILURE: failure_ = js.native
}

object AnonCONNECTEDFAILURE {
  @scala.inline
  def apply(CONNECTED: connected__, FAILURE: failure_): AnonCONNECTEDFAILURE = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], FAILURE = FAILURE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCONNECTEDFAILURE]
  }
  @scala.inline
  implicit class AnonCONNECTEDFAILUREOps[Self <: AnonCONNECTEDFAILURE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONNECTED(value: connected__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAILURE(value: failure_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

