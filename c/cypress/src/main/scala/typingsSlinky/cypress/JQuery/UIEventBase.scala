package typingsSlinky.cypress.JQuery

import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region UIEvent
// #region UIEvent
@js.native
trait UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // Event
  @JSName("bubbles")
  var bubbles_UIEventBase: Boolean = js.native
  @JSName("cancelable")
  var cancelable_UIEventBase: Boolean = js.native
  // UIEvent
  @JSName("detail")
  var detail_UIEventBase: Double = js.native
  @JSName("eventPhase")
  var eventPhase_UIEventBase: Double = js.native
  @JSName("originalEvent")
  var originalEvent_UIEventBase: js.UndefOr[UIEvent] = js.native
  @JSName("view")
  var view_UIEventBase: Window = js.native
}

object UIEventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String,
    view: Window
  ): UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class UIEventBaseOps[Self[tdelegatetarget, tdata, tcurrenttarget, ttarget] <: UIEventBase[tdelegatetarget, tdata, tcurrenttarget, ttarget], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: Double): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPhase(value: Double): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: Window): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: UIEvent): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEvent: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(js.undefined)
        ret
    }
  }
  
}

