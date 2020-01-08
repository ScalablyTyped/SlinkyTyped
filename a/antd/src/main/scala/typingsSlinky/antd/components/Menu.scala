package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libMenuMenuContextMod.MenuTheme
import typingsSlinky.antd.libMenuMod.MenuMode
import typingsSlinky.antd.libMenuMod.MenuProps
import typingsSlinky.antd.libMenuMod.SelectParam
import typingsSlinky.antd.libMenuMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/menu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, multiple, onClick, onMouseEnter, onSelect */
  def apply(
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    inlineCollapsed: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: Int | Double = null,
    mode: MenuMode = null,
    motion: js.Object = null,
    onDeselect: /* param */ SelectParam => Unit = null,
    onOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    openAnimation: String = null,
    openKeys: js.Array[String] = null,
    openTransitionName: String = null,
    overflowedIndicator: TagMod[Any] = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    theme: MenuTheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(inlineCollapsed)) __obj.updateDynamic("inlineCollapsed")(inlineCollapsed.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.libMenuMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MenuProps
}

