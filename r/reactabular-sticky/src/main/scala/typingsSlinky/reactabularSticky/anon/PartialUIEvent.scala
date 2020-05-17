package typingsSlinky.reactabularSticky.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.UIEvent> */
@js.native
trait PartialUIEvent extends js.Object {
  var AT_TARGET: js.UndefOr[Double] = js.native
  var BUBBLING_PHASE: js.UndefOr[Double] = js.native
  var CAPTURING_PHASE: js.UndefOr[Double] = js.native
  var NONE: js.UndefOr[Double] = js.native
  var bubbles: js.UndefOr[Boolean] = js.native
  var cancelBubble: js.UndefOr[Boolean] = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  var composed: js.UndefOr[Boolean] = js.native
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.native
  var currentTarget: js.UndefOr[EventTarget] = js.native
  var defaultPrevented: js.UndefOr[Boolean] = js.native
  var detail: js.UndefOr[Double] = js.native
  var eventPhase: js.UndefOr[Double] = js.native
  var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.native
  var isTrusted: js.UndefOr[Boolean] = js.native
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  var returnValue: js.UndefOr[Boolean] = js.native
  var srcElement: js.UndefOr[EventTarget] = js.native
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.native
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
  var target: js.UndefOr[EventTarget] = js.native
  var timeStamp: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var view: js.UndefOr[Window] = js.native
  var which: js.UndefOr[Double] = js.native
}

object PartialUIEvent {
  @scala.inline
  def apply(): PartialUIEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUIEvent]
  }
  @scala.inline
  implicit class PartialUIEventOps[Self <: PartialUIEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAT_TARGET(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AT_TARGET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAT_TARGET: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AT_TARGET")(js.undefined)
        ret
    }
    @scala.inline
    def withBUBBLING_PHASE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUBBLING_PHASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBUBBLING_PHASE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUBBLING_PHASE")(js.undefined)
        ret
    }
    @scala.inline
    def withCAPTURING_PHASE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAPTURING_PHASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCAPTURING_PHASE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAPTURING_PHASE")(js.undefined)
        ret
    }
    @scala.inline
    def withNONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNONE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBubble")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withComposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composed")(js.undefined)
        ret
    }
    @scala.inline
    def withComposedPath(value: () => js.Array[EventTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composedPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComposedPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composedPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPrevented: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(js.undefined)
        ret
    }
    @scala.inline
    def withDetail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(js.undefined)
        ret
    }
    @scala.inline
    def withInitEvent(value: /* type */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrusted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcElement(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcElement")(js.undefined)
        ret
    }
    @scala.inline
    def withStopImmediatePropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopImmediatePropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withWhich(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhich: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(js.undefined)
        ret
    }
  }
  
}

