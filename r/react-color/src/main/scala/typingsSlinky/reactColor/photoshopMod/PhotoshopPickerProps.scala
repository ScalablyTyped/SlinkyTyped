package typingsSlinky.reactColor.photoshopMod

import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorChangeHandler
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoshopPickerProps extends ColorPickerProps[PhotoshopPicker] {
  var header: js.UndefOr[String] = js.undefined
  var onAccept: js.UndefOr[ColorChangeHandler] = js.undefined
  var onCancel: js.UndefOr[ColorChangeHandler] = js.undefined
}

object PhotoshopPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    header: String = null,
    key: Key = null,
    onAccept: /* color */ ColorResult => Unit = null,
    onCancel: /* color */ ColorResult => Unit = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    ref: LegacyRef[PhotoshopPicker] = null
  ): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
}

