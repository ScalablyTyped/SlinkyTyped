package typingsSlinky.reactDashTapDashEventDashPlugin.reactDashTapDashEventDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOverrides extends js.Object {
  var shouldRejectClick: js.UndefOr[
    js.Function2[/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date, Boolean]
  ] = js.undefined
}

object StrategyOverrides {
  @scala.inline
  def apply(
    shouldRejectClick: (/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date) => Boolean = null
  ): StrategyOverrides = {
    val __obj = js.Dynamic.literal()
    if (shouldRejectClick != null) __obj.updateDynamic("shouldRejectClick")(js.Any.fromFunction2(shouldRejectClick))
    __obj.asInstanceOf[StrategyOverrides]
  }
}

