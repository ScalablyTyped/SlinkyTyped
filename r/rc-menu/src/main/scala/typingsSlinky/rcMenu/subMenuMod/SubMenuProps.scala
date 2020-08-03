package typingsSlinky.rcMenu.subMenuMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcMenu.anon.DomEvent
import typingsSlinky.rcMenu.anon.Hover
import typingsSlinky.rcMenu.anon.Open
import typingsSlinky.rcMenu.anon.ReactElementisRootMenuboo
import typingsSlinky.rcMenu.interfaceMod.BuiltinPlacements
import typingsSlinky.rcMenu.interfaceMod.DestroyEventHandler
import typingsSlinky.rcMenu.interfaceMod.HoverEventHandler
import typingsSlinky.rcMenu.interfaceMod.LegacyFunctionRef
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuHoverEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.MiniStore
import typingsSlinky.rcMenu.interfaceMod.OpenEventHandler
import typingsSlinky.rcMenu.interfaceMod.RenderIconType
import typingsSlinky.rcMenu.interfaceMod.SelectEventHandler
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.rcMenu.interfaceMod.TriggerSubMenuAction
import typingsSlinky.rcMenu.rcMenuStrings.ltr
import typingsSlinky.rcMenu.rcMenuStrings.rtl
import typingsSlinky.rcTrigger.interfaceMod.MotionType
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMenuProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[String] = js.undefined
  var expandIcon: js.UndefOr[RenderIconType] = js.undefined
  var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemIcon: js.UndefOr[RenderIconType] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var manualRef: js.UndefOr[LegacyFunctionRef] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var motion: js.UndefOr[MotionType] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.undefined
  var onItemHover: js.UndefOr[HoverEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onOpenChange: js.UndefOr[OpenEventHandler] = js.undefined
  var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
  var onTitleClick: js.UndefOr[js.Function1[/* info */ DomEvent, Unit]] = js.undefined
  var onTitleMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onTitleMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  var parentMenu: js.UndefOr[ReactElementisRootMenuboo] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var popupOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var store: js.UndefOr[MiniStore] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[ReactElement] = js.undefined
  var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.undefined
}

object SubMenuProps {
  @scala.inline
  def apply(): SubMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubMenuProps]
  }
  @scala.inline
  implicit class SubMenuPropsOps[Self <: SubMenuProps] (val x: Self) extends AnyVal {
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
    def setBuiltinPlacements(value: BuiltinPlacements): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
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
    def setEventKey(value: String): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    @scala.inline
    def setExpandIconReactElement(value: ReactElement): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandIconFunction1(value: /* props */ js.Any => ReactElement): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setExpandIcon(value: RenderIconType): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setForceSubMenuRender(value: Boolean): Self = this.set("forceSubMenuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSubMenuRender: Self = this.set("forceSubMenuRender", js.undefined)
    @scala.inline
    def setInlineIndent(value: Double): Self = this.set("inlineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineIndent: Self = this.set("inlineIndent", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
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
    def setMotion(value: MotionType): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
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
    def setOnOpenChange(value: /* keys */ js.Array[Key] | Open => Unit): Self = this.set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    @scala.inline
    def setOnSelect(value: /* info */ SelectInfo => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnTitleClick(value: /* info */ DomEvent => Unit): Self = this.set("onTitleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTitleClick: Self = this.set("onTitleClick", js.undefined)
    @scala.inline
    def setOnTitleMouseEnter(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): Self = this.set("onTitleMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTitleMouseEnter: Self = this.set("onTitleMouseEnter", js.undefined)
    @scala.inline
    def setOnTitleMouseLeave(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): Self = this.set("onTitleMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTitleMouseLeave: Self = this.set("onTitleMouseLeave", js.undefined)
    @scala.inline
    def setOpenKeysVarargs(value: String*): Self = this.set("openKeys", js.Array(value :_*))
    @scala.inline
    def setOpenKeys(value: js.Array[String]): Self = this.set("openKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenKeys: Self = this.set("openKeys", js.undefined)
    @scala.inline
    def setParentMenu(value: ReactElementisRootMenuboo): Self = this.set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentMenu: Self = this.set("parentMenu", js.undefined)
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    @scala.inline
    def setPopupOffsetVarargs(value: Double*): Self = this.set("popupOffset", js.Array(value :_*))
    @scala.inline
    def setPopupOffset(value: js.Array[Double]): Self = this.set("popupOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupOffset: Self = this.set("popupOffset", js.undefined)
    @scala.inline
    def setRootPrefixCls(value: String): Self = this.set("rootPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPrefixCls: Self = this.set("rootPrefixCls", js.undefined)
    @scala.inline
    def setSelectedKeysVarargs(value: String*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    @scala.inline
    def setStore(value: MiniStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setSubMenuCloseDelay(value: Double): Self = this.set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuCloseDelay: Self = this.set("subMenuCloseDelay", js.undefined)
    @scala.inline
    def setSubMenuOpenDelay(value: Double): Self = this.set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuOpenDelay: Self = this.set("subMenuOpenDelay", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = this.set("triggerSubMenuAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerSubMenuAction: Self = this.set("triggerSubMenuAction", js.undefined)
  }
  
}

