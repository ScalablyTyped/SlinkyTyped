package typingsSlinky.materialUi.MaterialUI

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUi.MaterialUI.List.ListItemProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menus {
  
  type DropDownMenu = ReactComponentClass[DropDownMenuProps]
  
  @js.native
  trait DropDownMenuProps extends StObject {
    
    // <div/> is the element that gets the 'other' properties
    var anchorOrigin: js.UndefOr[origin] = js.native
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var animation: js.UndefOr[ReactComponentClass[PopoverAnimationProps]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var iconButton: js.UndefOr[ReactElement] = js.native
    
    var iconStyle: js.UndefOr[CSSProperties] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    var listStyle: js.UndefOr[CSSProperties] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var menuItemStyle: js.UndefOr[CSSProperties] = js.native
    
    var menuStyle: js.UndefOr[CSSProperties] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* e */ SyntheticEvent[Event, js.Object], 
          /* index */ Double, 
          /* menuItemValue */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, js.Object], Unit]] = js.native
    
    var openImmediately: js.UndefOr[Boolean] = js.native
    
    var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.native
    
    var selectionRenderer: js.UndefOr[js.Function2[/* value */ js.Any, /* menuItem */ js.Any, Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var targetOrigin: js.UndefOr[origin] = js.native
    
    var underlineStyle: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object DropDownMenuProps {
    
    @scala.inline
    def apply(): DropDownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDownMenuProps]
    }
    
    @scala.inline
    implicit class DropDownMenuPropsMutableBuilder[Self <: DropDownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAnimation(value: ReactComponentClass[PopoverAnimationProps]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIconButton(value: ReactElement): Self = StObject.set(x, "iconButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconButtonReactElement(value: ReactElement): Self = StObject.set(x, "iconButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconButtonUndefined: Self = StObject.set(x, "iconButton", js.undefined)
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
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
      def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* e */ SyntheticEvent[Event, js.Object], /* index */ Double, /* menuItemValue */ js.Any) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* e */ SyntheticEvent[Event, js.Object] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOpenImmediately(value: Boolean): Self = StObject.set(x, "openImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenImmediatelyUndefined: Self = StObject.set(x, "openImmediately", js.undefined)
      
      @scala.inline
      def setSelectedMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedMenuItemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMenuItemStyleUndefined: Self = StObject.set(x, "selectedMenuItemStyle", js.undefined)
      
      @scala.inline
      def setSelectionRenderer(value: (/* value */ js.Any, /* menuItem */ js.Any) => Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
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
  
  type IconMenu = ReactComponentClass[IconMenuProps]
  
  @js.native
  trait IconMenuProps extends StObject {
    
    // <Menu/> is the element that get the 'other' properties
    var anchorOrigin: js.UndefOr[origin] = js.native
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var animation: js.UndefOr[ReactComponentClass[PopoverAnimationProps]] = js.native
    
    // Other properties from <Menu/>
    var autoWidth: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clickCloseDelay: js.UndefOr[Double] = js.native
    
    var desktop: js.UndefOr[Boolean] = js.native
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.native
    
    var iconButtonElement: ReactElement = js.native
    
    var iconStyle: js.UndefOr[CSSProperties] = js.native
    
    var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.native
    
    var listStyle: js.UndefOr[CSSProperties] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var menuStyle: js.UndefOr[CSSProperties] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[Event, js.Object], /* itemValue */ js.Any | js.Array[_], Unit]
      ] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, js.Object], Unit]] = js.native
    
    var onItemClick: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[Event, js.Object], ReactComponentClass[MenuItemProps], Unit]
      ] = js.native
    
    var onKeyboardFocus: js.UndefOr[
        js.Function2[/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
      ] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.native
    
    var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var targetOrigin: js.UndefOr[origin] = js.native
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[js.Any | js.Array[_]] = js.native
  }
  object IconMenuProps {
    
    @scala.inline
    def apply(iconButtonElement: ReactElement): IconMenuProps = {
      val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconMenuProps]
    }
    
    @scala.inline
    implicit class IconMenuPropsMutableBuilder[Self <: IconMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAnimation(value: ReactComponentClass[PopoverAnimationProps]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClickCloseDelay(value: Double): Self = StObject.set(x, "clickCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickCloseDelayUndefined: Self = StObject.set(x, "clickCloseDelay", js.undefined)
      
      @scala.inline
      def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      @scala.inline
      def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      @scala.inline
      def setIconButtonElement(value: ReactElement): Self = StObject.set(x, "iconButtonElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setInitiallyKeyboardFocused(value: Boolean): Self = StObject.set(x, "initiallyKeyboardFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyKeyboardFocusedUndefined: Self = StObject.set(x, "initiallyKeyboardFocused", js.undefined)
      
      @scala.inline
      def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* e */ SyntheticEvent[Event, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticEvent[Event, js.Object] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: (/* e */ SyntheticEvent[Event, js.Object], ReactComponentClass[MenuItemProps]) => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = StObject.set(x, "onKeyboardFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyboardFocusUndefined: Self = StObject.set(x, "onKeyboardFocus", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): Self = StObject.set(x, "onRequestChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRequestChangeUndefined: Self = StObject.set(x, "onRequestChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      @scala.inline
      def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any | js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type Menu = ReactComponentClass[MenuProps]
  
  type MenuItem = ReactComponentClass[MenuItemProps]
  
  @js.native
  trait MenuItemProps extends ListItemProps {
    
    // <ListItem/> is the element that get the 'other' properties
    var animation: js.UndefOr[ReactComponentClass[PopoverAnimationProps]] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    @JSName("containerElement")
    var containerElement_MenuItemProps: js.UndefOr[ReactElement | String] = js.native
    
    var desktop: js.UndefOr[Boolean] = js.native
    
    var focusState: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String | ReactElement] = js.native
    
    var menuItems: js.UndefOr[ReactElement] = js.native
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: ReactComponentClass[PopoverAnimationProps]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setContainerElement(value: ReactElement | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElementReactElement(value: ReactElement): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      @scala.inline
      def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      @scala.inline
      def setFocusState(value: String): Self = StObject.set(x, "focusState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusStateUndefined: Self = StObject.set(x, "focusState", js.undefined)
      
      @scala.inline
      def setLabel(value: String | ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMenuItems(value: ReactElement): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsReactElement(value: ReactElement): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    }
  }
  
  @js.native
  trait MenuProps extends StObject {
    
    // <List/> is the element that get the 'other' properties
    var autoWidth: js.UndefOr[Boolean] = js.native
    
    var desktop: js.UndefOr[Boolean] = js.native
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.native
    
    var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.native
    
    var listStyle: js.UndefOr[CSSProperties] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[Event, js.Object], /* itemValue */ js.Any | js.Array[_], Unit]
      ] = js.native
    
    var onEscKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
    
    var onItemClick: js.UndefOr[
        js.Function2[/* e */ SyntheticEvent[Event, js.Object], ReactComponentClass[MenuItemProps], Unit]
      ] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
    
    var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[js.Any | js.Array[_]] = js.native
    
    var valueLink: js.UndefOr[ReactLink[_ | js.Array[_]]] = js.native
    
    var width: js.UndefOr[String | Double] = js.native
  }
  object MenuProps {
    
    @scala.inline
    def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    @scala.inline
    implicit class MenuPropsMutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      @scala.inline
      def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      @scala.inline
      def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      @scala.inline
      def setInitiallyKeyboardFocused(value: Boolean): Self = StObject.set(x, "initiallyKeyboardFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyKeyboardFocusedUndefined: Self = StObject.set(x, "initiallyKeyboardFocused", js.undefined)
      
      @scala.inline
      def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* e */ SyntheticEvent[Event, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnEscKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onEscKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscKeyDownUndefined: Self = StObject.set(x, "onEscKeyDown", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: (/* e */ SyntheticEvent[Event, js.Object], ReactComponentClass[MenuItemProps]) => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setSelectedMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedMenuItemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMenuItemStyleUndefined: Self = StObject.set(x, "selectedMenuItemStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any | js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLink(value: ReactLink[_ | js.Array[_]]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
