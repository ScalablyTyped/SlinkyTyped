package typingsSlinky.reactColor.circleMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclePickerProps extends ColorPickerProps[CirclePicker] {
  var circleSize: js.UndefOr[Double] = js.undefined
  var circleSpacing: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object CirclePickerProps {
  @scala.inline
  def apply(
    circleSize: js.UndefOr[Double] = js.undefined,
    circleSpacing: js.UndefOr[Double] = js.undefined,
    color: Color = null,
    colors: js.Array[String] = null,
    key: Key = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[CirclePicker]] = js.undefined,
    width: String = null
  ): CirclePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circleSize)) __obj.updateDynamic("circleSize")(circleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circleSpacing)) __obj.updateDynamic("circleSpacing")(circleSpacing.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CirclePickerProps]
  }
}

