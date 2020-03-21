package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSelectStartEvent extends StockChartEvent {
  var axis: js.UndefOr[js.Any] = js.undefined
  var from: js.UndefOr[js.Date] = js.undefined
  var to: js.UndefOr[js.Date] = js.undefined
}

object StockChartSelectStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: StockChart,
    axis: js.Any = null,
    from: js.Date = null,
    to: js.Date = null
  ): StockChartSelectStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSelectStartEvent]
  }
}

