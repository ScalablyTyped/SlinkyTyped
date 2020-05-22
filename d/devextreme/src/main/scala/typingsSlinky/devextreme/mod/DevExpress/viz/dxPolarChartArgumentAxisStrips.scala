package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxisStrips extends dxPolarChartCommonAxisSettingsStripStyle {
  /** @name dxPolarChart.Options.argumentAxis.strips.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.strips.endValue */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.strips.label */
  @JSName("label")
  var label_dxPolarChartArgumentAxisStrips: js.UndefOr[dxPolarChartArgumentAxisStripsLabel] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.strips.startValue */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}

object dxPolarChartArgumentAxisStrips {
  @scala.inline
  def apply(
    color: String = null,
    endValue: Double | js.Date | String = null,
    label: dxPolarChartArgumentAxisStripsLabel = null,
    startValue: Double | js.Date | String = null
  ): dxPolarChartArgumentAxisStrips = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxisStrips]
  }
}

