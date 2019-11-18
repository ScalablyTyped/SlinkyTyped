package typingsSlinky.rcDashMenu.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashMenu.Anon_Item
import typingsSlinky.rcDashMenu.esInterfaceMod.BuiltinPlacements
import typingsSlinky.rcDashMenu.esInterfaceMod.MenuMode
import typingsSlinky.rcDashMenu.esInterfaceMod.MiniStore
import typingsSlinky.rcDashMenu.esInterfaceMod.MotionType
import typingsSlinky.rcDashMenu.esInterfaceMod.RenderIconType
import typingsSlinky.rcDashMenu.esInterfaceMod.SelectInfo
import typingsSlinky.rcDashMenu.esInterfaceMod.TriggerSubMenuAction
import typingsSlinky.rcDashMenu.esSubPopupMenuMod.SubPopupMenuProps
import typingsSlinky.rcDashMenu.esSubPopupMenuMod.default
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, id, multiple, onClick, onSelect */
object SubPopupMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.rcDashMenu.esSubPopupMenuMod.default].asInstanceOf[String | js.Object]
  def apply(
    activeKey: String = null,
    builtinPlacements: BuiltinPlacements = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    eventKey: Key = null,
    expandIcon: RenderIconType = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: Int | Double = null,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Unit = null,
    mode: MenuMode = null,
    motion: MotionType = null,
    onDeselect: /* info */ SelectInfo => Unit = null,
    onDestroy: /* key */ Key => Unit = null,
    onOpenChange: /* keys */ js.Array[Key] | Anon_Item => Unit = null,
    openKeys: js.Array[String] = null,
    overflowedIndicator: TagMod[Any] = null,
    parentMenu: ReactInstance = null,
    prefixCls: String = null,
    role: String = null,
    selectedKeys: js.Array[String] = null,
    store: MiniStore = null,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    theme: String = null,
    triggerSubMenuAction: TriggerSubMenuAction = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1(manualRef))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SubPopupMenuProps
}

