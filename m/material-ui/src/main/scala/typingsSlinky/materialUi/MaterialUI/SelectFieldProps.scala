package typingsSlinky.materialUi.MaterialUI

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.materialUi.MaterialUI.Menus.DropDownMenuProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectFieldProps extends js.Object {
  // <DropDownMenu/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[Boolean] = js.native
  // useful attributes passed to <DropDownMenu/>
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropDownMenuProps: js.UndefOr[DropDownMenuProps] = js.native
  var errorStyle: js.UndefOr[CSSProperties] = js.native
  var errorText: js.UndefOr[TagMod[Any]] = js.native
  var floatingLabelFixed: js.UndefOr[Boolean] = js.native
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.native
  var floatingLabelText: js.UndefOr[TagMod[Any]] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var hintStyle: js.UndefOr[CSSProperties] = js.native
  var hintText: js.UndefOr[TagMod[Any]] = js.native
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  var id: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var menuItemStyle: js.UndefOr[CSSProperties] = js.native
  var menuStyle: js.UndefOr[js.Any] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  var onChange: js.UndefOr[
    js.Function3[
      /* e */ SyntheticEvent[Event, js.Object], 
      /* index */ Double, 
      /* menuItemValue */ js.Any, 
      Unit
    ]
  ] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  var openImmediately: js.UndefOr[Boolean] = js.native
  var selectFieldRoot: js.UndefOr[CSSProperties] = js.native
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.native
  var selectionRenderer: js.UndefOr[js.Function1[/* value */ js.Any, TagMod[Any]]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.native
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.native
  var underlineStyle: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object SelectFieldProps {
  @scala.inline
  def apply(): SelectFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectFieldProps]
  }
  @scala.inline
  implicit class SelectFieldPropsOps[Self <: SelectFieldProps] (val x: Self) extends AnyVal {
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
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
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
    def withDropDownMenuProps(value: DropDownMenuProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMenuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownMenuProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownMenuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatingLabelText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHintStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHintTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHintText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
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
    def withOnBlur(value: SyntheticFocusEvent[js.Object] => Unit): Self = {
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
    def withOnChange(
      value: (/* e */ SyntheticEvent[Event, js.Object], /* index */ Double, /* menuItemValue */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[js.Object] => Unit): Self = {
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
    def withOpenImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectFieldRoot(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFieldRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectFieldRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFieldRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedMenuItemStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMenuItemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedMenuItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMenuItemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionRenderer(value: /* value */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineDisabledStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineDisabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineDisabledStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineDisabledStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineFocusStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineFocusStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineFocusStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineFocusStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

