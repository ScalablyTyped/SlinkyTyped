package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.hoverStyle */
trait dxChartSeriesTypesCommonSeriesHoverStyle extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.border */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleBorder] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.hatching */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleHatching] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesHoverStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesCommonSeriesHoverStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCommonSeriesHoverStyleHatching = null,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartSeriesTypesCommonSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesHoverStyle]
  }
}

