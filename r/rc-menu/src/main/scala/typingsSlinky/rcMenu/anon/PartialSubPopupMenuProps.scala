package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcMenu.interfaceMod.BuiltinPlacements
import typingsSlinky.rcMenu.interfaceMod.DestroyEventHandler
import typingsSlinky.rcMenu.interfaceMod.LegacyFunctionRef
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
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
import typingsSlinky.rcMotion.cssmotionMod.CSSMotionProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-menu.rc-menu/es/SubPopupMenu.SubPopupMenuProps> */
@js.native
trait PartialSubPopupMenuProps extends StObject {
  
  var activeKey: js.UndefOr[String] = js.native
  
  var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var defaultActiveFirst: js.UndefOr[Boolean] = js.native
  
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.native
  
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var eventKey: js.UndefOr[typingsSlinky.react.mod.Key] = js.native
  
  var expandIcon: js.UndefOr[RenderIconType] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var forceSubMenuRender: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inlineIndent: js.UndefOr[Double] = js.native
  
  var itemIcon: js.UndefOr[RenderIconType] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var manualRef: js.UndefOr[LegacyFunctionRef] = js.native
  
  var mode: js.UndefOr[MenuMode] = js.native
  
  var motion: js.UndefOr[CSSMotionProps] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[MenuClickEventHandler] = js.native
  
  var onDeselect: js.UndefOr[SelectEventHandler] = js.native
  
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.native
  
  var onOpenChange: js.UndefOr[OpenEventHandler] = js.native
  
  var onSelect: js.UndefOr[SelectEventHandler] = js.native
  
  var openKeys: js.UndefOr[js.Array[String]] = js.native
  
  var overflowedIndicator: js.UndefOr[ReactElement] = js.native
  
  var parentMenu: js.UndefOr[ReactInstance] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var selectedKeys: js.UndefOr[js.Array[String]] = js.native
  
  var store: js.UndefOr[MiniStore] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subMenuCloseDelay: js.UndefOr[Double] = js.native
  
  var subMenuOpenDelay: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object PartialSubPopupMenuProps {
  
  @scala.inline
  def apply(): PartialSubPopupMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSubPopupMenuProps]
  }
  
  @scala.inline
  implicit class PartialSubPopupMenuPropsMutableBuilder[Self <: PartialSubPopupMenuProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    @scala.inline
    def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDefaultActiveFirst(value: Boolean): Self = StObject.set(x, "defaultActiveFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActiveFirstUndefined: Self = StObject.set(x, "defaultActiveFirst", js.undefined)
    
    @scala.inline
    def setDefaultOpenKeys(value: js.Array[String]): Self = StObject.set(x, "defaultOpenKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenKeysUndefined: Self = StObject.set(x, "defaultOpenKeys", js.undefined)
    
    @scala.inline
    def setDefaultOpenKeysVarargs(value: String*): Self = StObject.set(x, "defaultOpenKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
    
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: String*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEventKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconFunction1(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandIconReactElement(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
    
    @scala.inline
    def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIconFunction1(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemIconReactElement(value: ReactElement): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setManualRef(value: /* node */ ReactInstance => Unit): Self = StObject.set(x, "manualRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setManualRefUndefined: Self = StObject.set(x, "manualRef", js.undefined)
    
    @scala.inline
    def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnDeselect(value: /* info */ SelectInfo => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
    
    @scala.inline
    def setOnDestroy(value: /* key */ typingsSlinky.react.mod.Key => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
    
    @scala.inline
    def setOnOpenChange(value: /* keys */ js.Array[typingsSlinky.react.mod.Key] | Open => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* info */ SelectInfo => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
    
    @scala.inline
    def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value :_*))
    
    @scala.inline
    def setOverflowedIndicator(value: ReactElement): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowedIndicatorReactElement(value: ReactElement): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowedIndicatorUndefined: Self = StObject.set(x, "overflowedIndicator", js.undefined)
    
    @scala.inline
    def setParentMenu(value: ReactInstance): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMenuComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMenuElement(value: Element): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    @scala.inline
    def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setStore(value: MiniStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
    
    @scala.inline
    def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
