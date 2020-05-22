package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VizRange extends js.Object {
  /** @name VizRange.endValue */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  /** @name VizRange.length */
  var length: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name VizRange.startValue */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}

object VizRange {
  @scala.inline
  def apply(
    endValue: Double | js.Date | String = null,
    length: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    startValue: Double | js.Date | String = null
  ): VizRange = {
    val __obj = js.Dynamic.literal()
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VizRange]
  }
}

