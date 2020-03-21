package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Menus.IconMenuProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.materialUi.iconMenuMod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/IconMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, multiple, open, style */
  def apply(
    iconButtonElement: ReactElement,
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    clickCloseDelay: Int | Double = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuStyle: CSSProperties = null,
    onChange: (/* e */ SyntheticEvent[Event_, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit = null,
    onClick: /* e */ SyntheticEvent[Event_, js.Object] => Unit = null,
    onItemClick: (/* e */ SyntheticEvent[Event_, js.Object], /* item */ typingsSlinky.materialUi.MaterialUI.Menus.MenuItem) => Unit = null,
    onKeyboardFocus: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onMouseDown: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseUp: SyntheticMouseEvent[js.Object] => Unit = null,
    onRequestChange: (/* opening */ Boolean, /* reason */ String) => Unit = null,
    targetOrigin: origin = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
    value: js.Any | js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (clickCloseDelay != null) __obj.updateDynamic("clickCloseDelay")(clickCloseDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2(onRequestChange))
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IconMenuProps
}

