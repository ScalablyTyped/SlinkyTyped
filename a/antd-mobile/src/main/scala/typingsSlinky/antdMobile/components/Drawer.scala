package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobile.antdMobileStrings.bottom
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.antdMobileStrings.top
import typingsSlinky.antdMobile.drawerMod.default
import typingsSlinky.antdMobile.drawerPropsTypeMod.DrawerWebProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/drawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, open, style */
  def apply(
    contentStyle: CSSProperties = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragHandleStyle: CSSProperties = null,
    dragToggleDistance: Int | Double = null,
    onOpenChange: /* isOpen */ Boolean => Unit = null,
    overlayStyle: CSSProperties = null,
    position: left | right | top | bottom = null,
    prefixCls: String = null,
    sidebar: TagMod[Any] = null,
    sidebarStyle: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    transitions: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (dragHandleStyle != null) __obj.updateDynamic("dragHandleStyle")(dragHandleStyle.asInstanceOf[js.Any])
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    if (sidebarStyle != null) __obj.updateDynamic("sidebarStyle")(sidebarStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdMobile.drawerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DrawerWebProps
}

