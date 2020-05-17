package typingsSlinky.rcMenu.menuItemMod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.rcMenu.anon.Hover
import typingsSlinky.rcMenu.interfaceMod.DestroyEventHandler
import typingsSlinky.rcMenu.interfaceMod.HoverEventHandler
import typingsSlinky.rcMenu.interfaceMod.LegacyFunctionRef
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuHoverEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.RenderIconType
import typingsSlinky.rcMenu.interfaceMod.SelectEventHandler
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.rcMenu.rcMenuStrings.ltr
import typingsSlinky.rcMenu.rcMenuStrings.rtl
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  /** @deprecated No place to use this. Should remove */
  var attribute: js.UndefOr[Record[String, String]] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var eventKey: js.UndefOr[Key] = js.native
  var inlineIndent: js.UndefOr[Double] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var itemIcon: js.UndefOr[RenderIconType] = js.native
  var level: js.UndefOr[Double] = js.native
  var manualRef: js.UndefOr[LegacyFunctionRef] = js.native
  var mode: js.UndefOr[MenuMode] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[MenuClickEventHandler] = js.native
  var onDeselect: js.UndefOr[SelectEventHandler] = js.native
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.native
  var onItemHover: js.UndefOr[HoverEventHandler] = js.native
  var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.native
  var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.native
  var onSelect: js.UndefOr[SelectEventHandler] = js.native
  var parentMenu: js.UndefOr[ReactInstance] = js.native
  var role: js.UndefOr[String] = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  var selectedKeys: js.UndefOr[js.Array[String]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[String] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAttribute(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
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
    def withEventKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withItemIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIconFunction1(value: /* props */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItemIcon(value: RenderIconType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRef(value: /* node */ ReactInstance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutManualRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRef")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: MenuMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
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
    def withOnClick(value: /* info */ MenuInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeselect(value: /* info */ SelectInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroy(value: /* key */ Key => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemHover(value: /* info */ Hover => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* info */ SelectInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withParentMenuElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentMenuComponent(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentMenu(value: ReactInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withRootPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(js.undefined)
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

