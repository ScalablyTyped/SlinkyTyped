package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuItemWrapperTypesMod {
  
  @js.native
  trait IContextualMenuItemWrapperProps extends ClassAttributes[IContextualMenuItem] {
    
    /**
      * CSS class to apply to the context menu.
      */
    var classNames: IMenuItemClassNames = js.native
    
    /**
      * Optional callback to access the ContextualMenuSplitButton interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ContextualMenuItemWrapper]] = js.native
    
    /**
      * Method to override the render of the individual menu items.
      * @defaultvalue ContextualMenuItem
      */
    var contextualMenuItemAs: js.UndefOr[ReactComponentClass[IContextualMenuItemProps]] = js.native
    
    /**
      * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
      * If dismissAll is true, all menus will be closed.
      */
    var dismissMenu: js.UndefOr[
        js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /**
      * This prop will get set by ContextualMenu and can be called to close this item's subMenu, if present.
      */
    var dismissSubMenu: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback for when the click event on the primary button.
      */
    var executeItemClick: js.UndefOr[
        js.Function2[
          /* item */ IContextualMenuItem, 
          /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.native
    
    /**
      * Key of the currently expanded subMenu.
      */
    var expandedMenuItemKey: js.UndefOr[String] = js.native
    
    /**
      * The index number of the wrapper among all items in the contextual menu excluding dividers and headers.
      */
    var focusableElementIndex: Double = js.native
    
    /**
      * Callback to get the subMenu ID for an IContextualMenuItem.
      */
    var getSubMenuId: js.UndefOr[js.Function1[/* item */ IContextualMenuItem, js.UndefOr[String]]] = js.native
    
    /**
      * Whether or not if the item for the wrapper uses checkmarks.
      */
    var hasCheckmarks: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the item for the wrapper uses icons.
      */
    var hasIcons: js.UndefOr[Boolean] = js.native
    
    /**
      * The index number of the wrapper among all items in the contextual menu including things like dividers and headers.
      */
    var index: Double = js.native
    
    /**
      * The IContextualMenuItem that is used to render the item in the menu.
      */
    var item: IContextualMenuItem = js.native
    
    /**
      * Callback for when the click event on the icon button from the wrapper.
      */
    var onItemClick: js.UndefOr[
        js.Function2[
          /* item */ IContextualMenuItem, 
          /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.native
    
    /**
      * Callback for when the click event on the icon button which also takes in a specific HTMLElement
      * that will be focused.
      */
    var onItemClickBase: js.UndefOr[
        js.Function3[
          /* item */ IContextualMenuItem, 
          /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], 
          /* target */ HTMLElement, 
          Unit
        ]
      ] = js.native
    
    /**
      * Callback for keyboard events on the wrapper.
      */
    var onItemKeyDown: js.UndefOr[
        js.Function2[/* item */ IContextualMenuItem, /* ev */ SyntheticKeyboardEvent[HTMLElement], Unit]
      ] = js.native
    
    /**
      * Callback for the mousedown event on the icon button in the wrapper.
      */
    var onItemMouseDown: js.UndefOr[
        js.Function2[/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], Unit]
      ] = js.native
    
    /**
      * Callback for when the user's mouse enters the wrapper.
      */
    var onItemMouseEnter: js.UndefOr[
        js.Function3[
          /* item */ IContextualMenuItem, 
          /* ev */ SyntheticMouseEvent[HTMLElement], 
          /* target */ HTMLElement, 
          Boolean | Unit
        ]
      ] = js.native
    
    /**
      * Callback for when the user's mouse leaves the wrapper.
      */
    var onItemMouseLeave: js.UndefOr[
        js.Function2[/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], Unit]
      ] = js.native
    
    /**
      * Callback for when the user's mouse moves in the wrapper.
      */
    var onItemMouseMove: js.UndefOr[
        js.Function3[
          /* item */ IContextualMenuItem, 
          /* ev */ SyntheticMouseEvent[HTMLElement], 
          /* target */ HTMLElement, 
          Unit
        ]
      ] = js.native
    
    /**
      * Callback for touch/pointer events on the split button.
      */
    var onTap: js.UndefOr[js.Function1[/* ev */ SyntheticTouchEvent[HTMLElement] | PointerEvent, Unit]] = js.native
    
    /**
      * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
      */
    var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ HTMLElement, Unit]] = js.native
    
    /**
      * The total number of items in the contextual menu.
      */
    var totalItemCount: Double = js.native
  }
  object IContextualMenuItemWrapperProps {
    
    @scala.inline
    def apply(
      classNames: IMenuItemClassNames,
      focusableElementIndex: Double,
      index: Double,
      item: IContextualMenuItem,
      totalItemCount: Double
    ): IContextualMenuItemWrapperProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuItemWrapperProps]
    }
    
    @scala.inline
    implicit class IContextualMenuItemWrapperPropsMutableBuilder[Self <: IContextualMenuItemWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: IMenuItemClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRef(value: IRefObject[ContextualMenuItemWrapper]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ContextualMenuItemWrapper | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[ContextualMenuItemWrapper]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setContextualMenuItemAs(value: ReactComponentClass[IContextualMenuItemProps]): Self = StObject.set(x, "contextualMenuItemAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextualMenuItemAsComponentClass(value: ReactComponentClass[IContextualMenuItemProps]): Self = StObject.set(x, "contextualMenuItemAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextualMenuItemAsFunctionComponent(value: ReactComponentClass[IContextualMenuItemProps]): Self = StObject.set(x, "contextualMenuItemAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextualMenuItemAsUndefined: Self = StObject.set(x, "contextualMenuItemAs", js.undefined)
      
      @scala.inline
      def setDismissMenu(value: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "dismissMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDismissMenuUndefined: Self = StObject.set(x, "dismissMenu", js.undefined)
      
      @scala.inline
      def setDismissSubMenu(value: () => Unit): Self = StObject.set(x, "dismissSubMenu", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDismissSubMenuUndefined: Self = StObject.set(x, "dismissSubMenu", js.undefined)
      
      @scala.inline
      def setExecuteItemClick(
        value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit
      ): Self = StObject.set(x, "executeItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExecuteItemClickUndefined: Self = StObject.set(x, "executeItemClick", js.undefined)
      
      @scala.inline
      def setExpandedMenuItemKey(value: String): Self = StObject.set(x, "expandedMenuItemKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedMenuItemKeyUndefined: Self = StObject.set(x, "expandedMenuItemKey", js.undefined)
      
      @scala.inline
      def setFocusableElementIndex(value: Double): Self = StObject.set(x, "focusableElementIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSubMenuId(value: /* item */ IContextualMenuItem => js.UndefOr[String]): Self = StObject.set(x, "getSubMenuId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSubMenuIdUndefined: Self = StObject.set(x, "getSubMenuId", js.undefined)
      
      @scala.inline
      def setHasCheckmarks(value: Boolean): Self = StObject.set(x, "hasCheckmarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCheckmarksUndefined: Self = StObject.set(x, "hasCheckmarks", js.undefined)
      
      @scala.inline
      def setHasIcons(value: Boolean): Self = StObject.set(x, "hasIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasIconsUndefined: Self = StObject.set(x, "hasIcons", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: IContextualMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnItemClick(
        value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickBase(
        value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], /* target */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onItemClickBase", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnItemClickBaseUndefined: Self = StObject.set(x, "onItemClickBase", js.undefined)
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnItemKeyDown(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticKeyboardEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onItemKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemKeyDownUndefined: Self = StObject.set(x, "onItemKeyDown", js.undefined)
      
      @scala.inline
      def setOnItemMouseDown(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onItemMouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemMouseDownUndefined: Self = StObject.set(x, "onItemMouseDown", js.undefined)
      
      @scala.inline
      def setOnItemMouseEnter(
        value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Boolean | Unit
      ): Self = StObject.set(x, "onItemMouseEnter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnItemMouseEnterUndefined: Self = StObject.set(x, "onItemMouseEnter", js.undefined)
      
      @scala.inline
      def setOnItemMouseLeave(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onItemMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemMouseLeaveUndefined: Self = StObject.set(x, "onItemMouseLeave", js.undefined)
      
      @scala.inline
      def setOnItemMouseMove(
        value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onItemMouseMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnItemMouseMoveUndefined: Self = StObject.set(x, "onItemMouseMove", js.undefined)
      
      @scala.inline
      def setOnTap(value: /* ev */ SyntheticTouchEvent[HTMLElement] | PointerEvent => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setOpenSubMenu(value: (/* item */ js.Any, /* target */ HTMLElement) => Unit): Self = StObject.set(x, "openSubMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpenSubMenuUndefined: Self = StObject.set(x, "openSubMenu", js.undefined)
      
      @scala.inline
      def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    }
  }
}
