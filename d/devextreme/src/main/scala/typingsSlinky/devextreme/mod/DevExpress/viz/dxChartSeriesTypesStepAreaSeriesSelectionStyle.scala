package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.StepAreaSeries.selectionStyle */
trait dxChartSeriesTypesStepAreaSeriesSelectionStyle extends dxChartSeriesTypesCommonSeriesSelectionStyle {
  /** @name dxChartSeriesTypes.StepAreaSeries.selectionStyle.border */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder] = js.undefined
}

object dxChartSeriesTypesStepAreaSeriesSelectionStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCommonSeriesSelectionStyleHatching = null,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartSeriesTypesStepAreaSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesSelectionStyle]
  }
}

