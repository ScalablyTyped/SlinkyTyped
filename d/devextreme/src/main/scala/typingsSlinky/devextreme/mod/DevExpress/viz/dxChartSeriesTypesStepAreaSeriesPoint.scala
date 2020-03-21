package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonColorVisible
import typingsSlinky.devextreme.AnonHeightUrl
import typingsSlinky.devextreme.AnonSize
import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.cross
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import typingsSlinky.devextreme.devextremeStrings.polygon
import typingsSlinky.devextreme.devextremeStrings.square
import typingsSlinky.devextreme.devextremeStrings.triangleDown
import typingsSlinky.devextreme.devextremeStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures series points in scatter, line- and area-like series. */
trait dxChartSeriesTypesStepAreaSeriesPoint extends dxChartSeriesTypesCommonSeriesPoint

object dxChartSeriesTypesStepAreaSeriesPoint {
  @scala.inline
  def apply(
    border: AnonColorVisible = null,
    color: String = null,
    hoverMode: allArgumentPoints | allSeriesPoints | none | onlyPoint = null,
    hoverStyle: AnonSize = null,
    image: String | AnonHeightUrl = null,
    selectionMode: allArgumentPoints | allSeriesPoints | none | onlyPoint = null,
    selectionStyle: AnonSize = null,
    size: Int | Double = null,
    symbol: circle | cross | polygon | square | triangleDown | triangleUp = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxChartSeriesTypesStepAreaSeriesPoint = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesPoint]
  }
}

