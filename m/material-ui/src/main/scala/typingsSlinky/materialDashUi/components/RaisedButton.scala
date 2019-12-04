package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.RaisedButtonProps
import typingsSlinky.materialDashUi.materialDashUiStrings.after
import typingsSlinky.materialDashUi.materialDashUiStrings.before
import typingsSlinky.materialDashUi.raisedButtonMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RaisedButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/RaisedButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, href, onBlur, onClick, onFocus, onKeyDown, onKeyUp, onMouseDown, onMouseEnter, onMouseLeave, onMouseUp, onTouchEnd, onTouchStart, tabIndex, target, type */
  def apply(
    backgroundColor: String = null,
    buttonStyle: CSSProperties = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    containerElement: TagMod[Any] | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabledBackgroundColor: String = null,
    disabledLabelColor: String = null,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null,
    labelColor: String = null,
    labelPosition: before | after = null,
    labelStyle: CSSProperties = null,
    linkButton: js.UndefOr[Boolean] = js.undefined,
    onKeyboardFocus: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    overlayStyle: CSSProperties = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    rippleStyle: CSSProperties = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple.asInstanceOf[js.Any])
    if (disabledBackgroundColor != null) __obj.updateDynamic("disabledBackgroundColor")(disabledBackgroundColor.asInstanceOf[js.Any])
    if (disabledLabelColor != null) __obj.updateDynamic("disabledLabelColor")(disabledLabelColor.asInstanceOf[js.Any])
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor.asInstanceOf[js.Any])
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton.asInstanceOf[js.Any])
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (rippleStyle != null) __obj.updateDynamic("rippleStyle")(rippleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor.asInstanceOf[js.Any])
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RaisedButtonProps
}

