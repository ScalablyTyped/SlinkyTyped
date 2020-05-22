package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ColorLength
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxLinearGaugeScale extends BaseGaugeScale {
  /** @name dxLinearGauge.Options.scale.horizontalOrientation */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.undefined
  /** @name dxLinearGauge.Options.scale.label */
  @JSName("label")
  var label_dxLinearGaugeScale: js.UndefOr[dxLinearGaugeScaleLabel] = js.undefined
  /** @name dxLinearGauge.Options.scale.verticalOrientation */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.undefined
}

object dxLinearGaugeScale {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    customMinorTicks: js.Array[Double] = null,
    customTicks: js.Array[Double] = null,
    endValue: js.UndefOr[Double] = js.undefined,
    horizontalOrientation: center | left | right = null,
    label: dxLinearGaugeScaleLabel = null,
    minorTick: ColorLength = null,
    minorTickInterval: js.UndefOr[Double] = js.undefined,
    scaleDivisionFactor: js.UndefOr[Double] = js.undefined,
    startValue: js.UndefOr[Double] = js.undefined,
    tick: ColorLength = null,
    tickInterval: js.UndefOr[Double] = js.undefined,
    verticalOrientation: bottom | center | top = null
  ): dxLinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (customMinorTicks != null) __obj.updateDynamic("customMinorTicks")(customMinorTicks.asInstanceOf[js.Any])
    if (customTicks != null) __obj.updateDynamic("customTicks")(customTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (horizontalOrientation != null) __obj.updateDynamic("horizontalOrientation")(horizontalOrientation.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickInterval)) __obj.updateDynamic("minorTickInterval")(minorTickInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleDivisionFactor)) __obj.updateDynamic("scaleDivisionFactor")(scaleDivisionFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    if (verticalOrientation != null) __obj.updateDynamic("verticalOrientation")(verticalOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxLinearGaugeScale]
  }
}

