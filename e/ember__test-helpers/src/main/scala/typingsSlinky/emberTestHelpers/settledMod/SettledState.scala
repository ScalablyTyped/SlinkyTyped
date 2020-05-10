package typingsSlinky.emberTestHelpers.settledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettledState extends js.Object {
  var hasPendingRequests: Boolean = js.native
  var hasPendingTimers: Boolean = js.native
  var hasPendingWaiters: Boolean = js.native
  var hasRunLoop: Boolean = js.native
  var pendingRequestCount: Double = js.native
}

object SettledState {
  @scala.inline
  def apply(
    hasPendingRequests: Boolean,
    hasPendingTimers: Boolean,
    hasPendingWaiters: Boolean,
    hasRunLoop: Boolean,
    pendingRequestCount: Double
  ): SettledState = {
    val __obj = js.Dynamic.literal(hasPendingRequests = hasPendingRequests.asInstanceOf[js.Any], hasPendingTimers = hasPendingTimers.asInstanceOf[js.Any], hasPendingWaiters = hasPendingWaiters.asInstanceOf[js.Any], hasRunLoop = hasRunLoop.asInstanceOf[js.Any], pendingRequestCount = pendingRequestCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettledState]
  }
  @scala.inline
  implicit class SettledStateOps[Self <: SettledState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasPendingRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPendingRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPendingTimers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPendingTimers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPendingWaiters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPendingWaiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRunLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRunLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

