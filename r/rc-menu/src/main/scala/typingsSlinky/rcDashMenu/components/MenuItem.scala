package typingsSlinky.rcDashMenu.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashMenu.Anon_Hover
import typingsSlinky.rcDashMenu.esInterfaceMod.MenuMode
import typingsSlinky.rcDashMenu.esInterfaceMod.RenderIconType
import typingsSlinky.rcDashMenu.esInterfaceMod.SelectInfo
import typingsSlinky.rcDashMenu.esMenuItemMod.MenuItemProps
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.ReactInstance
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, disabled, multiple, onClick, onMouseEnter, onMouseLeave, onSelect */
object MenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rcDashMenu.esMenuItemMod.MenuItem] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.rcDashMenu.esMenuItemMod.MenuItem].asInstanceOf[String | js.Object]
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    attribute: Record[String, String] = null,
    eventKey: Key = null,
    inlineIndent: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Unit = null,
    mode: MenuMode = null,
    onDeselect: /* info */ SelectInfo => Unit = null,
    onDestroy: /* key */ Key => Unit = null,
    onItemHover: /* info */ Anon_Hover => Unit = null,
    parentMenu: ReactInstance = null,
    role: String = null,
    rootPrefixCls: String = null,
    selectedKeys: js.Array[String] = null,
    style: CSSProperties = null,
    title: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rcDashMenu.esMenuItemMod.MenuItem] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1(manualRef))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onItemHover != null) __obj.updateDynamic("onItemHover")(js.Any.fromFunction1(onItemHover))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuItemProps
}

