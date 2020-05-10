package typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItemProps extends HTMLAttributes[IContextualMenuItemProps] {
  /**
    * Classnames for different aspects of a menu item
    */
  var classNames: IMenuItemClassNames = js.native
  /**
    * Optional callback to access the IContextualMenuRenderItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IContextualMenuRenderItem]] = js.native
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
    * This prop will get set by the wrapping component and will return the element that wraps this ContextualMenuItem.
    * Used for openSubMenu.
    */
  var getSubmenuTarget: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.native
  /**
    * If this item has icons
    */
  var hasIcons: js.UndefOr[Boolean] = js.native
  /**
    * Index of the item
    */
  var index: Double = js.native
  /**
    * The item to display
    */
  var item: IContextualMenuItem = js.native
  /**
    * Click handler for the checkmark
    */
  var onCheckmarkClick: js.UndefOr[
    js.Function2[/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  /**
    * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
    */
  var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ HTMLElement, Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IContextualMenuItemProps {
  @scala.inline
  def apply(classNames: IMenuItemClassNames, index: Double, item: IContextualMenuItem): IContextualMenuItemProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemProps]
  }
  @scala.inline
  implicit class IContextualMenuItemPropsOps[Self <: IContextualMenuItemProps] (val x: Self) extends AnyVal {
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
    def withComponentRefFunction1(value: /* ref */ IContextualMenuRenderItem | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IContextualMenuRenderItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IContextualMenuRenderItem]): Self = {
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
    def withGetSubmenuTarget(value: () => js.UndefOr[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmenuTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubmenuTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmenuTarget")(js.undefined)
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
    def withOnCheckmarkClick(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckmarkClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCheckmarkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckmarkClick")(js.undefined)
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
    @scala.inline
    def withStylesFunction1(value: IContextualMenuItemStyleProps => Partial[IContextualMenuItemStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

