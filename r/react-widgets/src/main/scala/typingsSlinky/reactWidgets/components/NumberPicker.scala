package typingsSlinky.reactWidgets.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactWidgets.mod.NumberPicker.^
import typingsSlinky.reactWidgets.numberPickerMod.NumberPickerMessages
import typingsSlinky.reactWidgets.numberPickerMod.NumberPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NumberPicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-widgets", "NumberPicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, id, name, open, placeholder */
  def apply(
    culture: String = null,
    defaultValue: Int | Double = null,
    disabled: Boolean | js.Array[_] = null,
    format: js.Any = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    messages: NumberPickerMessages = null,
    min: Int | Double = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    onKeyDown: /* event */ KeyboardEvent => Unit = null,
    onKeyPress: /* event */ KeyboardEvent => Unit = null,
    parse: js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double]) = null,
    precision: Int | Double = null,
    readOnly: Boolean | js.Array[_] = null,
    step: Int | Double = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactWidgets.mod.NumberPicker.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NumberPickerProps
}

