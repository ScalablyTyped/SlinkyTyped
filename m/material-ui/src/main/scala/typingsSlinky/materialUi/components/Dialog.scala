package typingsSlinky.materialUi.components

import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
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
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.DialogAction
import typingsSlinky.materialUi.MaterialUI.DialogProps
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog {
  @JSImport("material-ui", "Dialog")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Dialog] {
    @scala.inline
    def actionFocus(value: String): this.type = set("actionFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def actionsVarargs(value: (DialogAction | ReactElement)*): this.type = set("actions", js.Array(value :_*))
    @scala.inline
    def actions(value: js.Array[DialogAction | ReactElement]): this.type = set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def actionsContainerClassName(value: String): this.type = set("actionsContainerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def actionsContainerStyle(value: CSSProperties): this.type = set("actionsContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def autoDetectWindowHeight(value: Boolean): this.type = set("autoDetectWindowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def autoScrollBodyContent(value: Boolean): this.type = set("autoScrollBodyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyClassName(value: String): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def modal(value: Boolean): this.type = set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def onAbort(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[js.Object] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlay(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[js.Object] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDrag(value: DragEvent[js.Object] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnd(value: DragEvent[js.Object] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: DragEvent[js.Object] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragExit(value: DragEvent[js.Object] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: DragEvent[js.Object] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: DragEvent[js.Object] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: DragEvent[js.Object] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(value: DragEvent[js.Object] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onDurationChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onEmptied(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def onEncrypted(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def onEnded(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def onError(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadStart(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedData(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[js.Object] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onPause(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def onPlay(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onPlaying(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[js.Object] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def onProgress(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def onRateChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRequestClose(value: /* buttonClicked */ Boolean => Unit): this.type = set("onRequestClose", js.Any.fromFunction1(value))
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: SyntheticUIEvent[js.Object] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeked(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeking(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onStalled(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def onSuspend(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[js.Object] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[js.Object] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onWaiting(value: SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[js.Object] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def paperClassName(value: String): this.type = set("paperClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def paperProps(value: js.Any): this.type = set("paperProps", value.asInstanceOf[js.Any])
    @scala.inline
    def repositionOnUpdate(value: Boolean): this.type = set("repositionOnUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleClassName(value: String): this.type = set("titleClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
}

