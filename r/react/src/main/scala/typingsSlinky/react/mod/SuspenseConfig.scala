package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspenseConfig
  extends typingsSlinky.react.experimentalMod.reactAugmentingMod.TimeoutConfig {
  var busyDelayMs: js.UndefOr[Double] = js.native
  var busyMinDurationMs: js.UndefOr[Double] = js.native
}

object SuspenseConfig {
  @scala.inline
  def apply(timeoutMs: Double): SuspenseConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseConfig]
  }
  @scala.inline
  implicit class SuspenseConfigOps[Self <: SuspenseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusyDelayMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busyDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusyDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busyDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withBusyMinDurationMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busyMinDurationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusyMinDurationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busyMinDurationMs")(js.undefined)
        ret
    }
  }
  
}

