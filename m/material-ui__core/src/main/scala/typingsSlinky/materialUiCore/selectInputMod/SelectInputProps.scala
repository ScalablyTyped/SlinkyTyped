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
    value: String | Double | Boolean | (js.Array[String | Double | Boolean])
  ): SelectInputProps = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInputProps]
  }
  @scala.inline
  implicit class SelectInputPropsOps[Self <: SelectInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuProps(value: PartialMenuProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectDisplayProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectDisplayProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectDisplayProps")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRef(value: /* ref */ HTMLSelectElement | Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* event */ ChangeEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* event */ ChangeEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderValue(
      value: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: standard | outlined | filled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

