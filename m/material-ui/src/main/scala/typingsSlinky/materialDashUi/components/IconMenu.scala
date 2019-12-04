package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Menus.IconMenuProps
import typingsSlinky.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.origin
import typingsSlinky.materialDashUi.iconMenuMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/IconMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, multiple, onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseUp, open, value */
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
    onChange: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit = null,
    onItemClick: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* item */ typingsSlinky.materialDashUi.__MaterialUI.Menus.MenuItem) => Unit = null,
    onKeyboardFocus: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onRequestChange: (/* opening */ Boolean, /* reason */ String) => Unit = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
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
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2(onRequestChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IconMenuProps
}

