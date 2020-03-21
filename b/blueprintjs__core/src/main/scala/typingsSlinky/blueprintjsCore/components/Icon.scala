package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
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
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsSlinky.blueprintjsCore.iconMod.IIconProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.Icon] {
  @JSImport("@blueprintjs/core", "Icon")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    color: String = null,
    htmlTitle: String = null,
    icon: IconName | MaybeElement = null,
    iconSize: Int | Double = null,
    intent: Intent = null,
    onAbort: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLElement, Event_] => Unit = null,
    onBlur: SyntheticFocusEvent[HTMLElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with HTMLElement, Event_] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onDrag: DragEvent[HTMLElement] => Unit = null,
    onDragEnd: DragEvent[HTMLElement] => Unit = null,
    onDragEnter: DragEvent[HTMLElement] => Unit = null,
    onDragExit: DragEvent[HTMLElement] => Unit = null,
    onDragLeave: DragEvent[HTMLElement] => Unit = null,
    onDragOver: DragEvent[HTMLElement] => Unit = null,
    onDragStart: DragEvent[HTMLElement] => Unit = null,
    onDrop: DragEvent[HTMLElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onEmptied: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onEnded: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onError: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLElement, Event_] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with HTMLElement, Event_] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onLoad: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLElement] => Unit = null,
    onPause: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onPlay: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onPlaying: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLElement] => Unit = null,
    onProgress: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onRateChange: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLElement, Event_] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLElement] => Unit = null,
    onSeeked: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onSeeking: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onSelect: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onStalled: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with HTMLElement, Event_] => Unit = null,
    onSuspend: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onWaiting: SyntheticEvent[Event_, HTMLElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLElement] => Unit = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    title: String | `false` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Icon] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
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
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Icon] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsCore.mod.Icon](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IIconProps with DOMAttributes[HTMLElement]
}

