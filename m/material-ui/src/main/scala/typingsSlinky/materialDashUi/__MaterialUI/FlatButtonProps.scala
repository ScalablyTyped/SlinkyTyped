package typingsSlinky.materialDashUi.__MaterialUI

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.materialDashUi.materialDashUiStrings.after
import typingsSlinky.materialDashUi.materialDashUiStrings.before
import typingsSlinky.react.Anon_Html
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.materialDashUi.__MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, style, tabIndex, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ trait FlatButtonProps
  extends DOMAttributes[js.Object] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.undefined
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var containerElement: js.UndefOr[TagMod[Any] | String] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var focusRippleColor: js.UndefOr[String] = js.undefined
  var focusRippleOpacity: js.UndefOr[Double] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var keyboardFocused: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[TagMod[Any]] = js.undefined
  var labelPosition: js.UndefOr[before | after] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var linkButton: js.UndefOr[Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var touchRippleColor: js.UndefOr[String] = js.undefined
  var touchRippleOpacity: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object FlatButtonProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    containerElement: TagMod[Any] | String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hoverColor: String = null,
    href: String = null,
    icon: TagMod[Any] = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null,
    labelPosition: before | after = null,
    labelStyle: CSSProperties = null,
    linkButton: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[Event, js.Object] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[js.Object] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[js.Object] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[js.Object] => Unit = null,
    onAuxClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[js.Object] => Unit = null,
    onCanPlay: SyntheticEvent[Event, js.Object] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, js.Object] => Unit = null,
    onChange: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[js.Object] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[js.Object] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[js.Object] => Unit = null,
    onContextMenu: SyntheticMouseEvent[js.Object] => Unit = null,
    onCopy: SyntheticClipboardEvent[js.Object] => Unit = null,
    onCut: SyntheticClipboardEvent[js.Object] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onDrag: DragEvent[js.Object] => Unit = null,
    onDragEnd: DragEvent[js.Object] => Unit = null,
    onDragEnter: DragEvent[js.Object] => Unit = null,
    onDragExit: DragEvent[js.Object] => Unit = null,
    onDragLeave: DragEvent[js.Object] => Unit = null,
    onDragOver: DragEvent[js.Object] => Unit = null,
    onDragStart: DragEvent[js.Object] => Unit = null,
    onDrop: DragEvent[js.Object] => Unit = null,
    onDurationChange: SyntheticEvent[Event, js.Object] => Unit = null,
    onEmptied: SyntheticEvent[Event, js.Object] => Unit = null,
    onEncrypted: SyntheticEvent[Event, js.Object] => Unit = null,
    onEnded: SyntheticEvent[Event, js.Object] => Unit = null,
    onError: SyntheticEvent[Event, js.Object] => Unit = null,
    onFocus: SyntheticFocusEvent[js.Object] => Unit = null,
    onInput: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[js.Object] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[js.Object] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[js.Object] => Unit = null,
    onKeyboardFocus: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onLoad: SyntheticEvent[Event, js.Object] => Unit = null,
    onLoadStart: SyntheticEvent[Event, js.Object] => Unit = null,
    onLoadedData: SyntheticEvent[Event, js.Object] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, js.Object] => Unit = null,
    onMouseDown: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseMove: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseOut: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseOver: SyntheticMouseEvent[js.Object] => Unit = null,
    onMouseUp: SyntheticMouseEvent[js.Object] => Unit = null,
    onPaste: SyntheticClipboardEvent[js.Object] => Unit = null,
    onPause: SyntheticEvent[Event, js.Object] => Unit = null,
    onPlay: SyntheticEvent[Event, js.Object] => Unit = null,
    onPlaying: SyntheticEvent[Event, js.Object] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[js.Object] => Unit = null,
    onPointerDown: SyntheticPointerEvent[js.Object] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[js.Object] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[js.Object] => Unit = null,
    onPointerMove: SyntheticPointerEvent[js.Object] => Unit = null,
    onPointerOut: SyntheticPointerEvent[js.Object] => Unit = null,
    onPointerOver: SyntheticPointerEvent[js.Object] => Unit = null,
    onPointerUp: SyntheticPointerEvent[js.Object] => Unit = null,
    onProgress: SyntheticEvent[Event, js.Object] => Unit = null,
    onRateChange: SyntheticEvent[Event, js.Object] => Unit = null,
    onReset: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onScroll: SyntheticUIEvent[js.Object] => Unit = null,
    onSeeked: SyntheticEvent[Event, js.Object] => Unit = null,
    onSeeking: SyntheticEvent[Event, js.Object] => Unit = null,
    onSelect: SyntheticEvent[Event, js.Object] => Unit = null,
    onStalled: SyntheticEvent[Event, js.Object] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with js.Object, Event] => Unit = null,
    onSuspend: SyntheticEvent[Event, js.Object] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, js.Object] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[js.Object] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[js.Object] => Unit = null,
    onTouchMove: SyntheticTouchEvent[js.Object] => Unit = null,
    onTouchStart: SyntheticTouchEvent[js.Object] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[js.Object] => Unit = null,
    onVolumeChange: SyntheticEvent[Event, js.Object] => Unit = null,
    onWaiting: SyntheticEvent[Event, js.Object] => Unit = null,
    onWheel: SyntheticWheelEvent[js.Object] => Unit = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    rippleColor: String = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    target: String = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null,
    `type`: String = null
  ): FlatButtonProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor.asInstanceOf[js.Any])
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor.asInstanceOf[js.Any])
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatButtonProps]
  }
}

