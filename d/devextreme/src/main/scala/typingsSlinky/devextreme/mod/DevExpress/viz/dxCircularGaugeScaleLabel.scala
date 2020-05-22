package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ValueText
import typingsSlinky.devextreme.devextremeStrings.first
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.last
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxCircularGaugeScaleLabel extends BaseGaugeScaleLabel {
  /** @name dxCircularGauge.Options.scale.label.hideFirstOrLast */
  var hideFirstOrLast: js.UndefOr[first | last] = js.undefined
  /** @name dxCircularGauge.Options.scale.label.indentFromTick */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}

object dxCircularGaugeScaleLabel {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ ValueText => String = null,
    font: Font = null,
    format: format = null,
    hideFirstOrLast: first | last = null,
    indentFromTick: js.UndefOr[Double] = js.undefined,
    overlappingBehavior: hide | none = null,
    useRangeColors: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxCircularGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hideFirstOrLast != null) __obj.updateDynamic("hideFirstOrLast")(hideFirstOrLast.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFromTick)) __obj.updateDynamic("indentFromTick")(indentFromTick.get.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(useRangeColors)) __obj.updateDynamic("useRangeColors")(useRangeColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxCircularGaugeScaleLabel]
  }
}

