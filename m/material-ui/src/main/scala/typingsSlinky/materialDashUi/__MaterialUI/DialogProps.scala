package typingsSlinky.materialDashUi.__MaterialUI

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
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
import typingsSlinky.react.Anon_Html
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait DialogProps
  extends DOMAttributes[js.Object] {
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[String] = js.undefined
  var actions: js.UndefOr[js.Array[DialogAction | ReactElement]] = js.undefined
  var actionsContainerClassName: js.UndefOr[String] = js.undefined
  var actionsContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined
  var autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined
  var bodyClassName: js.UndefOr[String] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ Boolean, Unit]] = js.undefined
  var open: Boolean
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var paperClassName: js.UndefOr[String] = js.undefined
  var paperProps: js.UndefOr[js.Any] = js.undefined
  var ref: js.UndefOr[LegacyRef[Dialog]] = js.undefined
  var repositionOnUpdate: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var titleClassName: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    open: Boolean,
    actionFocus: String = null,
    actions: js.Array[DialogAction | ReactElement] = null,
    actionsContainerClassName: String = null,
    actionsContainerStyle: CSSProperties = null,
    autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined,
    autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined,
    bodyClassName: String = null,
    bodyStyle: CSSProperties = null,
    children: TagMod[Any] = null,
    className: String = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    key: Key = null,
    modal: js.UndefOr[Boolean] = js.undefined,
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
    onRequestClose: /* buttonClicked */ Boolean => Unit = null,
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
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    paperClassName: String = null,
    paperProps: js.Any = null,
    ref: LegacyRef[Dialog] = null,
    repositionOnUpdate: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: TagMod[Any] = null,
    titleClassName: String = null,
    titleStyle: CSSProperties = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (actionFocus != null) __obj.updateDynamic("actionFocus")(actionFocus.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (actionsContainerClassName != null) __obj.updateDynamic("actionsContainerClassName")(actionsContainerClassName.asInstanceOf[js.Any])
    if (actionsContainerStyle != null) __obj.updateDynamic("actionsContainerStyle")(actionsContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDetectWindowHeight)) __obj.updateDynamic("autoDetectWindowHeight")(autoDetectWindowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScrollBodyContent)) __obj.updateDynamic("autoScrollBodyContent")(autoScrollBodyContent.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
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
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
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
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (paperClassName != null) __obj.updateDynamic("paperClassName")(paperClassName.asInstanceOf[js.Any])
    if (paperProps != null) __obj.updateDynamic("paperProps")(paperProps.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(repositionOnUpdate)) __obj.updateDynamic("repositionOnUpdate")(repositionOnUpdate.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

