package typingsSlinky.eventTargetShim.anon

import typingsSlinky.eventTargetShim.mod.EventTarget.EventDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<event-target-shim.event-target-shim.Event, event-target-shim.event-target-shim.EventTarget.OmittableEventKeys>> */
@js.native
trait PartialPickEventOmittable[TEvents /* <: EventDefinition */] extends js.Object {
  var AT_TARGET: js.UndefOr[Double] = js.native
  var BUBBLING_PHASE: js.UndefOr[Double] = js.native
  var CAPTURING_PHASE: js.UndefOr[Double] = js.native
  var NONE: js.UndefOr[Double] = js.native
  var bubbles: js.UndefOr[Boolean] = js.native
  var cancelBubble: js.UndefOr[Boolean] = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  var composed: js.UndefOr[Boolean] = js.native
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTargetstandardAddEventListener[TEvents]]]] = js.native
  var currentTarget: js.UndefOr[EventTargetstandardAddEventListener[TEvents]] = js.native
  var defaultPrevented: js.UndefOr[Boolean] = js.native
  var eventPhase: js.UndefOr[Double] = js.native
  var initEvent: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* bubbles */ js.UndefOr[Boolean], 
      /* cancelable */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  var isTrusted: js.UndefOr[Boolean] = js.native
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  var returnValue: js.UndefOr[Boolean] = js.native
  var srcElement: js.UndefOr[js.Any] = js.native
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.native
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
  var target: js.UndefOr[EventTargetstandardAddEventListener[TEvents]] = js.native
  var timeStamp: js.UndefOr[Double] = js.native
}

object PartialPickEventOmittable {
  @scala.inline
  def apply[TEvents](): PartialPickEventOmittable[TEvents] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickEventOmittable[TEvents]]
  }
  @scala.inline
  implicit class PartialPickEventOmittableOps[Self[tevents] <: PartialPickEventOmittable[tevents], TEvents] (val x: Self[TEvents]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvents] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvents]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvents] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvents] with Other]
    @scala.inline
    def withAT_TARGET(value: Double): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AT_TARGET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAT_TARGET: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AT_TARGET")(js.undefined)
        ret
    }
    @scala.inline
    def withBUBBLING_PHASE(value: Double): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUBBLING_PHASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBUBBLING_PHASE: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUBBLING_PHASE")(js.undefined)
        ret
    }
    @scala.inline
    def withCAPTURING_PHASE(value: Double): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAPTURING_PHASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCAPTURING_PHASE: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAPTURING_PHASE")(js.undefined)
        ret
    }
    @scala.inline
    def withNONE(value: Double): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNONE: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbles(value: Boolean): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbles: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelBubble(value: Boolean): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelBubble: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBubble")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withComposed(value: Boolean): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposed: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(js.undefined)
        ret
    }
    @scala.inline
    def withComposedPath(value: () => js.Array[EventTargetstandardAddEventListener[TEvents]]): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composedPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComposedPath: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composedPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTarget(value: EventTargetstandardAddEventListener[TEvents]): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTarget: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPrevented: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPhase(value: Double): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPhase: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(js.undefined)
        ret
    }
    @scala.inline
    def withInitEvent(
      value: (/* type */ String, /* bubbles */ js.UndefOr[Boolean], /* cancelable */ js.UndefOr[Boolean]) => Unit
    ): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInitEvent: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTrusted(value: Boolean): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrusted: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValue: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcElement(value: js.Any): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcElement: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(js.undefined)
        ret
    }
    @scala.inline
    def withStopImmediatePropagation(value: () => Unit): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopImmediatePropagation: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: EventTargetstandardAddEventListener[TEvents]): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self[TEvents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(js.undefined)
        ret
    }
  }
  
}

