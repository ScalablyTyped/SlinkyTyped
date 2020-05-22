package typingsSlinky.openfin.eventsApplicationMod

import typingsSlinky.openfin.openfinStrings.`abnormal-termination`
import typingsSlinky.openfin.openfinStrings.`launch-failed`
import typingsSlinky.openfin.openfinStrings.`normal-termination`
import typingsSlinky.openfin.openfinStrings.`out-of-memory`
import typingsSlinky.openfin.openfinStrings.`still-running`
import typingsSlinky.openfin.openfinStrings.crashed
import typingsSlinky.openfin.openfinStrings.killed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashedEvent extends js.Object {
  var reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
}

object CrashedEvent {
  @scala.inline
  def apply(
    reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
  ): CrashedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashedEvent]
  }
}

