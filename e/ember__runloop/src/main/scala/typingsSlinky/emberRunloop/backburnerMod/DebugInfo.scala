package typingsSlinky.emberRunloop.backburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInfo extends js.Object {
  var autorun: js.UndefOr[js.Error | Null] = js.undefined
  var counters: js.Object
  var instanceStack: js.Array[DeferredActionQueues]
  var timers: js.Array[QueueItem]
}

object DebugInfo {
  @scala.inline
  def apply(
    counters: js.Object,
    instanceStack: js.Array[DeferredActionQueues],
    timers: js.Array[QueueItem],
    autorun: js.UndefOr[Null | js.Error] = js.undefined
  ): DebugInfo = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any], instanceStack = instanceStack.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any])
    if (!js.isUndefined(autorun)) __obj.updateDynamic("autorun")(autorun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
}

