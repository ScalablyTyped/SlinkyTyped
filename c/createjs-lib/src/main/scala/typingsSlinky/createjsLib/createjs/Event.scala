package typingsSlinky.createjsLib.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  // properties
  var bubbles: Boolean = js.native
  var cancelable: Boolean = js.native
  var currentTarget: js.Any = js.native
  // other event payloads
  var data: js.Any = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var defaultPrevented: Boolean = js.native
  var delta: Double = js.native
  var error: String = js.native
  var eventPhase: Double = js.native
  var id: String = js.native
  var immediatePropagationStopped: Boolean = js.native
  var item: js.Any = js.native
  var loaded: Double = js.native
  var name: String = js.native
  var next: String = js.native
  var params: js.Any = js.native
  var paused: Boolean = js.native
  var progress: Double = js.native
  var propagationStopped: Boolean = js.native
  var rawResult: js.Any = js.native
  var removed: Boolean = js.native
  var result: js.Any = js.native
  var runTime: Double = js.native
  var src: String = js.native
  var target: js.Any = js.native
  var time: Double = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var timeStamp: Double = js.native
  var total: Double = js.native
  var `type`: String = js.native
  def preventDefault(): Unit = js.native
  def remove(): Unit = js.native
  def set(props: js.Object): Event = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object Event {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: js.Any,
    data: js.Any,
    defaultPrevented: Boolean,
    delta: Double,
    error: String,
    eventPhase: Double,
    id: String,
    immediatePropagationStopped: Boolean,
    item: js.Any,
    loaded: Double,
    name: String,
    next: String,
    params: js.Any,
    paused: Boolean,
    preventDefault: () => Unit,
    progress: Double,
    propagationStopped: Boolean,
    rawResult: js.Any,
    remove: () => Unit,
    removed: Boolean,
    result: js.Any,
    runTime: Double,
    set: js.Object => Event,
    src: String,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    time: Double,
    timeStamp: Double,
    total: Double,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], immediatePropagationStopped = immediatePropagationStopped.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), progress = progress.asInstanceOf[js.Any], propagationStopped = propagationStopped.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), src = src.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImmediatePropagationStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediatePropagationStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagationStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Object => Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopImmediatePropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

