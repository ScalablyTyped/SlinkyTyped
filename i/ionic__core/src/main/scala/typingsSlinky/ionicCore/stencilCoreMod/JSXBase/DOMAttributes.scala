package typingsSlinky.ionicCore.stencilCoreMod.JSXBase

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CompositionEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T] extends js.Object {
  var onAnimationEnd: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationEndCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationIteration: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationIterationCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationStartCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  var onBlurCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  // Form Events
  var onChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onChangeCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionEndCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionStart: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionStartCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionUpdate: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onContextMenuCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onCopyCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onCut: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onCutCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onDblClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEndCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEnterCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragExit: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragExitCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragOverCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragStartCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDropCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
   // also a Media Event
  var onErrorCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  var onFocusCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  var onGotPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onInput: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInputCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInvalid: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInvalidCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyDownCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyPressCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyUpCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  // Image Events
  var onLoad: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLostPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseDownCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOut: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOutCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOver: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOverCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseUpCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onPaste: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onPasteCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOutCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOver: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOverCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onReset: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onResetCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  // UI Events
  var onScroll: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.native
  var onScrollCapture: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSubmitCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchCancelCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchMoveCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchStartCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.native
  var onTransitionEndCapture: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.native
  var onWheelCapture: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.native
  var ref: js.UndefOr[js.Function1[/* elm */ js.UndefOr[T], Unit]] = js.native
  var slot: js.UndefOr[String] = js.native
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
    def withOnAnimationEnd(value: /* event */ AnimationEvent => Unit): Self[T] = {
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
    def withOnAnimationEndCapture(value: /* event */ AnimationEvent => Unit): Self[T] = {
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
    def withOnAnimationIteration(value: /* event */ AnimationEvent => Unit): Self[T] = {
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
    def withOnAnimationIterationCapture(value: /* event */ AnimationEvent => Unit): Self[T] = {
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
    def withOnAnimationStart(value: /* event */ AnimationEvent => Unit): Self[T] = {
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
    def withOnAnimationStartCapture(value: /* event */ AnimationEvent => Unit): Self[T] = {
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
    def withOnAuxClick(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnBlur(value: /* event */ FocusEvent => Unit): Self[T] = {
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
    def withOnBlurCapture(value: /* event */ FocusEvent => Unit): Self[T] = {
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
    def withOnChange(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnChangeCapture(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnClick(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnClickCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnCompositionEnd(value: /* event */ CompositionEvent => Unit): Self[T] = {
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
    def withOnCompositionEndCapture(value: /* event */ CompositionEvent => Unit): Self[T] = {
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
    def withOnCompositionStart(value: /* event */ CompositionEvent => Unit): Self[T] = {
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
    def withOnCompositionStartCapture(value: /* event */ CompositionEvent => Unit): Self[T] = {
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
    def withOnCompositionUpdate(value: /* event */ CompositionEvent => Unit): Self[T] = {
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
    def withOnCompositionUpdateCapture(value: /* event */ CompositionEvent => Unit): Self[T] = {
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
    def withOnContextMenu(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnContextMenuCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnCopy(value: /* event */ ClipboardEvent => Unit): Self[T] = {
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
    def withOnCopyCapture(value: /* event */ ClipboardEvent => Unit): Self[T] = {
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
    def withOnCut(value: /* event */ ClipboardEvent => Unit): Self[T] = {
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
    def withOnCutCapture(value: /* event */ ClipboardEvent => Unit): Self[T] = {
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
    def withOnDblClick(value: /* event */ MouseEvent => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblClickCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblClickCapture: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragEnd(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragEndCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragEnter(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragEnterCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragExit(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragExitCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragLeave(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragLeaveCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragOver(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragOverCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragStart(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDragStartCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDrop(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnDropCapture(value: /* event */ DragEvent => Unit): Self[T] = {
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
    def withOnError(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnErrorCapture(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnFocus(value: /* event */ FocusEvent => Unit): Self[T] = {
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
    def withOnFocusCapture(value: /* event */ FocusEvent => Unit): Self[T] = {
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
    def withOnGotPointerCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnGotPointerCaptureCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnInput(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnInputCapture(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnInvalid(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnInvalidCapture(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self[T] = {
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
    def withOnKeyDownCapture(value: /* event */ KeyboardEvent => Unit): Self[T] = {
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
    def withOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self[T] = {
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
    def withOnKeyPressCapture(value: /* event */ KeyboardEvent => Unit): Self[T] = {
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
    def withOnKeyUp(value: /* event */ KeyboardEvent => Unit): Self[T] = {
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
    def withOnKeyUpCapture(value: /* event */ KeyboardEvent => Unit): Self[T] = {
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
    def withOnLoad(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnLoadCapture(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnLostPointerCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnLostPointerCaptureCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnMouseDown(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseDownCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseEnter(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseLeave(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseMove(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseMoveCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseOut(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseOutCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseOver(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseOverCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseUp(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnMouseUpCapture(value: /* event */ MouseEvent => Unit): Self[T] = {
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
    def withOnPaste(value: /* event */ ClipboardEvent => Unit): Self[T] = {
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
    def withOnPasteCapture(value: /* event */ ClipboardEvent => Unit): Self[T] = {
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
    def withOnPointerCancel(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerDown(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerEnter(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerLeave(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerMove(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerOut(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerOutCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerOver(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerOverCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerUp(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self[T] = {
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
    def withOnReset(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnResetCapture(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnScroll(value: /* event */ UIEvent => Unit): Self[T] = {
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
    def withOnScrollCapture(value: /* event */ UIEvent => Unit): Self[T] = {
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
    def withOnSubmit(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnSubmitCapture(value: /* event */ Event => Unit): Self[T] = {
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
    def withOnTouchCancel(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTouchCancelCapture(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTouchEnd(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTouchEndCapture(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTouchMove(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTouchMoveCapture(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTouchStart(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTouchStartCapture(value: /* event */ TouchEvent => Unit): Self[T] = {
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
    def withOnTransitionEnd(value: /* event */ TransitionEvent => Unit): Self[T] = {
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
    def withOnTransitionEndCapture(value: /* event */ TransitionEvent => Unit): Self[T] = {
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
    def withOnWheel(value: /* event */ WheelEvent => Unit): Self[T] = {
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
    def withOnWheelCapture(value: /* event */ WheelEvent => Unit): Self[T] = {
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
    @scala.inline
    def withRef(value: /* elm */ js.UndefOr[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withSlot(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(js.undefined)
        ret
    }
  }
  
}

