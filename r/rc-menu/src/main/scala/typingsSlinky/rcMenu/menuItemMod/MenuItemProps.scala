package typingsSlinky.rcMenu.menuItemMod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
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

trait MenuItemProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  /** @deprecated No place to use this. Should remove */
  var attribute: js.UndefOr[Record[String, String]] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[Key] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var itemIcon: js.UndefOr[RenderIconType] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var manualRef: js.UndefOr[LegacyFunctionRef] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.undefined
  var onItemHover: js.UndefOr[HoverEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
  var parentMenu: js.UndefOr[ReactInstance] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAttribute(value: Record[String, String]): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEventKey(value: Key): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    @scala.inline
    def setInlineIndent(value: Double): Self = this.set("inlineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineIndent: Self = this.set("inlineIndent", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setItemIconReactElement(value: ReactElement): Self = this.set("itemIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemIconFunction1(value: /* props */ js.Any => ReactElement): Self = this.set("itemIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setItemIcon(value: RenderIconType): Self = this.set("itemIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemIcon: Self = this.set("itemIcon", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setManualRef(value: /* node */ ReactInstance => Unit): Self = this.set("manualRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteManualRef: Self = this.set("manualRef", js.undefined)
    @scala.inline
    def setMode(value: MenuMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnClick(value: /* info */ MenuInfo => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnDeselect(value: /* info */ SelectInfo => Unit): Self = this.set("onDeselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    @scala.inline
    def setOnDestroy(value: /* key */ Key => Unit): Self = this.set("onDestroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroy: Self = this.set("onDestroy", js.undefined)
    @scala.inline
    def setOnItemHover(value: /* info */ Hover => Unit): Self = this.set("onItemHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemHover: Self = this.set("onItemHover", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnSelect(value: /* info */ SelectInfo => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setParentMenuElement(value: Element): Self = this.set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentMenuComponent(value: ReactComponentClass[js.Any]): Self = this.set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentMenu(value: ReactInstance): Self = this.set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentMenu: Self = this.set("parentMenu", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRootPrefixCls(value: String): Self = this.set("rootPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPrefixCls: Self = this.set("rootPrefixCls", js.undefined)
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

