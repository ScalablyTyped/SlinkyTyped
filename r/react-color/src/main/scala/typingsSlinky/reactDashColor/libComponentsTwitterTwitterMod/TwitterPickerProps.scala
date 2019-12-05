package typingsSlinky.reactDashColor.libComponentsTwitterTwitterMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.reactDashColor.reactDashColorMod.Color
import typingsSlinky.reactDashColor.reactDashColorMod.ColorPickerProps
import typingsSlinky.reactDashColor.reactDashColorMod.ColorResult
import typingsSlinky.reactDashColor.reactDashColorStrings.`top-left`
import typingsSlinky.reactDashColor.reactDashColorStrings.`top-right`
import typingsSlinky.reactDashColor.reactDashColorStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterPickerProps extends ColorPickerProps[TwitterPicker] {
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object TwitterPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    colors: js.Array[String] = null,
    key: Key = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: LegacyRef[TwitterPicker] = null,
    triangle: hide | `top-left` | `top-right` = null,
    width: String = null
  ): TwitterPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterPickerProps]
  }
}

