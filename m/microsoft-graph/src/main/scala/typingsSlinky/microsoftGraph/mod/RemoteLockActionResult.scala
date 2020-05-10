package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteLockActionResult extends DeviceActionResult {
  // Pin to unlock the client
  var unlockPin: js.UndefOr[String] = js.native
}

object RemoteLockActionResult {
  @scala.inline
  def apply(): RemoteLockActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteLockActionResult]
  }
  @scala.inline
  implicit class RemoteLockActionResultOps[Self <: RemoteLockActionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnlockPin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockPin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlockPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockPin")(js.undefined)
        ret
    }
  }
  
}

