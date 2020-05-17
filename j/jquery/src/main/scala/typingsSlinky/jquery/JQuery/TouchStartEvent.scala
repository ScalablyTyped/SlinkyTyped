package typingsSlinky.jquery.JQuery

import org.scalajs.dom.raw.TouchList
import org.scalajs.dom.raw.Window
import typingsSlinky.jquery.jqueryStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends TouchEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  @JSName("type")
  var type_TouchStartEvent: touchstart = js.native
}

object TouchStartEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    changedTouches: TouchList,
    ctrlKey: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    targetTouches: TouchList,
    timeStamp: Double,
    touches: TouchList,
    `type`: touchstart,
    view: Window
  ): TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchStartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class TouchStartEventOps[Self[tdelegatetarget, tdata, tcurrenttarget, ttarget] <: TouchStartEvent[tdelegatetarget, tdata, tcurrenttarget, ttarget], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) with Other]
    @scala.inline
    def withType(value: touchstart): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

