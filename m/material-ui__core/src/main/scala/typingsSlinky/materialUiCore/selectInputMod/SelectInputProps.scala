package typingsSlinky.materialUiCore.selectInputMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import typingsSlinky.materialUiCore.anon.PartialMenuProps
import typingsSlinky.materialUiCore.anon.Value
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  var MenuProps: js.UndefOr[PartialMenuProps] = js.native
  var SelectDisplayProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoWidth: Boolean = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Value, Unit]] = js.native
  var multiple: Boolean = js.native
  var name: js.UndefOr[String] = js.native
  var native: Boolean = js.native
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any], Unit]
  ] = js.native
  var onClose: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[_]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]), 
      TagMod[Any]
    ]
  ] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean]) = js.native
  var variant: js.UndefOr[standard | outlined | filled] = js.native
}

object SelectInputProps {
  @scala.inline
  def apply(
    autoWidth: Boolean,
    multiple: Boolean,
    native: Boolean,
    value: String | Double | Boolean | (js.Array[String | Double | Boolean]),
    IconComponent: ReactComponentClass[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | Value => Unit = null,
    name: String = null,
    onBlur: SyntheticFocusEvent[_] => Unit = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onFocus: SyntheticFocusEvent[_] => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderValue: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => TagMod[Any] = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    variant: standard | outlined | filled = null
  ): SelectInputProps = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps.asInstanceOf[js.Any])
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInputProps]
  }
}

