package typingsSlinky.reactDashToolbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashToolbox.libMenuIconMenuMod.IconMenuProps
import typingsSlinky.reactDashToolbox.libMenuIconMenuMod.IconMenuTheme
import typingsSlinky.reactDashToolbox.libMenuIconMenuMod.default
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.auto
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.bottomLeft
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.bottomRight
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.static
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.topLeft
import typingsSlinky.reactDashToolbox.reactDashToolboxStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-toolbox/lib/menu/IconMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] = null,
    iconRipple: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    menuRipple: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onHide: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onSelect: js.Function = null,
    onShow: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    position: auto | static | topLeft | topRight | bottomLeft | bottomRight = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.Any = null,
    style: CSSProperties = null,
    theme: IconMenuTheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRipple)) __obj.updateDynamic("iconRipple")(iconRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(menuRipple)) __obj.updateDynamic("menuRipple")(menuRipple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashToolbox.libMenuIconMenuMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IconMenuProps
}

