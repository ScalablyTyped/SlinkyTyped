package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisStrips extends dxChartCommonAxisSettingsStripStyle {
  /** @name dxChart.Options.valueAxis.strips.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.valueAxis.strips.endValue */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  /** @name dxChart.Options.valueAxis.strips.label */
  @JSName("label")
  var label_dxChartValueAxisStrips: js.UndefOr[dxChartValueAxisStripsLabel] = js.undefined
  /** @name dxChart.Options.valueAxis.strips.startValue */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}

object dxChartValueAxisStrips {
  @scala.inline
  def apply(
    color: String = null,
    endValue: Double | js.Date | String = null,
    label: dxChartValueAxisStripsLabel = null,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    startValue: Double | js.Date | String = null
  ): dxChartValueAxisStrips = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisStrips]
  }
}

