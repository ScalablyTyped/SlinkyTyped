package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetPasscodeActionResult extends DeviceActionResult {
  // Newly generated passcode for the device
  var passcode: js.UndefOr[String] = js.native
}

object ResetPasscodeActionResult {
  @scala.inline
  def apply(): ResetPasscodeActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPasscodeActionResult]
  }
  @scala.inline
  implicit class ResetPasscodeActionResultOps[Self <: ResetPasscodeActionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPasscode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcode")(js.undefined)
        ret
    }
  }
  
}

