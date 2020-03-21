package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisStrips extends dxChartCommonAxisSettingsStripStyle {
  /** Specifies the color of the strip. */
  var color: js.UndefOr[String] = js.undefined
  /** Along with the startValue option, limits the strip. */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  /** Configures the strip label. */
  @JSName("label")
  var label_dxChartValueAxisStrips: js.UndefOr[dxChartValueAxisStripsLabel] = js.undefined
  /** Along with the endValue option, limits the strip. */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}

object dxChartValueAxisStrips {
  @scala.inline
  def apply(
    color: String = null,
    endValue: Double | js.Date | String = null,
    label: dxChartValueAxisStripsLabel = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    startValue: Double | js.Date | String = null
  ): dxChartValueAxisStrips = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisStrips]
  }
}

