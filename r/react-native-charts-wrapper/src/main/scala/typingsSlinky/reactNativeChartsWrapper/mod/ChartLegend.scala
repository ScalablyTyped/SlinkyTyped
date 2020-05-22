package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.anon.Colors
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CENTER
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DEFAULT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.EMPTY
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TO_RIGHT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.NONE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TO_LEFT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegend extends js.Object {
  var custom: js.UndefOr[Colors] = js.undefined
  var direction: js.UndefOr[LEFT_TO_RIGHT | RIGHT_TO_LEFT] = js.undefined
  var drawInside: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var form: js.UndefOr[NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE] = js.undefined
  var formSize: js.UndefOr[Double] = js.undefined
  var formToTextSpace: js.UndefOr[Double] = js.undefined
  var horizontalAlignment: js.UndefOr[LEFT | CENTER | RIGHT] = js.undefined
  var maxSizePercent: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[HORIZONTAL | VERTICAL] = js.undefined
  var textColor: js.UndefOr[Color] = js.undefined
  var textSize: js.UndefOr[Double] = js.undefined
  var verticalAlignment: js.UndefOr[TOP | CENTER | BOTTOM] = js.undefined
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  var xEntrySpace: js.UndefOr[Double] = js.undefined
  var yEntrySpace: js.UndefOr[Double] = js.undefined
}

object ChartLegend {
  @scala.inline
  def apply(
    custom: Colors = null,
    direction: LEFT_TO_RIGHT | RIGHT_TO_LEFT = null,
    drawInside: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontStyle: js.UndefOr[Double] = js.undefined,
    fontWeight: js.UndefOr[Double] = js.undefined,
    form: NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE = null,
    formSize: js.UndefOr[Double] = js.undefined,
    formToTextSpace: js.UndefOr[Double] = js.undefined,
    horizontalAlignment: LEFT | CENTER | RIGHT = null,
    maxSizePercent: js.UndefOr[Double] = js.undefined,
    orientation: HORIZONTAL | VERTICAL = null,
    textColor: js.UndefOr[Color] = js.undefined,
    textSize: js.UndefOr[Double] = js.undefined,
    verticalAlignment: TOP | CENTER | BOTTOM = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined,
    xEntrySpace: js.UndefOr[Double] = js.undefined,
    yEntrySpace: js.UndefOr[Double] = js.undefined
  ): ChartLegend = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(drawInside)) __obj.updateDynamic("drawInside")(drawInside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontStyle)) __obj.updateDynamic("fontStyle")(fontStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.get.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(formSize)) __obj.updateDynamic("formSize")(formSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formToTextSpace)) __obj.updateDynamic("formToTextSpace")(formToTextSpace.get.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSizePercent)) __obj.updateDynamic("maxSizePercent")(maxSizePercent.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(textColor)) __obj.updateDynamic("textColor")(textColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textSize)) __obj.updateDynamic("textSize")(textSize.get.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xEntrySpace)) __obj.updateDynamic("xEntrySpace")(xEntrySpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yEntrySpace)) __obj.updateDynamic("yEntrySpace")(yEntrySpace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegend]
  }
}

