package typingsSlinky.emberRunloop.backburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugInfo extends js.Object {
  var autorun: js.UndefOr[js.Error | Null] = js.native
  var counters: js.Object = js.native
  var instanceStack: js.Array[DeferredActionQueues] = js.native
  var timers: js.Array[QueueItem] = js.native
}

object DebugInfo {
  @scala.inline
  def apply(counters: js.Object, instanceStack: js.Array[DeferredActionQueues], timers: js.Array[QueueItem]): DebugInfo = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any], instanceStack = instanceStack.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
  @scala.inline
  implicit class DebugInfoOps[Self <: DebugInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceStack(value: js.Array[DeferredActionQueues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimers(value: js.Array[QueueItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutorun(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutorun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorun")(js.undefined)
        ret
    }
    @scala.inline
    def withAutorunNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorun")(null)
        ret
    }
  }
  
}

