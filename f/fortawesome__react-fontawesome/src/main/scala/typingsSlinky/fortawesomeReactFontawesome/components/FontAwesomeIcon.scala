package typingsSlinky.fortawesomeReactFontawesome.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.svg.svg.tag
import typingsSlinky.fortawesomeFontawesomeSvgCore.mod.FaSymbol
import typingsSlinky.fortawesomeFontawesomeSvgCore.mod.FlipProp
import typingsSlinky.fortawesomeFontawesomeSvgCore.mod.IconProp
import typingsSlinky.fortawesomeFontawesomeSvgCore.mod.PullProp
import typingsSlinky.fortawesomeFontawesomeSvgCore.mod.RotateProp
import typingsSlinky.fortawesomeFontawesomeSvgCore.mod.SizeProp
import typingsSlinky.fortawesomeFontawesomeSvgCore.mod.Transform
import typingsSlinky.fortawesomeReactFontawesome.mod.FontAwesomeIconProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FontAwesomeIcon
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@fortawesome/react-fontawesome", "FontAwesomeIcon")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: dangerouslySetInnerHTML, onAbort, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onContextMenu, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPause, onPlay, onPlaying, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onVolumeChange, onWaiting, style */
  def apply(
    icon: IconProp,
    border: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: FlipProp = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    listItem: js.UndefOr[Boolean] = js.undefined,
    mask: IconProp = null,
    onAnimationEnd: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with SVGSVGElement, Event_] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onCut: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, SVGSVGElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[SVGSVGElement] => Unit = null,
    onWheel: SyntheticWheelEvent[SVGSVGElement] => Unit = null,
    pull: PullProp = null,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotation: RotateProp = null,
    size: SizeProp = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    swapOpacity: js.UndefOr[Boolean] = js.undefined,
    symbol: FaSymbol = null,
    tabIndex: Int | Double = null,
    title: String = null,
    transform: String | Transform = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (!js.isUndefined(swapOpacity)) __obj.updateDynamic("swapOpacity")(swapOpacity.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FontAwesomeIconProps
}

