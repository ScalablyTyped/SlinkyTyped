package typingsSlinky.materialUi.MaterialUI

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.materialUi.MaterialUI.Menus.DropDownMenuProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FocusEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectFieldProps extends StObject {
  
  // <DropDownMenu/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[Boolean] = js.native
  
  // useful attributes passed to <DropDownMenu/>
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dropDownMenuProps: js.UndefOr[DropDownMenuProps] = js.native
  
  var errorStyle: js.UndefOr[CSSProperties] = js.native
  
  var errorText: js.UndefOr[ReactElement] = js.native
  
  var floatingLabelFixed: js.UndefOr[Boolean] = js.native
  
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelText: js.UndefOr[ReactElement] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var hintStyle: js.UndefOr[CSSProperties] = js.native
  
  var hintText: js.UndefOr[ReactElement] = js.native
  
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
  
  var selectionRenderer: js.UndefOr[js.Function1[/* value */ js.Any, ReactElement]] = js.native
  
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
  implicit class SelectFieldPropsMutableBuilder[Self <: SelectFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropDownMenuProps(value: DropDownMenuProps): Self = StObject.set(x, "dropDownMenuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownMenuPropsUndefined: Self = StObject.set(x, "dropDownMenuProps", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: CSSProperties): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    @scala.inline
    def setErrorText(value: ReactElement): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextReactElement(value: ReactElement): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    @scala.inline
    def setFloatingLabelFixed(value: Boolean): Self = StObject.set(x, "floatingLabelFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelFixedUndefined: Self = StObject.set(x, "floatingLabelFixed", js.undefined)
    
    @scala.inline
    def setFloatingLabelStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelStyleUndefined: Self = StObject.set(x, "floatingLabelStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelText(value: ReactElement): Self = StObject.set(x, "floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelTextReactElement(value: ReactElement): Self = StObject.set(x, "floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelTextUndefined: Self = StObject.set(x, "floatingLabelText", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHintStyle(value: CSSProperties): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    @scala.inline
    def setHintText(value: ReactElement): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintTextReactElement(value: ReactElement): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "menuItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemStyleUndefined: Self = StObject.set(x, "menuItemStyle", js.undefined)
    
    @scala.inline
    def setMenuStyle(value: js.Any): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[js.Object] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* e */ SyntheticEvent[Event, js.Object], /* index */ Double, /* menuItemValue */ js.Any) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[js.Object] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOpenImmediately(value: Boolean): Self = StObject.set(x, "openImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenImmediatelyUndefined: Self = StObject.set(x, "openImmediately", js.undefined)
    
    @scala.inline
    def setSelectFieldRoot(value: CSSProperties): Self = StObject.set(x, "selectFieldRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFieldRootUndefined: Self = StObject.set(x, "selectFieldRoot", js.undefined)
    
    @scala.inline
    def setSelectedMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedMenuItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedMenuItemStyleUndefined: Self = StObject.set(x, "selectedMenuItemStyle", js.undefined)
    
    @scala.inline
    def setSelectionRenderer(value: /* value */ js.Any => ReactElement): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnderlineDisabledStyle(value: CSSProperties): Self = StObject.set(x, "underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineDisabledStyleUndefined: Self = StObject.set(x, "underlineDisabledStyle", js.undefined)
    
    @scala.inline
    def setUnderlineFocusStyle(value: CSSProperties): Self = StObject.set(x, "underlineFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineFocusStyleUndefined: Self = StObject.set(x, "underlineFocusStyle", js.undefined)
    
    @scala.inline
    def setUnderlineStyle(value: CSSProperties): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
