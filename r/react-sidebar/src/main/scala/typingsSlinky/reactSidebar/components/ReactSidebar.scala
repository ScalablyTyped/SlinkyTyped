package typingsSlinky.reactSidebar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSidebar.mod.SidebarProps
import typingsSlinky.reactSidebar.mod.SidebarStyles
import typingsSlinky.reactSidebar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSidebar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-sidebar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: open */
  def apply(
    contentClassName: String = null,
    contentId: String = null,
    defaultSidebarWidth: Int | Double = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragToggleDistance: Int | Double = null,
    onSetOpen: /* open */ Boolean => Unit = null,
    overlayClassName: String = null,
    overlayId: String = null,
    pullRight: js.UndefOr[Boolean] = js.undefined,
    rootClassName: String = null,
    rootId: String = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    sidebar: TagMod[Any] = null,
    sidebarClassName: String = null,
    sidebarId: String = null,
    styles: SidebarStyles = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    touchHandleWidth: Int | Double = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (defaultSidebarWidth != null) __obj.updateDynamic("defaultSidebarWidth")(defaultSidebarWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (onSetOpen != null) __obj.updateDynamic("onSetOpen")(js.Any.fromFunction1(onSetOpen))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayId != null) __obj.updateDynamic("overlayId")(overlayId.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.asInstanceOf[js.Any])
    if (rootClassName != null) __obj.updateDynamic("rootClassName")(rootClassName.asInstanceOf[js.Any])
    if (rootId != null) __obj.updateDynamic("rootId")(rootId.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    if (sidebarClassName != null) __obj.updateDynamic("sidebarClassName")(sidebarClassName.asInstanceOf[js.Any])
    if (sidebarId != null) __obj.updateDynamic("sidebarId")(sidebarId.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (touchHandleWidth != null) __obj.updateDynamic("touchHandleWidth")(touchHandleWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSidebar.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SidebarProps
}

