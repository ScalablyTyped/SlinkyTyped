package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.failure_
import typingsSlinky.chromeApps.chromeAppsStrings.in_use_
import typingsSlinky.chromeApps.chromeAppsStrings.no_such_device_
import typingsSlinky.chromeApps.chromeAppsStrings.success_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFAILURE extends js.Object {
  var FAILURE: failure_ = js.native
  var IN_USE: in_use_ = js.native
  var NO_SUCH_DEVICE: no_such_device_ = js.native
  var SUCCESS: success_ = js.native
}

object AnonFAILURE {
  @scala.inline
  def apply(FAILURE: failure_, IN_USE: in_use_, NO_SUCH_DEVICE: no_such_device_, SUCCESS: success_): AnonFAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], NO_SUCH_DEVICE = NO_SUCH_DEVICE.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFAILURE]
  }
  @scala.inline
  implicit class AnonFAILUREOps[Self <: AnonFAILURE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAILURE(value: failure_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIN_USE(value: in_use_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN_USE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_SUCH_DEVICE(value: no_such_device_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_SUCH_DEVICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUCCESS(value: success_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

