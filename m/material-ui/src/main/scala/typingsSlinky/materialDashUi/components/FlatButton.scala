package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.FlatButtonProps
import typingsSlinky.materialDashUi.flatButtonMod.default
import typingsSlinky.materialDashUi.materialDashUiStrings.after
import typingsSlinky.materialDashUi.materialDashUiStrings.before
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlatButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/FlatButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, dangerouslySetInnerHTML, disabled, href, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, tabIndex, target, type */
  def apply(
    backgroundColor: String = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    containerElement: TagMod[Any] | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hoverColor: String = null,
    icon: TagMod[Any] = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null,
    labelPosition: before | after = null,
    labelStyle: CSSProperties = null,
    linkButton: js.UndefOr[Boolean] = js.undefined,
    onAuxClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit = null,
    onKeyboardFocus: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onReset: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    rippleColor: String = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple.asInstanceOf[js.Any])
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor.asInstanceOf[js.Any])
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor.asInstanceOf[js.Any])
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FlatButtonProps
}

