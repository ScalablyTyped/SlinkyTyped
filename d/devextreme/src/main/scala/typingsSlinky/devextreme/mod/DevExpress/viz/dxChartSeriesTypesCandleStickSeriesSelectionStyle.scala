package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user selects it. */
trait dxChartSeriesTypesCandleStickSeriesSelectionStyle extends dxChartSeriesTypesCommonSeriesSelectionStyle {
  /** Configures hatching that applies when a user selects the series. */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching] = js.undefined
}

object dxChartSeriesTypesCandleStickSeriesSelectionStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesCommonSeriesSelectionStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching = null,
    width: Int | Double = null
  ): dxChartSeriesTypesCandleStickSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesSelectionStyle]
  }
}

