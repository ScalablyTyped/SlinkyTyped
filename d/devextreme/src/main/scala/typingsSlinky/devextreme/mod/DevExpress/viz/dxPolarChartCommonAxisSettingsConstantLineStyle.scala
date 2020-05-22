package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsConstantLineStyle extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle.label */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyleLabel] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxPolarChartCommonAxisSettingsConstantLineStyle {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    label: dxPolarChartCommonAxisSettingsConstantLineStyleLabel = null,
    width: js.UndefOr[Double] = js.undefined
  ): dxPolarChartCommonAxisSettingsConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsConstantLineStyle]
  }
}

