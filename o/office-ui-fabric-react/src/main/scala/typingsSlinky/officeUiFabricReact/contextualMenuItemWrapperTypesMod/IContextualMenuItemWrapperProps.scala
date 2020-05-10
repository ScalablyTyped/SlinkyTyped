package typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperTypesMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IContextualMenuItemWrapperPropsOps[Self <: IContextualMenuItemWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNames(value: IMenuItemClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusableElementIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusableElementIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: IContextualMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ContextualMenuItemWrapper | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ContextualMenuItemWrapper]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ContextualMenuItemWrapper]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withContextualMenuItemAsFunctionComponent(value: ReactComponentClass[IContextualMenuItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextualMenuItemAsComponentClass(value: ReactComponentClass[IContextualMenuItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextualMenuItemAs(value: ReactComponentClass[IContextualMenuItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualMenuItemAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuItemAs")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissMenu(value: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDismissMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissSubMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissSubMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDismissSubMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissSubMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteItemClick(
      value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeItemClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExecuteItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedMenuItemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedMenuItemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedMenuItemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedMenuItemKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubMenuId(value: /* item */ IContextualMenuItem => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubMenuId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSubMenuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubMenuId")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCheckmarks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCheckmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCheckmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCheckmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withHasIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(
      value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClickBase(
      value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], /* target */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClickBase")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemClickBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClickBase")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemKeyDown(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticKeyboardEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemMouseDown(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemMouseEnter(
      value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemMouseLeave(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemMouseMove(
      value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTap(value: /* ev */ SyntheticTouchEvent[HTMLElement] | PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenSubMenu(value: (/* item */ js.Any, /* target */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSubMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOpenSubMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSubMenu")(js.undefined)
        ret
    }
  }
  
}

