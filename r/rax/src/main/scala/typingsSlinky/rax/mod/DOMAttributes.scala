package typingsSlinky.rax.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import typingsSlinky.rax.anon.Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T]
  extends // weex
/* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[RaxNode] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  // Media Events
  var onAbort: js.UndefOr[RaxEventHandler[T]] = js.native
  var onAbortCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAppear: js.UndefOr[AppearEventHandler[T]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.native
  var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.native
  var onCanPlay: js.UndefOr[RaxEventHandler[T]] = js.native
  var onCanPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onCanPlayThrough: js.UndefOr[RaxEventHandler[T]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.native
  var onChangeCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onClickCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.native
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onDisappear: js.UndefOr[AppearEventHandler[T]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.native
  var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDurationChange: js.UndefOr[RaxEventHandler[T]] = js.native
  var onDurationChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onEmptied: js.UndefOr[RaxEventHandler[T]] = js.native
  var onEmptiedCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onEncrypted: js.UndefOr[RaxEventHandler[T]] = js.native
  var onEncryptedCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onEnded: js.UndefOr[RaxEventHandler[T]] = js.native
  var onEndedCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onError: js.UndefOr[RaxEventHandler[T]] = js.native
   // also a Media Event
  var onErrorCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.native
  var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.native
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onInputCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.native
  var onInvalidCapture: js.UndefOr[FormEventHandler[T]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.native
  // Image Events
  var onLoad: js.UndefOr[RaxEventHandler[T]] = js.native
  var onLoadCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onLoadStart: js.UndefOr[RaxEventHandler[T]] = js.native
  var onLoadStartCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onLoadedData: js.UndefOr[RaxEventHandler[T]] = js.native
  var onLoadedDataCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onLoadedMetadata: js.UndefOr[RaxEventHandler[T]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  // Weex Common Events
  var onLongpress: js.UndefOr[MouseEventHandler[T]] = js.native
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onPause: js.UndefOr[RaxEventHandler[T]] = js.native
  var onPauseCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onPlay: js.UndefOr[RaxEventHandler[T]] = js.native
  var onPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onPlaying: js.UndefOr[RaxEventHandler[T]] = js.native
  var onPlayingCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onProgress: js.UndefOr[RaxEventHandler[T]] = js.native
  var onProgressCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onRateChange: js.UndefOr[RaxEventHandler[T]] = js.native
  var onRateChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onReset: js.UndefOr[FormEventHandler[T]] = js.native
  var onResetCapture: js.UndefOr[FormEventHandler[T]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.native
  var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.native
  var onSeeked: js.UndefOr[RaxEventHandler[T]] = js.native
  var onSeekedCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onSeeking: js.UndefOr[RaxEventHandler[T]] = js.native
  var onSeekingCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[RaxEventHandler[T]] = js.native
  var onSelectCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onStalled: js.UndefOr[RaxEventHandler[T]] = js.native
  var onStalledCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.native
  var onSubmitCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onSuspend: js.UndefOr[RaxEventHandler[T]] = js.native
  var onSuspendCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onTimeUpdate: js.UndefOr[RaxEventHandler[T]] = js.native
  var onTimeUpdateCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.native
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.native
  var onVolumeChange: js.UndefOr[RaxEventHandler[T]] = js.native
  var onVolumeChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  var onWaiting: js.UndefOr[RaxEventHandler[T]] = js.native
  var onWaitingCapture: js.UndefOr[RaxEventHandler[T]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.native
  var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.native
}

object DOMAttributes {
  @scala.inline
  def apply[T](): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  @scala.inline
  implicit class DOMAttributesOps[Self[t] <: DOMAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildren(value: RaxNode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withDangerouslySetInnerHTML(value: Html): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslySetInnerHTML: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbortCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbortCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: AnimationEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEndCapture(value: AnimationEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEndCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIteration(value: AnimationEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationIteration: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIterationCapture(value: AnimationEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationIterationCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIterationCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: AnimationEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStartCapture(value: AnimationEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStartCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppear(value: AppearEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppear: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClick(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAuxClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClickCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAuxClickCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInput(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeInput: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInputCapture(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeInputCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: FocusEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlurCapture(value: FocusEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlurCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThroughCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThroughCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeCapture(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEnd(value: CompositionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEndCapture(value: CompositionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionEndCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStart(value: CompositionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStartCapture(value: CompositionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionStartCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdate(value: CompositionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdateCapture(value: CompositionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdateCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: ClipboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopyCapture(value: ClipboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopyCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: ClipboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCut: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCutCapture(value: ClipboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCutCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisappear(value: AppearEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisappear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisappear: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisappear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClickCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClickCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEndCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEndCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnterCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnterCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExit(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragExit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExitCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExitCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragExitCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExitCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeaveCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeaveCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOverCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOverCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStartCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStartCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropCapture(value: DragEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChangeCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptiedCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptiedCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncrypted(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEncrypted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncryptedCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEncryptedCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndedCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEndedCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnErrorCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: FocusEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusCapture(value: FocusEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGotPointerCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGotPointerCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGotPointerCaptureCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGotPointerCaptureCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCaptureCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputCapture(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInputCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalidCapture(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalidCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: KeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDownCapture(value: KeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDownCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: KeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPressCapture(value: KeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPressCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: KeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUpCapture(value: KeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUpCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStartCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStartCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedDataCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedDataCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadataCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadataCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongpress(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongpress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLongpress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongpress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLostPointerCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLostPointerCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLostPointerCaptureCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLostPointerCaptureCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCaptureCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDownCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDownCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMoveCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMoveCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOutCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOutCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOverCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOverCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUpCapture(value: MouseEvent[T, org.scalajs.dom.raw.MouseEvent] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUpCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: ClipboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPasteCapture(value: ClipboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPasteCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPauseCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPauseCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayingCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayingCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancelCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancelCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDown(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDownCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDownCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnter(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnterCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnterCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeave(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeaveCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeaveCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMove(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMoveCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMoveCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOut(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOut: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOutCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOutCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOver(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOverCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOverCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUp(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerUp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUpCapture(value: PointerEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerUpCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgressCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgressCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChange(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChangeCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResetCapture(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResetCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: UIEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollCapture(value: UIEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeked(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeked: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekedCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeekedCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeking(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeking: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekingCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeekingCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalled(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalledCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalledCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitCapture(value: FormEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspend(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspendCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspendCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdateCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdateCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancelCapture(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancelCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMoveCapture(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMoveCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStartCapture(value: TouchEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStartCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: TransitionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEndCapture(value: TransitionEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEndCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChange(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChangeCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaiting(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaiting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaitingCapture(value: SyntheticEvent[T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaitingCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: WheelEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheelCapture(value: WheelEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheelCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(js.undefined)
        ret
    }
  }
  
}

