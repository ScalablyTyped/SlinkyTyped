package typingsSlinky.rmcCalendar.dataTypesMod.Models

import slinky.core.TagMod
import typingsSlinky.rmcCalendar.singleMonthMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthData extends js.Object {
  var component: js.UndefOr[TagMod[Any]] = js.undefined
  var componentRef: js.UndefOr[default] = js.undefined
  var firstDate: js.Date
  var height: js.UndefOr[Double] = js.undefined
  var lastDate: js.Date
  var title: String
  var updateLayout: js.UndefOr[js.Function] = js.undefined
  var weeks: js.Array[js.Array[CellData]]
  var y: js.UndefOr[Double] = js.undefined
}

object MonthData {
  @scala.inline
  def apply(
    firstDate: js.Date,
    lastDate: js.Date,
    title: String,
    weeks: js.Array[js.Array[CellData]],
    component: TagMod[Any] = null,
    componentRef: default = null,
    height: js.UndefOr[Double] = js.undefined,
    updateLayout: js.Function = null,
    y: js.UndefOr[Double] = js.undefined
  ): MonthData = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (updateLayout != null) __obj.updateDynamic("updateLayout")(updateLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthData]
  }
}

