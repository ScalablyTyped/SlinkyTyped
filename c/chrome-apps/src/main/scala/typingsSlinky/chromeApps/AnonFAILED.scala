package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.failed_
import typingsSlinky.chromeApps.chromeAppsStrings.rejected_
import typingsSlinky.chromeApps.chromeAppsStrings.succeeded_
import typingsSlinky.chromeApps.chromeAppsStrings.unhandled_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFAILED extends js.Object {
  var FAILED: failed_ = js.native
  var REJECTED: rejected_ = js.native
  var SUCCEEDED: succeeded_ = js.native
  var UNHANDLED: unhandled_ = js.native
}

object AnonFAILED {
  @scala.inline
  def apply(FAILED: failed_, REJECTED: rejected_, SUCCEEDED: succeeded_, UNHANDLED: unhandled_): AnonFAILED = {
    val __obj = js.Dynamic.literal(FAILED = FAILED.asInstanceOf[js.Any], REJECTED = REJECTED.asInstanceOf[js.Any], SUCCEEDED = SUCCEEDED.asInstanceOf[js.Any], UNHANDLED = UNHANDLED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFAILED]
  }
  @scala.inline
  implicit class AnonFAILEDOps[Self <: AnonFAILED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAILED(value: failed_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREJECTED(value: rejected_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REJECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUCCEEDED(value: succeeded_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNHANDLED(value: unhandled_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNHANDLED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

