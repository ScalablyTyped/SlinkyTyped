package typingsSlinky.rcDashMenu.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashMenu.Anon_DomEvent
import typingsSlinky.rcDashMenu.Anon_DomEventKey
import typingsSlinky.rcDashMenu.Anon_Hover
import typingsSlinky.rcDashMenu.Anon_IsRootMenu
import typingsSlinky.rcDashMenu.Anon_Item
import typingsSlinky.rcDashMenu.libInterfaceMod.BuiltinPlacements
import typingsSlinky.rcDashMenu.libInterfaceMod.MenuMode
import typingsSlinky.rcDashMenu.libInterfaceMod.MiniStore
import typingsSlinky.rcDashMenu.libInterfaceMod.MotionType
import typingsSlinky.rcDashMenu.libInterfaceMod.RenderIconType
import typingsSlinky.rcDashMenu.libInterfaceMod.SelectInfo
import typingsSlinky.rcDashMenu.libInterfaceMod.TriggerSubMenuAction
import typingsSlinky.rcDashMenu.libSubMenuMod.SubMenuProps
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rcDashMenu.libSubMenuMod.SubMenu] {
  @JSImport("rc-menu/lib/SubMenu", "SubMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, multiple, onClick, onMouseEnter, onMouseLeave, onSelect */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    builtinPlacements: BuiltinPlacements = null,
    eventKey: String = null,
    expandIcon: RenderIconType = null,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: Int | Double = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Unit = null,
    mode: MenuMode = null,
    motion: MotionType = null,
    onDeselect: /* info */ SelectInfo => Unit = null,
    onDestroy: /* key */ Key => Unit = null,
    onItemHover: /* info */ Anon_Hover => Unit = null,
    onOpenChange: /* keys */ js.Array[Key] | Anon_Item => Unit = null,
    onTitleClick: /* info */ Anon_DomEvent => Unit = null,
    onTitleMouseEnter: /* info */ Anon_DomEventKey => Unit = null,
    onTitleMouseLeave: /* info */ Anon_DomEventKey => Unit = null,
    openKeys: js.Array[String] = null,
    parentMenu: ReactElement with Anon_IsRootMenu = null,
    popupClassName: String = null,
    popupOffset: js.Array[Double] = null,
    rootPrefixCls: String = null,
    selectedKeys: js.Array[String] = null,
    store: MiniStore = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    title: TagMod[Any] = null,
    triggerSubMenuAction: TriggerSubMenuAction = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rcDashMenu.libSubMenuMod.SubMenu] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1(manualRef))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onItemHover != null) __obj.updateDynamic("onItemHover")(js.Any.fromFunction1(onItemHover))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1(onTitleMouseEnter))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1(onTitleMouseLeave))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.rcDashMenu.libSubMenuMod.SubMenu] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcDashMenu.libSubMenuMod.SubMenu](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SubMenuProps
}

