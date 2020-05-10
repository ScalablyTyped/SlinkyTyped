package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings._empty
import typingsSlinky.chromeApps.chromeAppsStrings.`sim-pin`
import typingsSlinky.chromeApps.chromeAppsStrings.`sim-puk`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SIMLockStatus extends js.Object {
  /** Whether SIM lock is enabled. */
  var LockEnabled: Boolean = js.native
  /** The status of SIM lock - possible values are 'sim-pin', 'sim-puk' and ''. */
  var LockType: `sim-pin` | `sim-puk` | _empty = js.native
  /** Number of PIN lock tries allowed before PUK is required to unlock the SIM. */
  var RetriesLeft: js.UndefOr[integer] = js.native
}

object SIMLockStatus {
  @scala.inline
  def apply(LockEnabled: Boolean, LockType: `sim-pin` | `sim-puk` | _empty): SIMLockStatus = {
    val __obj = js.Dynamic.literal(LockEnabled = LockEnabled.asInstanceOf[js.Any], LockType = LockType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SIMLockStatus]
  }
  @scala.inline
  implicit class SIMLockStatusOps[Self <: SIMLockStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLockEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockType(value: `sim-pin` | `sim-puk` | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetriesLeft(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetriesLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetriesLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetriesLeft")(js.undefined)
        ret
    }
  }
  
}

